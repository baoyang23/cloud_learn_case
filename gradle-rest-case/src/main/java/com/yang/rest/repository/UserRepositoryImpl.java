package com.yang.rest.repository;

import com.yang.rest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/24 22:26
 * @Version 1.0
 * @qq: 1411091515
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentHashMap<Long,User> userMap = new ConcurrentHashMap<>();

    @Override
    public User saveOrUpdate(User user) {
        Long id = user.getId();
        if(id == null || id < 0){
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id,user);
        return this.getUserById(id);
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {
        return new ArrayList<User>(this.userMap.values());
    }
}
