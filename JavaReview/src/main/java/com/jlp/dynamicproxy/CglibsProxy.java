package com.jlp.dynamicproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibsProxy {


    static class Cls {

        public String getStr() {
            return null;
        }

        public void doSth(int idxs) {
            System.out.println("do sth");
        }
    }

    static class TestProxy implements MethodInterceptor {

        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("before action");
            Object res = methodProxy.invokeSuper(o, objects);
            System.out.println("afterAction");
            return res;
        }
    }

    public static void main(String[] args) {
        TestProxy proxy = new TestProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(proxy);
        //设置被代理的父类class
        enhancer.setSuperclass(Cls.class);
        //根据字节码技术动态创建子类实例
        Cls pro = (Cls) enhancer.create();
        pro.doSth(3);

    }
}
