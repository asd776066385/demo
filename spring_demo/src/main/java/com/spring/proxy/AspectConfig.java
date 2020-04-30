package com.spring.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {

    @Pointcut("execution(* com.spring.*.*(..))")
    public void pointcut() {

    }


    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("*****之前*****");
        Object proceed = joinPoint.proceed();
        System.out.println("*****之后*****");
        return proceed;
    }
}
