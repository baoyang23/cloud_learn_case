package com.yang.rest.controller;

import com.yang.rest.entity.User;
import com.yang.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/24 22:31
 * @Version 1.0
 * @qq: 1411091515
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers(){
        return userRepository.listUser();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userRepository.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.saveOrUpdate(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id")Long id,@RequestBody User user){
        User oldUser = this.getUser(id);
        if(oldUser != null){
            user.setId(id);
            userRepository.saveOrUpdate(user);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userRepository.deleteUser(id);
    }

}
