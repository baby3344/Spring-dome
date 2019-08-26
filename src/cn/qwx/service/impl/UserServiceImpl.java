package cn.qwx.service.impl;

import cn.qwx.dao.UserDao;
import cn.qwx.dao.UserDaoFactory;
import cn.qwx.dao.impl.UserDaoImpl;
import cn.qwx.entity.User;
import cn.qwx.service.UserService;
import cn.qwx.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户业务类，实现对User功能的业务管理
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static Logger logger=Logger.getLogger(UserServiceImpl.class);
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

    public void setDao(UserDao dao) {
        this.dao = dao;
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
        System.out.println("特殊字符1：" + user.getSpecialCharacter1());
        System.out.println("特殊字符2：" + user.getSpecialCharacter2());
        //System.out.println("内部Bean：" + user.getInnerBean().getUserName());
        System.out.println("List属性：" + user.getList());
        System.out.println("数组属性[0]：" + user.getArray()[0]);
        System.out.println("Set属性：" + user.getSet());
        System.out.println("Map属性：" + user.getMap());
        System.out.println("Properties属性：" + user.getProps());
        System.out.println("注入空字符串：[" + user.getEmptyValue() + "]");
        System.out.println("注入null值：" + user.getNullValue());
        return userDao.save(user);
    }

    /**
     * 用户类，实现对User功能的业务管理
     */
    public boolean addNewsUser(User user){
        logger.info("添加用户"+user.getUserName());
        SqlSession sqlSession=null;
        boolean flag=false;
        try {
           sqlSession=MyBatisUtil.createSqlSession();
           if(1>0){
                 flag=true;
                 sqlSession.commit();
                 logger.info("成功添加用户"+user.getUserName());
           }
        }catch (Exception e){
            logger.info("成功添加用户"+user.getUserName()+"失败，"+e);
            sqlSession.rollback();
        }finally {
             MyBatisUtil.closeSession(sqlSession);
        }
        return  false;
    }

    public int delete(int id) {
        System.out.println("删除编号为"+id+"的用户");
        //int r = 1/0;
        return userDao.delete(id);
    }

}
