package com.example.demo.mapper;

import com.example.demo.Pojo.User;

import java.util.List;

public interface UserMapper {
    public void save(User user);

    public void update(User user);

    public void delete(Long id);

    public List<User> getAll();

    public User findOne(Long id);

}
