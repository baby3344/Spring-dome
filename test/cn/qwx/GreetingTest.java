package cn.qwx;

import cn.qwx.entity.Greeting;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Greeting zhangga=(Greeting) context.getBean("zhangGa");
        Greeting rod=(Greeting) context.getBean("rod");
        zhangga.sayGreeting();
        rod.sayGreeting();

    }
}
