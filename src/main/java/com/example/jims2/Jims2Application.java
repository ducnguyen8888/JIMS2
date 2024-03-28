package com.example.jims2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class Jims2Application {

    public static void main(String[] args) {
        SpringApplication.run(Jims2Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
            return runner -> { System.out.println("Hello World");
        };
    }
}
