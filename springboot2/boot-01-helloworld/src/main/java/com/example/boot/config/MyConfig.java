package com.example.boot.config;

import com.example.boot.entity.Pet;
import com.example.boot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(proxyBeanMethods = true)
public class MyConfig {

    @Bean
    public User user01() {

        User gavin = new User("Zhangsan", 22);
        gavin.setPet(tomcatPet());
        return gavin;

    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

}
