package com.spring.aop.spring.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Around("com.spring.aop.spring.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint joinpoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinpoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}", joinpoint, timeTaken );
    }

}
