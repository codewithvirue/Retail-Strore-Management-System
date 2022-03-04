package com.retailstore.service;


import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.exception.UserNotFoundException;
import com.retailstore.model.UserDetails;
import com.retailstore.repository.IUserDetailsRepository;


@Service
public class UserDetailsServiceImpl implements IUserDetailsService {

	@Autowired
	private IUserDetailsRepository userDetailRepository;

	public UserDetailsServiceImpl(IUserDetailsRepository userDetailRepository) {
		super();
		this.userDetailRepository = userDetailRepository;
	}

	@Override
	public List<UserDetails> getAllUserDetails() {
		// TODO Auto-generated method stub

		return userDetailRepository.findAll();// all the data from the table

	}

	@Override
	public UserDetails addUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		// userDetailRepository.save(userDetails);
		return userDetailRepository.save(userDetails);

	}

	@Override
	public UserDetails updateUserDetails(long id) {
		return null;

		// return userDetailRepository.save(id);

		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteUserDetails(long id) {
		// TODO Auto-generated method stub
		userDetailRepository.deleteById(id);
		return false;

	}

	@Override
	public UserDetails ValidateUserDetails(String username, String password)throws UserNotFoundException {
		// TODO Auto-generated method stub
		List<UserDetails> users = userDetailRepository.findAll();
		Iterator<UserDetails> iterator = users.iterator();
		UserDetails user = null;
		boolean flag = false;
		while (iterator.hasNext()) {
			user = iterator.next();
//			System.out.println(user.getName()+" "+user.getPassword());
//			System.out.println(username+" "+password);
			if (user.getName().equals(username) && user.getPassword().equals(password)) {// userdetails entity
				flag = true;
				break;
			}
		}
		if (flag) {
			return user;
		}
		
		else

			throw new UserNotFoundException("Invalid Username");
			/*return null;*/
	}
	/*
	 * else return "sign-in";
	 */

}

/*
 * 
 * 
 * @Override public UserDetails addUser(UserDetails userDetails) { // TODO
 * Auto-generated method stub
 * 
 * return userDetailRepository.save(userDetails);
 * 
 * }
 * 
 * @Override public void updateUser(long id) {
 * 
 * // TODO Auto-generated method stub
 * 
 * 
 * }
 * 
 * @Override public void deleteUser(long id) {
 * 
 * userDetailRepository.deleteById( id);
 * 
 * 
 * }
 */
