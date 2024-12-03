package com.spring.aop.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("* com.spring.aop.spring.aop.data.*.*(..))")
    public void dataLayerExecution(){}


    @Pointcut("* com.spring.aop.spring.aop.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("com.spring.aop.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.spring.aop.spring.aop.aspect.CommonJoinPointConfig.dataLayerExecution")
    public void allLayerExecution(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    @Pointcut("within(com.spring.aop.spring.aop.data..*")
    public void withinDataLayerExecution(){}

    @Pointcut("@annotation(com.spring.aop.spring.aop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
