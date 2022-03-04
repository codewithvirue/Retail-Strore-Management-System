package com.retailstore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.retailstore.model.UserDetails;
import com.retailstore.service.IUserDetailsService;

@SpringBootTest
class RetailStroreManagementSystemApplicationTests {

	@Autowired
	private IUserDetailsService userDetailsService;
	
	
	/*
	 * @MockBean private IUserDetailsRepository repository;
	 */

	
	
	/*
	 * @Test void contextLoads() { }
	 */
	
	@Test
	public void saveUserRetTest() {
System.out.println("******");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setName("Pavitra");
		userDetails.setPassword("12345");
		userDetails.setRole("Retailer");
		assertNotNull(userDetailsService.addUserDetails(userDetails));
	}

	private void assertNotNull(UserDetails addUserDetails) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void saveUsersCusTest() {
System.out.println("******");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setName("Haleema");
		userDetails.setPassword("12346");
		userDetails.setRole("Customer");
		assertNotNull(userDetailsService.addUserDetails(userDetails));
	}
	@Test
	public void saveUserSupTest() {
		System.out.println("******");
				
				UserDetails userDetails = new UserDetails();
				userDetails.setName("Zareena");
				userDetails.setPassword("12347");
				userDetails.setRole("Supplier");
				assertNotNull(userDetailsService.addUserDetails(userDetails));
			}


}

