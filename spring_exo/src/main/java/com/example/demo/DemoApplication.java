package com.example.demo;

import bean.Person;
import bean.Custom;
import models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
//@ComponentScan("models")
public class DemoApplication {

    public static void main(String[] args) {

      SpringApplication.run(DemoApplication.class, args);

        ApplicationContext cxt =
                new ClassPathXmlApplicationContext("Spring-beans.xml");
        House house = (House) cxt.getBean("houseBean");
        System.out.println(house);

//        ApplicationContext cxt2 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Developer developer = (Developer) cxt2.getBean("developerBean");
//        System.out.println(developer.getName());
//
//        ApplicationContext cxt3 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Developer developer2 = (Developer) cxt3.getBean("productManagerBean");
//        System.out.println(developer2.getName());
//
//        ApplicationContext cxt4 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Company company = (Company) cxt4.getBean("companyBean");
//        System.out.println(company.getName());
//
//        ApplicationContext cxt5 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Service service = (Service) cxt5.getBean("serviceBean");
//        System.out.println(service.getMessage());
//
//        ApplicationContext cxt6 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Service service2 = (Service) cxt6.getBean("service2Bean");
//        System.out.println(service2.getMessage());
//
//        ApplicationContext cxt7 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Address address = (Address) cxt7.getBean("addressBean");
//        System.out.println(address.getAddress());
//
//        ApplicationContext cxt8 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Customer customer = (Customer) cxt8.getBean("customerBean");
//        System.out.println(customer);
//
//        ApplicationContext cxt9 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        KungFu kungFu = (KungFu) cxt9.getBean("kungFuBean");
//        System.out.println(kungFu);
//
//        ApplicationContext cxt10 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Panda panda = (Panda) cxt10.getBean("pandaBean");
//        System.out.println(panda.getKungFu());
//
//        ApplicationContext cxt11 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Person person = (Person) cxt11.getBean("personBean");
//        System.out.println(person);
//
//        ApplicationContext cxt12 =
//                new ClassPathXmlApplicationContext("Spring-beans.xml");
//        Custom customer1 = (Custom) cxt12.getBean("custom");
//        System.out.println(customer1);

    }

}

