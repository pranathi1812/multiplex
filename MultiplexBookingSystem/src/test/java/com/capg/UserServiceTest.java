package com.capg;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capg.entity.User;

import com.capg.repository.UserRepository;
import com.capg.service.UserService;

public class UserServiceTest {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private UserRepository repository;
	
//	@Test
//	public void testGetAllUsers() throws Exception {
//		User u = new User(1,"Alekhya","ale@gmail.com",799,'F',"ale@20001");
//		repository.save(u);
//		assertNotNull(userservice.getAllUsers().size());
//		repository.delete(u);
//		
//	}

}
