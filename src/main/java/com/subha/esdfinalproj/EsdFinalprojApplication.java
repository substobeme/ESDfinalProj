package com.subha.esdfinalproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
public class EsdFinalprojApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsdFinalprojApplication.class, args);
    }

}
