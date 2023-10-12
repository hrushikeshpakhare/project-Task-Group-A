package com.example.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	@PostMapping("/savaUserDetails")
	public User saveUserDetails (@RequestBody User user) {
		User users = userService.saveUserDetails(user);
		return user;
		
	}
}
