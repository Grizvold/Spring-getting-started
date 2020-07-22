package com.spring.Basics.knightaspect;

import com.spring.Basics.knightaspect.config.KnightConfig;
import com.spring.Basics.knights.Minstrel;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Aspect
public class KnightBeforeAspect {

    @Autowired
    private Minstrel minstrel;

    @Pointcut("execution(** com.spring.Basics.knights.Knight.embarkOnQuest(..))")
    public void embarkOnQuest() {    }


//    @Before("execution(public void embarkOnQuest())")
    @Before("embarkOnQuest()")
    public void doSomethingBeforeQuest() {
        System.out.println("doing something before embarking on quest");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
//        Minstrel minstrel = (Minstrel) context.getBean(Minstrel.class);
//        minstrel.singBeforeQuest();
        minstrel.singBeforeQuest();
    }

//    @Before("execution(* com.spring.Basics.knights.BraveKnight.*.embark*())")
//    public void doSomethingBeforeAllEmbarks() {
//        System.out.println("do work before any embark");
//    }
}
