package com.miwang.controller.dashboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author guozq
 * @date 2020-05-31-8:21 下午
 */
@SpringBootApplication(scanBasePackages = "com.miwang")
@MapperScan(basePackages = "com.miwang.repository.core.mapper")
public class DashboardControllerApplication {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(DashboardControllerApplication.class, args);
	}

}
