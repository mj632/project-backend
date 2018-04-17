package com.dbo.controller;

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
	public String logInUserDetails(@RequestBody UserDetails user)
	{
		try
		{
			UserDetails u = uService.logInUserDetails(user);
//			System.out.println("Use Password : "+ u.getUpassword());
			if(u.getUpassword().equals(user.getUpassword()))
			{
				String outputStr = "Welcome back "+user.getUname(); 
				return outputStr;
			}
			else
			{
				return "Incorrect Username or Password!!";
			}
		}catch(Exception e)
		{
			return "Error!!! Erver is down.";
		}
	}
}
