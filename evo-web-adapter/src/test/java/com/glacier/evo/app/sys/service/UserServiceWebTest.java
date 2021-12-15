package com.glacier.evo.app.sys.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * date 2021-12-15 15:19
 *
 * @author glacier
 * @version 1.0
 */
@SpringBootTest
class UserServiceWebTest {
	@Autowired
	private UserService userService;
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void testFindList() {
		userService.findList(null)
				.forEach(System.out::println);
	}
}
