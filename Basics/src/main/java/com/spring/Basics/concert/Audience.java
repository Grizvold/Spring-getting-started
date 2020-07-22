package com.spring.Basics.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    //marker that gives @Pointcut something to attach itself to
    @Pointcut("execution(** com.spring.Basics.concert.Performance.perform(..))")
    public void performance() {    }

//    @Before("execution(** com.spring.Basics.concert.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

//    @Before("execution(** com.spring.Basics.concert.Performance.perform(..))")
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

//    @AfterReturning("execution(** com.spring.Basics.concert.Performance.perform(..))")
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!!");
    }

//    @AfterThrowing("execution(** com.spring.Basics.concert.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try{
            System.out.println("\nSilencing phones");
            System.out.println("Sitting down");
            joinPoint.proceed();
            System.out.println("applause\n");
        } catch (Throwable e) {
            System.out.println("Refund!");
        }
    }
}
