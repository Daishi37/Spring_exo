package com.example.demo;

import models.Developper;
import models.House;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext cxt =
                new ClassPathXmlApplicationContext("Spring-beans.xml");
        House house = (House) cxt.getBean("houseBean1");
        System.out.println(house.getOwner());
        System.out.println(house.getAddress());

        ApplicationContext cxt2 =
                new ClassPathXmlApplicationContext("Spring-beans.xml");
        Developper developper = (Developper) cxt2.getBean("developerBean");
        System.out.println(developper.getName());
        
        

        
    }

}

