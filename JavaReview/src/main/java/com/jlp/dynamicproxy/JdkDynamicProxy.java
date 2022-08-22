package com.jlp.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy {


    interface Intr {
        String getStr();

        void doSth(int idxs);
    }

    static class Cls implements Intr {

        public String getStr() {
            return null;
        }

        public void doSth(int idxs) {
            System.out.println("do sth");
        }
    }

    static class MyInvocationHandler implements InvocationHandler {
        Intr obj;

        MyInvocationHandler(Intr obj) {
            obj = obj;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before action");
            Object res = method.invoke(obj, args);
            System.out.println("afterAction");
            return res;
        }
    }

    public static void main(String[] args) {
        Intr proxy = (Intr) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[] {Intr.class},
                new MyInvocationHandler(new Cls()));
        proxy.doSth(100);
    }
}
