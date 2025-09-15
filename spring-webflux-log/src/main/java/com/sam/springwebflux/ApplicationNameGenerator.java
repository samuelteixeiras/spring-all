package com.sam.springwebflux;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.UUID;

@Component
public class ApplicationNameGenerator implements ApplicationRunner {

    private final ConfigurableEnvironment environment;

    public ApplicationNameGenerator(ConfigurableEnvironment environment) {
        this.environment = environment;
    }

    @Override
    public void run(ApplicationArguments args) {
        String randomName = "myapp-" + UUID.randomUUID().toString().substring(0, 8);
        environment.getSystemProperties().put("spring.application.name", randomName);
    }
}

