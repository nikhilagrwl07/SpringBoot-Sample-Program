package com.example.Controller;

/**
 * Created by nikhilagrawal on 02/03/17.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SprintIntializrController {

    @Value("${name}")
    String name;

    @Autowired
    String message;

    @RequestMapping("/test/springIntilzer")
    public String home(){
        return message + " - " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(SprintIntializrController.class, args);
    }
}
