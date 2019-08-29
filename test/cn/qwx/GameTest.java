package cn.qwx;

import cn.youxi.Equip;
import cn.youxi.Player;
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

    @Test
    public void Test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Player player=(Player)context.getBean("zhangsan1");
        System.out.println("\n\t\t\t\t\t-----该玩家的装备----");
        System.out.println("装备名称：" + player.getArmet().getName() +
                "\t\t装备类型：" + player.getArmet().getType() +
                "\t\t[速度增效：" +player.getArmet().getSpeedPlus()+
                ",攻击增效：" + player.getArmet().getAttackPlus() +
                ",防御增效：" + player.getArmet().getDefencePlus() + "]");
        System.out.println("装备名称：" + player.getLoricae().getName() +
                "\t\t装备类型：" + player.getLoricae().getType() +
                "\t\t[速度增效：" +player.getLoricae().getSpeedPlus()+
                ",攻击增效：" + player.getLoricae().getAttackPlus() +
                ",防御增效：" + player.getLoricae().getDefencePlus() + "]");
        System.out.println("装备名称：" + player.getBoot().getName() +
                "\t\t装备类型：" + player.getBoot().getType() +
                "\t\t[速度增效：" +player.getBoot().getSpeedPlus()+
                ",攻击增效：" + player.getBoot().getAttackPlus() +
                ",防御增效：" + player.getBoot().getDefencePlus() + "]");
        System.out.println("装备名称：" + player.getRing().getName() +
                "\t\t装备类型：" + player.getRing().getType() +
                "\t\t[速度增效：" +player.getRing().getSpeedPlus()+
                ",攻击增效：" + player.getRing().getAttackPlus() +
                ",防御增效：" + player.getRing().getDefencePlus() + "]");
    }

    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Player player=(Player) context.getBean("zhangsan1");
        Equip equip=player.getRing();
        player.UpdateEquip(equip);
    }

}

