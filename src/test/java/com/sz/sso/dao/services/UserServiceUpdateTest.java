package com.sz.sso.dao.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sz.sso.dao.impl.UserService;
import com.sz.sso.dao.interfaces.IGeneralDao;
import com.sz.sso.models.User;

public class UserServiceUpdateTest {
	private IGeneralDao<User, Long> userService; 
	private User user;
	private User user2;
	
	@Before
	public void setUp() throws Exception {
		user = new User("Alex", "Sydor", "password hash", "ssss@sss.com");
		user2 = new User("Alex2", "Sydor2", "password hash2", "ssss2@sss.com");
		
		userService = new UserService();
		userService.create(user);
		userService.create(user2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		userService.delete(user);
		userService.delete(user2);
	}


	@Test
	public void test() {
		User user3 = userService.get(user2.getId());
		
		user3.setFirstName("Alexey");
		user3 = userService.update(user3);
		
		assertTrue(user3.equals(user2));
		
		assertNotNull(user3);
	}

}
