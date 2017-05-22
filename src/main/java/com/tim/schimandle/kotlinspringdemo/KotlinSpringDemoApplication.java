package com.tim.schimandle.kotlinspringdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

/**
 * Created by tschi on 5/21/2017.
 */
@SpringBootApplication
public class KotlinSpringDemoApplication extends RepositoryRestMvcAutoConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(KotlinSpringDemoApplication.class, args);
    }
}
