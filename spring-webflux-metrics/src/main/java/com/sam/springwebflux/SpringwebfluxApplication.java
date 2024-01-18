package com.sam.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class SpringwebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxApplication.class, args);
	}



}
