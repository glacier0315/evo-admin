package com.glacier.evo.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * date 2021-12-17 15:46
 *
 * @author glacier
 * @version 1.0
 */
@SpringBootTest
class PasswordEncoderTest {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void testEncode() {
		System.out.println(passwordEncoder.encode("admin"));
	}
}
