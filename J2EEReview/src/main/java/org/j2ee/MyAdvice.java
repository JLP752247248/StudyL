package org.j2ee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice{

    @Before("execution(* com.test.service.impl.TestServiceImpl.update(..))")
    public void printBefore11(){
        System.out.println("33333333333333");
    }

}
