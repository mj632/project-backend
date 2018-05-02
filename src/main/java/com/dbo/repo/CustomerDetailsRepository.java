package com.dbo.repo;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dbo.bean.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, String>{

//	@Query("SELECT customer_details FROM CustomerDetails customer WHERE customer.user.uname = :uname")
//	CustomerDetails findDetialsByID(@Param("uname") String uname);

//	@Modifying(clearAutomatically = true)
//	@Query("UPDATE customer_details SET fname=:customer.fname, lname=:customer.lname, dob=:customer.dob, email=:customer.email WHERE customer.user.uname = :uname")
//	Map<String, String> updateCustomerDetails(@Param("uname") String uname, @Param("customer_details")CustomerDetails customer);
	
}
