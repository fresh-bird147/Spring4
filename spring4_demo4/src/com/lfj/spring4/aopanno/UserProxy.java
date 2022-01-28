package com.lfj.spring4.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author lfj
 * @create 2022-01-19-15:23
 */
//增强的类
@Component
@Aspect     //生成代理对象
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.lfj.spring4.aopanno.User.add(..))")
    public void pointdemo(){

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before....");
    }

    //后置通知
    @AfterReturning(value = "execution(* com.lfj.spring4.aopanno.User.add(..))")
    public void AfterReturning(){
        System.out.println("afterReturning....");
    }

    @After(value = "execution(* com.lfj.spring4.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.lfj.spring4.aopanno.User.add(..))")
    public void AfterThrowing(){
        System.out.println("AfterThrowing....");
    }

    @Around(value = "execution(* com.lfj.spring4.aopanno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前....");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后....");
    }

}
