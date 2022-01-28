package com.lfj.spring4;

/**
 * @author lfj
 * @create 2022-01-15-15:04
 */
public class Orders {
    private String oname;
    private String address;

    //有参构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderTest(){
        System.out.println(oname+"::"+address);
    }
}
