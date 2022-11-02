package com.ess.timer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.ess.timer.ShoppingCart.checkout())")
    private void logAdvicePointcut() {
    }

    @Before("logAdvicePointcut()")
    public void before() {
        System.out.println("logging...");
    }
}
