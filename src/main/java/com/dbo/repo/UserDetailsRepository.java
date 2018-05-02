package com.dbo.repo;



//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;

import com.dbo.bean.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {
	
//	@Query("SELECT user FROM UserDetails user WHERE  user.uname = :uname")
	UserDetails findByUname(String uname);
}
