package com.mybatis_xml.springboot_mybatis_xml.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis_xml.springboot_mybatis_xml.models.User;
import com.mybatis_xml.springboot_mybatis_xml.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable Integer id) {
		return userService.findById(id);
	}

	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

	@PostMapping
	public void insert(@RequestBody User user) {
		userService.insert(user);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable Integer id, @RequestBody User user) {
		user.setId(id);
		userService.update(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}
}