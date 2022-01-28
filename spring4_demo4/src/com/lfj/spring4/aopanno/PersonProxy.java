package com.lfj.spring4.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author lfj
 * @create 2022-01-19-17:32
 */

@Component
@Aspect
@Order(1)       //order设置优先级别
public class PersonProxy {

    //后置通知
    @Before(value = "execution(* com.lfj.spring4.aopanno.User.add(..))")
    public void AfterReturning(){
        System.out.println("Person Before....");
    }
}
