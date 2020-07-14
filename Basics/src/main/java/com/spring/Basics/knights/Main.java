package com.spring.Basics.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextByAnnotation = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight2 = (Knight) contextByAnnotation.getBean(Knight.class);
        knight2.embarkOnQuest();
        contextByAnnotation.close();

        ClassPathXmlApplicationContext contextByXML = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight) contextByXML.getBean("knight");
        knight.embarkOnQuest();
        contextByXML.close();
    }
}
