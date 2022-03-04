package com.retailstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailstore.model.UserDetails;


@Repository

public interface IUserDetailsRepository extends JpaRepository<UserDetails, Long> {
	
	
	
	 
	 
	 
}

