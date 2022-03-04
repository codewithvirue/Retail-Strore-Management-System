package com.retailstore.repository;

import com.retailstore.model.UserDetails;

public interface IUserDetailsRepositoryCustom {
	public UserDetails findUser(String username,String password);

}
