package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.Minstrel;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
public class KnightAfterAspect {

    @After("execution(public void embarkOnQuest())")
    public void doSomethingAfterQuest() {
        System.out.println("doing something after embarking on quest");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Minstrel minstrel = (Minstrel) context.getBean("minstrel");
        minstrel.singAfterQuest();
    }
}
