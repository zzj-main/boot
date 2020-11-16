package com.yanqiang.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
/**
 * @Aspect 表明是一个切面类
 * @Component 将当前类注入到Spring容器内
 */

public class LogAspect {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @Pointcut 切入点，其中execution用于使用切面的连接点。
     * 使用方法：execution(方法修饰符(可选) 返回类型 方法名 参数 异常模式(可选)) ，
     * 可以使用通配符匹配字符，*可以匹配任意字符。
     */
    @Pointcut("execution(public * com.yanqiang.boot.controller.*.*(..))")
    public void LogAspect(){}

    /**
     *
     * @param joinPoint
     * @Before 在方法前执行
     */
    @Before("LogAspect()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("前置切面处doBefore");
    }

    /**
     * @After 在方法后执行
     * @param joinPoint
     */
//    @After("LogAspect()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("后置切面处doAfter");
    }

    /**
     * @AfterReturning 在方法执行后返回一个结果后执行
     * @param joinPoint
     */
    @AfterReturning("LogAspect()")
    public void doAfterReturning(JoinPoint joinPoint){
        System.out.println("doAfterReturning");
    }

    /**
     * @AfterThrowing 在方法执行过程中抛出异常的时候执行
     * @param joinPoint
     */
//    @AfterThrowing("LogAspect()")
    public void deAfterThrowing(JoinPoint joinPoint){
        System.out.println("deAfterThrowing");
    }

    /**
     * @Around 环绕通知，就是可以在执行前后都使用，
     * 这个方法参数必须为ProceedingJoinPoint，proceed()方法就是被切面的方法，
     * 上面四个方法可以使用JoinPoint，JoinPoint包含了类名，被切面的方法名，参数等信息。
     * @param joinPoint
     * @return
     * @throws Throwable
     */
//    @Around("LogAspect()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("deAround");
        return joinPoint.proceed();
    }
}
