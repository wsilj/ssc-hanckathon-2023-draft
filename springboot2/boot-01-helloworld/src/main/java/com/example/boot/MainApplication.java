package com.example.boot;

import com.example.boot.config.MyConfig;
import com.example.boot.entity.Pet;
import com.example.boot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=========================================================================");
        // 3. get components from container
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("component is singleton: " + (tom02 == tom01));

        // 4.
        MyConfig myConfig = run.getBean(MyConfig.class);
        System.out.println(myConfig);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("User's pet: " + (user01.getPet() == tom));

    }

}
