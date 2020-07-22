package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.Minstrel;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class KnightAroundAspect {

    @Autowired
    private Minstrel minstrel;

    @Pointcut("execution(** com.spring.Basics.knights.Knight.embarkOnQuest(..))")
    public void embarkOnQuest() {    }

    @Around("embarkOnQuest()")
    public void aroundEmbarkingOnQuest(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("\nMinstrel performance start: ");
            minstrel.singBeforeQuest();
            System.out.println("Knight starts quest");
            proceedingJoinPoint.proceed();
            System.out.println("Knight finishes quest");
            System.out.println("Minstrel performance end: ");
            minstrel.singAfterQuest();
            System.out.println("\n");
        } catch (Throwable throwable) {
            System.out.println("Failed to finish quest!");
        }
    }
}
