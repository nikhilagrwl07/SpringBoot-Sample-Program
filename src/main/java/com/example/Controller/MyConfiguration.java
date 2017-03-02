package com.example.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nikhilagrawal on 02/03/17.
 */
@Configuration
public class MyConfiguration {

    @Bean
    public String message(){
        return "Hello SprintIntializrController !!!!";
    }
}