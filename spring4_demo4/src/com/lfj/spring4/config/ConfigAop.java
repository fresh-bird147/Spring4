package com.lfj.spring4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lfj
 * @create 2022-01-20-9:09
 */


@Configuration      //配置类
@ComponentScan(basePackages = {"com.lfj"})      //开启组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
