package cn.qwx;

import cn.qwx.entity.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试打印机
 */
public class PaperTest {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过Printer bean的id来获取Printer实例
        Printer printer=(Printer)context.getBean("printer");
        String content="几位老板来了12132132321房间打扫了辣椒粉发动机雷克萨房间打扫了！";
        printer.print(content);
    }

}
