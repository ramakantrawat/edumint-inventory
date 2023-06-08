package com.example.demo.config;

import com.example.demo.service.TestClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.inject.Singleton;

@Configuration
public class Config {
    @Bean
    public RestTemplate  getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    @Singleton
    public TestClass getTestClass(){
        return new TestClass();
    }
}


