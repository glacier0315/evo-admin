package com.glacier.evo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 2020-02-08 21:07
 * 配置 mybatis-plus
 *
 * @author glacier
 * @version 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.glacier.evo.**.mapper")
public class MybatisConfig {

}
