package com.lfj.spring4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lfj
 * @create 2022-01-19-8:23
 */
@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages ={"com.lfj.spring4"} )
public class SpringConfig {

}
