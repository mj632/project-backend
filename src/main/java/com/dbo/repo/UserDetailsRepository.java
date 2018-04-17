package com.dbo.repo;



import org.springframework.data.repository.CrudRepository;

import com.dbo.bean.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {
	
	UserDetails findByUname(String uname);
}
