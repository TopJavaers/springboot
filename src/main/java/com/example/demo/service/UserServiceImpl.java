package com.example.demo.service;

import com.example.demo.Pojo.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getAll();
    }

    @Override
    public void createUser(User user) {
        userMapper.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userMapper.findOne(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userMapper.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.delete(id);
    }

}
