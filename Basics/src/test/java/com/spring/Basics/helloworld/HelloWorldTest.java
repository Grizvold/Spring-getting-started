package com.spring.Basics.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void helloWolrdTest() {
        ApplicationContext contextByXML = new ClassPathXmlApplicationContext("helloworld.xml");

        HelloWorld helloWorld = contextByXML.getBean(HelloWorld.class);
        helloWorld.getMessage();
    }
}

