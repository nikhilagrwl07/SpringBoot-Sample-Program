package com.example.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootConfiguration
@EnableAutoConfiguration
//@ComponentScan
//@EnableConfigurationProperties
//@EnableConfigServer
@RestController
public class AutoConfigurationExampleApplication {

	@RequestMapping("/autoConfiguration/")
	public String home(){
		return "Hello World";
	}

//	@Autowired
//	void setEnvironment(Environment environment){
//		System.out.println("setting environment " + environment.getProperty("configuration.projectName"));
//	}
	public static void main(String[] args) {
		SpringApplication.run(AutoConfigurationExampleApplication.class, args);
	}
}
