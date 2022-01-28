package com.lfj.spring4.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lfj
 * @create 2022-01-27-16:21
 */
public class UserLog {

    private static final Logger log= LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j");
        log.warn("hello log4j");
    }
}
