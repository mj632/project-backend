package com.dbo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbo.bean.UserDetails;
import com.dbo.repo.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	@Autowired
	private UserDetailsRepository udRepo;
	
	public Map<String,String> signUpUser(UserDetails user)
	{
		Map<String, String> map = new HashMap<String, String>();
		try
		{
			udRepo.save(user);
			map.put("status","user added");
			return map;
		}
		catch(Exception e)
		{
			map.put("error",e.toString());
			return map;
		}		
	}
	
	public UserDetails logInUserDetails(UserDetails user)
	{
		try
		{
			return udRepo.findByUname(user.getUname());
		}catch(Exception e)
		{
			return null;
		}
	}

}
