package com.miwang.repository.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guozq
 * @date 2020-05-31-3:30 下午
 */
@SpringBootApplication
@MapperScan(basePackages = "com.miwang.repository.core.mapper")
public class CoreRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreRepositoryApplication.class, args);
	}

}
