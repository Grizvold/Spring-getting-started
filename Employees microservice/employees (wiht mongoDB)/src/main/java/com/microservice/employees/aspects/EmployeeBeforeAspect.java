package com.microservice.employees.aspects;

import com.microservice.employees.controllers.EmployeeRestController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class EmployeeBeforeAspect {
    private Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);

    @Pointcut("execution(* com.microservice.employees.service.EmployeeService.*(..))")
    public void serviceActivation() {
    }

    @Before("serviceActivation()")
    public void doBeforeService(JoinPoint joinPoint) {
        logger.debug("Aspect @Before service: " + joinPoint.getSignature());
    }
}
