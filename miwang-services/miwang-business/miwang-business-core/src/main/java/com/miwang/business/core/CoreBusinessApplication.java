package com.miwang.business.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guozq
 * @date 2020-05-31-4:55 下午
 */
@SpringBootApplication
@MapperScan(basePackages = "com.miwang.repository.core.mapper")
public class CoreBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreBusinessApplication.class, args);
	}

}
