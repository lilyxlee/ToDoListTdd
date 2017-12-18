package com;
/**
 * Created by 139044 on 18/12/17.
*/

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class TodolistApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TodolistApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TodolistApplication.class, args);
    }
}

