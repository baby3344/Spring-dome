package cn.qwx.aop;

import cn.youxi.Player;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;


@Aspect
public class UpdateRing {

    public static Logger log=Logger.getLogger(UpdateRing.class);

    /**
     * 前置增强
     * @param jp
     */
    @Before("execution(* cn.youxi.Player.UpdateEquip(..))")
    public void before(JoinPoint jp){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法入参："+Arrays.toString(jp.getArgs()));
        Player ring = (Player) jp.getTarget();
        if ("指环".equals(ring.getRing().getType())) {
            ring.getRing().setOldName(ring.getRing().getName());
            ring.getRing().setName("紫色梦幻" + ring.getRing().getOldName());
            ring.getRing().setAttackPlus(ring.getRing().getAttackPlus() + 6);
            ring.getRing().setDefencePlus(ring.getRing().getDefencePlus() + 6);
        }
    }

}
