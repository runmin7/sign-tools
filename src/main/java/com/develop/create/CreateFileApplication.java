package com.develop.create;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.develop.create.storage.StorageProperties;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class CreateFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateFileApplication.class, args);
	}

}
