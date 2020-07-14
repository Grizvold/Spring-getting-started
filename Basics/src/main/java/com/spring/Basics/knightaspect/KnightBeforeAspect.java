package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.Minstrel;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
public class KnightBeforeAspect {

    @Before("execution(public void embarkOnQuest())")
    public void doSomethingBeforeQuest() {
        System.out.println("doing something before embarking on quest");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Minstrel minstrel = (Minstrel) context.getBean("minstrel");
        minstrel.singBeforeQuest();
    }

    @Before("execution(* com.spring.Basics.knights.BraveKnight.*.embark*())")
    public void doSomethingBeforeAllEmbarks() {
        System.out.println("do work before any embark");
    }
}
