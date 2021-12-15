package com.glacier.evo.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * date 2021-12-15 15:24
 *
 * @author glacier
 * @version 1.0
 */
@Configuration
public class AppConfig {
	
	/**
	 * 密码工具类
	 *
	 * @return 密码工具类
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
