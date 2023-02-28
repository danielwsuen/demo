package com.daniel.abc.pack06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
    @Pointcut("execution(* com.daniel.service.DemoService.*(..))")
    public void point() {
    }

    @Before("point()")
    public void before() {
        System.out.println("前置逻辑......");
    }

    @After("point()")
    public void after(){
        System.out.println("后置逻辑......");
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕逻辑1......" + jp.getSignature());
        Object o = jp.proceed();
        System.out.println("环绕逻辑2......" + jp.getSignature());
        return o;
    }
}
