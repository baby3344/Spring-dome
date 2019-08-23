package cn.qwx.config;
import cn.qwx.dao.UserDao;
import cn.qwx.dao.impl.UserDaoImpl;
import cn.qwx.entity.User;
import cn.qwx.service.UserService;
import cn.qwx.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 使用@Configuration注释类表示其主要目的是作为bean定义的源。
// AppConfig类等效于Spring的配置文件
@Configuration
@ComponentScan(basePackages = "cn.qwx")
public class AppConfig {

    //@Bean注释用于指示方法实例化，配置和初始化由Spring IoC容器管理的新对象。
    @Bean
    public UserDao userDao(){
        return new UserDaoImpl();
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl(userDao());
    }

    @Bean
    public User user(){
        User u = new User();
        u.setId(3);
        u.setUserName("王五");
        u.setUserPassword("555555");
        return u;
    }
}