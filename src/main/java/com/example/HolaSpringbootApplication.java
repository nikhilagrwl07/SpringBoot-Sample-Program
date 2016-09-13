package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties
@EnableConfigServer
public class HolaSpringbootApplication {

//	@Value("${configuration.projectName}")
//	void setProjectName(String projectName){
//		System.out.println("setting project name: " + projectName);
//	}

//    @Value("${configuration.author}")
//    void setAuthor(String author){
//        System.out.println("setting author: " + author);
//    }

//	@Autowired
//	void setEnvironment(Environment environment){
//		System.out.println("setting environment " + environment.getProperty("configuration.projectName"));
//	}

	@Autowired
	void setConfiguredProjectProperties(ConfigurationProjectProperties configuredProjectProperties){
        System.out.println("configuredProjectProperties.projectName "+configuredProjectProperties.getProjectName());
    }

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringbootApplication.class, args);
	}
}

@Component
@ConfigurationProperties(prefix = "configuration")
class ConfigurationProjectProperties{
    private String projectName;
    private String author;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
