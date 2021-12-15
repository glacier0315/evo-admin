package com.glacier.evo.sys.mapper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * date 2021-12-15 13:22
 *
 * @author glacier
 * @version 1.0
 */
@SpringBootTest
class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void selectList() {
		userMapper.selectList(null)
				.forEach(System.out::println);
	}
	
	@Test
	void updateDeptByDeptId() {
	}
	
	@Test
	void selectOneByUsername() {
	}
	
	@Test
	void updateProfileByPrimaryKey() {
	}
	
	@Test
	void updateAvatarByPrimaryKey() {
	}
	
	@Test
	void updatePasswordByPrimaryKey() {
	}
	
	@Test
	void checkUsernameExist() {
	}
	
	@Test
	void checkIdCardExist() {
	}
}
