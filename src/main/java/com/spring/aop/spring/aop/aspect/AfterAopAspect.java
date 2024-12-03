package com.spring.aop.spring.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //weaving and weaver, weaving being the framework weaver is what joins them
    @AfterReturning(
            value = "execution(* com.spring.aop.spring.aop.business.*.*(..))",
            returning="result")
    public void afterReturning(JoinPoint joinpoint, Object result) {
        logger.info("{} returned with value {}", joinpoint , result);
    }

    @AfterThrowing(
            value = "execution(* com.spring.aop.spring.aop.business.*.*(..))",
            throwing="exception")
    public void afterThrowing(JoinPoint joinpoint, Object exception) {
        logger.info("{} Threw exception with value {}", joinpoint , exception);
    }

    @After(value = "execution(* com.spring.aop.spring.aop.business.*.*(..))")
    public void after(JoinPoint joinpoint) {
        logger.info("After execution of {}", joinpoint );
    }
}
