package org.j2ee;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice1 {

    @After("execution(* com.test.service.impl.*.*(..))")
    public void printBefore(){
        System.out.println("kkkkkkkkkkkkk");
    }


}
