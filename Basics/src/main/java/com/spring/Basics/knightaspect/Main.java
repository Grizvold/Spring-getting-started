package com.spring.Basics.knightaspect;

import com.spring.Basics.knightaspect.config.KnightConfig;
import com.spring.Basics.knights.BraveKnight;
import com.spring.Basics.knights.Knight;
import com.spring.Basics.knights.RescueDamselQuest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextByXML = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) contextByXML.getBean("knight");
        knight.embarkOnQuest();
        contextByXML.close();

        ApplicationContext contextByAnnotation = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight2 = contextByAnnotation.getBean(Knight.class);
        knight2.embarkOnQuest();

        BraveKnight knight3 = contextByAnnotation.getBean("knight", BraveKnight.class);
        RescueDamselQuest damselQuest = (RescueDamselQuest) contextByAnnotation.getBean("damsel");
        knight3.embarkOnQuest();
        knight3.setQuest(damselQuest);
        knight3.embarkOnQuest();
    }
}
