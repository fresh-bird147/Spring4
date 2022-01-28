package com.lfj.spring4;

/**
 * @author lfj
 * @create 2022-01-19-9:08
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行");
        return id;
    }
}
