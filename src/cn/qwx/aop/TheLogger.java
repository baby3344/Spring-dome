package cn.qwx.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// 注解@Aspect将TheLogger定义为切面
@Component
@Aspect
public class TheLogger {
    private static final Logger log = Logger.getLogger(TheLogger.class);

    @Pointcut("execution(* cn.qwx.service.*.*(..))")
    public void pointcut(){}

    //前置增强
    //@Before注解将myBefore()方法定义为前置增强
    @Before("pointcut()")
    public void myBefore(JoinPoint jp){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法的入参为："+Arrays.toString(jp.getArgs()));
    }

    //后置增强
    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void myAfterReturning(JoinPoint jp,Object result){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。返回值："+result);
    }

    @AfterThrowing(pointcut="pointcut()",throwing="e")
    public void myError(JoinPoint jp,Exception e){
        log.error(jp.getTarget()+"中"+jp.getSignature().getName()+"方法发生异常："+e);
    }

    @After("pointcut()")
    public void myAfter(JoinPoint jp){
        log.error(jp.getTarget()+"中"+jp.getSignature().getName()+"方法执行结束");
    }

    //@Around("pointcut()")
    public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法的入参为："+Arrays.toString(jp.getArgs()));

        try {
            Object result = jp.proceed();
            return result;
        } catch (Exception e) {
            log.error(jp.getTarget()+"中"+jp.getSignature().getName()+"方法发生异常："+e);
            throw e;
        } finally {
            log.error(jp.getTarget()+"中"+jp.getSignature().getName()+"方法执行结束");
        }
    }
}