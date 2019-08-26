package cn.qwx.Logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * 定义包含增强方法的javaBean
 */
public class AroundLogger {
    private static final Logger log=Logger.getLogger(AroundLogger.class);

    public Object aroundLogger(ProceedingJoinPoint jp)throws Throwable{
     log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法入参："+Arrays.toString(jp.getArgs()));
     try {
       Object result=jp.proceed();//执行目标方法并获得其返回值
         log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法返回值："+result);
         return result;
     }catch (Exception e){
       log.error(jp.getSignature().getName()+"方法发生异常。");
       throw  e;
     }finally {
         log.info(jp.getSignature().getName()+"方法结束执行");
     }
    }
}
