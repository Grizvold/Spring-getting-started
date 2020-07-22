package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.Minstrel;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
public class KnightAfterAspect {

    @Autowired
    Minstrel minstrel;

    @Pointcut("execution(** com.spring.Basics.knights.Knight.embarkOnQuest(..))")
    public void embarkOnQuest() {    }

    @AfterReturning("embarkOnQuest()")
    public void doSomethingAfterQuest() {
        System.out.println("doing something after embarking on quest");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
//        Minstrel minstrel = (Minstrel) context.getBean("minstrel");
//        minstrel.singAfterQuest();

        minstrel.singAfterQuest();
    }
}