package com.yang.rest.repository;

import com.yang.rest.entity.User;

import java.util.List;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/24 22:24
 * @Version 1.0
 * @qq: 1411091515
 */
public interface UserRepository {

    /**
     * 跟新或者保存
     * @param user
     * @return
     */
    User saveOrUpdate(User user);

    /**
     * 删除
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 获取
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取列表
     * @return
     */
    List<User> listUser();

}
