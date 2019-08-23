package cn.qwx.dao;

import cn.qwx.entity.User;

public interface UserDao {

    /**
     * 保存用户信息的方法
     * @param user
     */
    public int save(User user);
}
