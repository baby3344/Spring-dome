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
        Printer printer=(Printer)context.getBean("printer1");
        String content="几位老板来了就赶上了国际上房间打扫了" +
                       "辣椒粉发动机雷克萨房间打扫了，煽风点火尽快哈水电费即可" +
                        "副书记大福利卡就是弗兰克放假撒冷风机，" +
                        "反倒是骄傲了发动机奥拉夫空间发生刻录机！";
        printer.print(content);
    }
}
