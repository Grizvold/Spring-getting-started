package com.microservice.employees.aspects;

import com.microservice.employees.controllers.EmployeeRestController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class EmployeeBeforeAspect {
    private Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);

//    @Before("execution(* com.microservice.employees.EmployeeRestController.*(..))")
//    public void aspectFunc(JoinPoint joinPoint){
//        logger.debug("inside aspectFunc before: " + joinPoint.getSignature());
//    }
}
