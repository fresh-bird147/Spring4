package com.example.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lfj
 * @create 2022-02-04-9:23
 */

@Component
public class Student {
    @Value("${test.name}")
    static String name;


}
