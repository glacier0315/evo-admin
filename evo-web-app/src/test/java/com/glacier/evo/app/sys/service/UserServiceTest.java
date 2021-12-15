package com.glacier.evo.app.sys.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * date 2021-12-15 15:19
 *
 * @author glacier
 * @version 1.0
 */
@SpringBootTest
class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void findById() {
	}
	
	@Test
	void findUserByUsername() {
	}
	
	@Test
	void findUserInfoByUsername() {
	}
	
	@Test
	void findUserProfileByUsername() {
	}
	
	@Test
	void loadUserByUsername() {
	}
	
	@Test
	void findPage() {
	}
	
	@Test
	void findList() {
		userService.findList(null)
				.forEach(System.out::println);
	}
	
	@Test
	void save() {
	}
	
	@Test
	void testSave() {
	}
	
	@Test
	void delete() {
	}
	
	@Test
	void resetPassword() {
	}
	
	@Test
	void updatePassword() {
	}
	
	@Test
	void updateProfile() {
	}
	
	@Test
	void updateAvatar() {
	}
	
	@Test
	void checkUsername() {
	}
	
	@Test
	void checkIdCard() {
	}
}
