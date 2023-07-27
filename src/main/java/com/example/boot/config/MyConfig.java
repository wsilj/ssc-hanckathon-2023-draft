package com.example.boot.config;

import com.example.boot.entity.User;
import com.example.boot.entity.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(proxyBeanMethods = true)
public class MyConfig {

    @Bean
    public User user01() {

        User gavin = new User("Gavin", 27);
        gavin.setPet(tomcatPet());
        return gavin;

    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

}
