package cn.qwx.Logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import java.util.Arrays;

/**
 * 定义包含增强方法的javaBean
 */
@Aspect
public class UserServiceLogger {
    private static final Logger log=Logger.getLogger(UserServiceLogger.class);

    //代表前置增强
    public void before(JoinPoint jp){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法入参："+Arrays.toString(jp.getArgs()));
    }


    //代表后置增强
    public void afterRetuening(JoinPoint jp,Object result){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法返回值："+result);
    }
}
