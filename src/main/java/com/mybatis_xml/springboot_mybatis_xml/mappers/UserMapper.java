package com.mybatis_xml.springboot_mybatis_xml.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mybatis_xml.springboot_mybatis_xml.models.User;

@Mapper
public interface UserMapper {
	User findById(Integer id);

	List<User> findAll();

	void insert(User user);

	void update(User user);

	void delete(Integer id);
}
