package cn.qwx.dao.impl;

import cn.qwx.dao.UserDao;
import cn.qwx.entity.User;
import  org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//通过注解定义一个DAO
@Component("userDao")
//@Repository（"userDao")
public class UserDaoImpl implements UserDao {
    public int save(User user) {

        System.out.println("保存成功！");
        return 1;
    }

    public int delete(int id){
        System.out.println("删除成功！");
        return 1;
    }

}
