package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextByXML = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) contextByXML.getBean("knight");
        knight.embarkOnQuest();
        contextByXML.close();

//        ApplicationContext contextByAnnotation = new AnnotationConfigApplicationContext(KnightConfig.class);
//        Knight knight2 = contextByAnnotation.getBean(Knight.class);
//        knight2.embarkOnQuest();
    }
}
