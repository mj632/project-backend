package com.dbo.service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbo.bean.CustomerDetails;
import com.dbo.repo.CustomerDetailsRepository;

@Service
public class CustomerDetailsService {
	
	@Autowired
	private CustomerDetailsRepository custRepo;
	
//	public CustomerDetails findCustomerDetails(String uname)
//	{
//		return custRepo.findDetialsByID(uname);
//	}

	public Map<String, String> updateDetails(CustomerDetails customer) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		try
		{
			custRepo.save(customer);
			map.put("status", "success");
			return map;
		}catch(Exception e)
		{
			map.put("status", "error");
			return map;
		}
	}

}
