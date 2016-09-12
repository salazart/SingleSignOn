/**
 * 
 */
package com.sz.sso.dao.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sz.sso.dao.interfaces.IGeneralDao;
import com.sz.sso.models.User;

/**
 * @author Sanya
 *
 */
public class UserServiceTest {
	private IGeneralDao<User> userService; 
	private User user;
	private User user2;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		user = new User("Alex", "Sydor", "password hash");
		user2 = new User("Alex2", "Sydor2", "password hash2");
		
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
		List<User> users = userService.getAll();
		
		assertNotNull(users);
		
		assertFalse(users.isEmpty());
	}
}
