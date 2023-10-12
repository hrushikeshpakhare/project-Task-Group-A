package com.example.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
    @Autowired
    private UserRepository userRepository;
  
	@Override
	public User saveUserDetails(User user) {
		User users = userRepository.save(user);
		return users;
	}

}
