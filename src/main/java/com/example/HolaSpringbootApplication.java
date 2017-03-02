package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties
@EnableConfigServer
public class HolaSpringbootApplication {
	@Autowired
	void setEnvironment(Environment environment){
		System.out.println("setting environment " + environment.getProperty("configuration.projectName"));
	}
	public static void main(String[] args) {
		SpringApplication.run(HolaSpringbootApplication.class, args);
	}
}
