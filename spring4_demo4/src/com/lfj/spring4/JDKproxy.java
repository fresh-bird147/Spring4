package com.lfj.spring4;


import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author lfj
 * @create 2022-01-19-9:09
 */
public class JDKproxy {
    //创建接口实现类代理对象
   /* Class[] interfaces={UserDao.class};
    Proxy.newProxyInstance(JDKproxy.class.getClassLoader(),interfaces,new InvocationHandler(){

    });*/
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        Class[] interfaces={UserDao.class};

        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKproxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println(add);
        String abc = dao.update("abc");
        System.out.println(abc);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {
    //1 传递需代理的对象
    private Object object;

    public UserDaoProxy(Object object){
        this.object = object;
    }
    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------before-------"+method.getName()+":传递的参数："+ Arrays.toString(args));

        Object invoke = method.invoke(object, args);

        System.out.println("---------after-------"+object);

        return invoke;
    }
}
