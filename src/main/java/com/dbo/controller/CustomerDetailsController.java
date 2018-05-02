package com.dbo.controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbo.bean.CustomerDetails;
import com.dbo.bean.UserDetails;
import com.dbo.repo.UserDetailsRepository;
import com.dbo.service.CustomerDetailsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsService custServ;
	@Autowired
	UserDetailsRepository userDetailsRepo;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value="/update-customer-profile", method=RequestMethod.POST)
	public Map<String, String> updateDetails(@Valid @RequestBody CustomerDetails customer)
	{
		String uname = getUserAgent();
		UserDetails user = userDetailsRepo.findByuname(uname);
		customer.setUser(user);
		
		return custServ.updateDetails(customer);
	}
	
	private String getUserAgent() 
	{
		System.out.println(request.getHeader("user-name"));
        return request.getHeader("user-name");
    }

	
}
