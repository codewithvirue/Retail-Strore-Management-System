package com.retailstore.service;

import java.util.List;

import com.retailstore.exception.UserNotFoundException;
import com.retailstore.model.UserDetails;

public interface IUserDetailsService {
	
	 List<UserDetails> getAllUserDetails();
		// TODO Auto-generated method stub
	public UserDetails addUserDetails(UserDetails userDetails);
	
	public UserDetails ValidateUserDetails(String username,String password)throws UserNotFoundException;
	public UserDetails updateUserDetails(long id);
	public boolean deleteUserDetails(long id);

}
