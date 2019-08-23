package cn.qwx.service.impl;

import cn.qwx.dao.UserDao;
import cn.qwx.dao.UserDaoFactory;
import cn.qwx.dao.impl.UserDaoImpl;
import cn.qwx.entity.User;
import cn.qwx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户业务类，实现对User功能的业务管理
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    //声明接口类型对引用和具体实现类解耦合
    @Autowired
    @Qualifier("userDao")
    //dao属性注入名为userDao的Bean
    //@Resource(name="userDao")

    //查找名为daoBean，并注入给dao属性
      @Resource
    private  UserDao dao;

    //查找名为userDao的Bean，并注入给setter方法
    @Resource
    public void setUserDao(UserDao userDao){
        this.dao=userDao;
    }

    private UserDao userDao = new UserDaoImpl();
    //通过工厂获取所依赖的用户DAO对象
    private UserDao dao1=UserDaoFactory.getInstance();
    //调用用户DAO的方法保存用户信息
    public void addNewUser(User user){
        dao1.save(user);
    }


    /**
     * 无参构造方法
     */
    public UserServiceImpl() {
    }

    /**
     * 用于dao属性赋值的构造方法
     * @param userDao
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int save(User user) {
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getUserPassword());
        return userDao.save(user);
    }


}
