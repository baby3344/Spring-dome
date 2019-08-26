package cn.qwx.Logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
    private static Logger log=Logger.getLogger(AfterLogger.class);

    public void afterLogger(JoinPoint jp){
        log.info(jp.getSignature().getName()+"方法执行结束。");
    }
}
