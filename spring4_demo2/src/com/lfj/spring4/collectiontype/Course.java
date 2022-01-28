package com.lfj.spring4.collectiontype;

/**
 * @author lfj
 * @create 2022-01-16-11:14
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
