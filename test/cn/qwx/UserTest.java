package cn.qwx;

import cn.qwx.config.AppConfig;
import cn.qwx.entity.User;
import cn.qwx.service.UserService;
import cn.qwx.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    private static Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        UserService service = (UserService) context.getBean("userService");
        int result = service.save(user);
        logger.info("结果是："+result);

        result = service.delete(1);
        logger.info("delete结果是："+result);
    }

    @Test
    public void testAppConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ctx.getBean(UserServiceImpl.class);
        User user = ctx.getBean(User.class);

        int result = userService.save(user);

        logger.info("结果是："+result);
    }
}
