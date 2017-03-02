package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootConfiguration

//@ComponentScan
//@EnableConfigurationProperties
//@EnableConfigServer
@RestController
@EnableAutoConfiguration
public class ManualConfigurationExampleApplication {

	@RequestMapping("/manualConfiguration/")
	public String home(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(ManualConfigurationExampleApplication.class, args);
	}
}
