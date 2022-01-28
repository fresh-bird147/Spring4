package com.lfj.spring4.bean;

/**
 * @author lfj
 * @create 2022-01-16-10:06
 */

//部门类
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{"+
                "dname='"+dname+'\''+
                ')';
    }
}
