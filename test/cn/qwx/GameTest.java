package cn.qwx;

import cn.youxi.Equip;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameTest {

    private static Logger logger=Logger.getLogger(GameTest.class);

    @Test
    public void Test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Equip lanMoRing=(Equip) context.getBean("lanmojiezhi");
        System.out.println(lanMoRing.getName()+"【速度增效："+lanMoRing.getSpeedPlus()+
                "   ；攻击增效："+lanMoRing.getAttackPlus()+"   ；防御增效："+lanMoRing.getDefencePlus()+"】");
    }
}
