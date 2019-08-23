package cn.qwx.dao;

import cn.qwx.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    //负责创建用户DAO实例方法
    public static UserDao getInstance(){
        return  new UserDaoImpl();
    }
}
