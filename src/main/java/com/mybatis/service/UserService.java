package com.mybatis.service;

import java.util.List;

import com.mybatis.domain.User;

/**
 * @author gwl
 * @data 2018年5月11日
 */
public interface UserService {
	
	User getUserById(Long id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Long id, User user);

	public int delete(Long id);
}
