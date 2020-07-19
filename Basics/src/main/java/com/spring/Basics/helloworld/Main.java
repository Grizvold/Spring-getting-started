package com.spring.Basics.helloworld;

import com.spring.Basics.helloworld.config.HelloWorldConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextByXML = new ClassPathXmlApplicationContext("helloworld.xml");
        ApplicationContext contextByAnnotation = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = contextByXML.getBean(HelloWorld.class);
        helloWorld.getMessage();

        HelloWorld helloWorld1 = contextByAnnotation.getBean(HelloWorld.class);
        helloWorld1.setMessage("test Hello");
        helloWorld1.getMessage();
    }
}
