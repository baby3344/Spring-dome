package cn.qwx;

import cn.qwx.entity.HelloSpring;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {
    private static Logger logger = Logger.getLogger(HelloSpringTest.class);

    @Test
    public void testHelloSpring(){
        //通过ClassPathXmlApplicationContext实例化Spring的上下文
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过调用spring上下文实例的getBean()方法，根据id来获取Bean的实例
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        //执行print()
        helloSpring.print();
    }
}
