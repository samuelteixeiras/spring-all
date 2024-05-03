package com.sam.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringwebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxApplication.class, args);
	}

	@Bean
	public NettyServerCustomizer nettyServerCustomizer(){
		return httpServer -> httpServer.metrics(true, Function.identity());
	}
}
