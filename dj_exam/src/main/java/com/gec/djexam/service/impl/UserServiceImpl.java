package com.gec.djexam.service.impl;

import com.gec.djexam.dao.UserMapper;
import com.gec.djexam.domain.User;
import com.gec.djexam.domain.UserExample;
import com.gec.djexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public int countByExample(UserExample example) {
        return userMapper.countByExample(example);
    }

    public int deleteByExample(UserExample example) {
        return userMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User record) {
        return userMapper.insert(record);
    }

    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(User record, UserExample example) {
        return userMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
