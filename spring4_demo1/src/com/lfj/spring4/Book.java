package com.lfj.spring4;

/**
 * @author lfj
 * @create 2022-01-15-14:06
 */
public class Book {
    //创建属性
    private  String bname;
    private  String bauthor;

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauthor);
    }

}
