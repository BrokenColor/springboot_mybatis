package com.mybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.domain.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.service.UserService;

/**
 * @author gwl
 * @data 2018年5月11日
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		return userMapper.getUserById(id);
	}

	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}

	@Override
	public int add(User user) {
		return userMapper.add(user);
	}

	@Override
	public int update(Long id, User user) {
		return userMapper.update(id, user);
	}

	@Override
	public int delete(Long id) {
		return userMapper.delete(id);
	}
}
