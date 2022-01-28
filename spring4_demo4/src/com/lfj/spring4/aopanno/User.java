package com.lfj.spring4.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author lfj
 * @create 2022-01-19-15:22
 */
//被增强的类
@Component
public class User {
    public void add() {
        System.out.println("add....");
    }
}
