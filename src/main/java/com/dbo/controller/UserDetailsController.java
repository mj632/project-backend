package com.dbo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbo.bean.UserDetails;
import com.dbo.service.UserDetailsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetailsService uService;
	
	@RequestMapping("/")
	public String welcome()
	{
		return "Testing App!!";
	}
	
	@RequestMapping(value="/sign-up", method=RequestMethod.POST)
	public Map<String,String> signUpUser(@RequestBody UserDetails user)
	{
		return uService.signUpUser(user);
	}
	
	@RequestMapping(value="/sign-in", method=RequestMethod.POST)
	public Map<String,String> logInUserDetails(@RequestBody UserDetails user)
	{
		Map<String,String> map = new HashMap<String, String>();
		try
		{
			UserDetails u = uService.logInUserDetails(user);
			String upass = u.getUpassword();
//			System.out.println("Password is : "+upass+"\n\n");
			if(upass.equals(user.getUpassword()))
			{
				map.put("status","success");
				return map;
			}
			else
			{
				map.put("status","failed");
				return map;
			}
		}catch(Exception e)
		{
			map.put("status","Error!!! Server is down.");
			return map;
			
		}
	}
}
