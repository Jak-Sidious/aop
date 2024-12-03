package com.spring.aop.spring.aop.aspect;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //weaving and weaver, weaving being the framework weaver is what joins them
    @Before("com.spring.aop.spring.aop.aspect.CommonJoinPointConfig.dataLayerExecution")
    public void before(JoinPoint joinpoint) {
        //advice
        logger.info("Intercepted a method call - {}", joinpoint);
    }
}
