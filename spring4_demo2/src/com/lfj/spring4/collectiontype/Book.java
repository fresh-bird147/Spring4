package com.lfj.spring4.collectiontype;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @author lfj
 * @create 2022-01-16-11:24
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }

}
