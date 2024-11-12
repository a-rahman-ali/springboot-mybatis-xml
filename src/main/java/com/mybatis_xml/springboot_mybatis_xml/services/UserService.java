package com.mybatis_xml.springboot_mybatis_xml.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mybatis_xml.springboot_mybatis_xml.mappers.UserMapper;
import com.mybatis_xml.springboot_mybatis_xml.models.User;

@Service
public class UserService {
	private final UserMapper userMapper;

	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	public List<User> findAll() {
		return userMapper.findAll();
	}

	public void insert(User user) {
		userMapper.insert(user);
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public void delete(Integer id) {
		userMapper.delete(id);
	}
}