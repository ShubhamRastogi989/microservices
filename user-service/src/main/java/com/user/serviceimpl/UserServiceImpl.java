package com.user.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	List<User> list = Arrays.asList(
			new User(111L, "Shubham", "880045454"),
			new User(222L, "Balveer", "78796565"),
			new User(333L, "Tanya" , "8789562"));
			
	
	@Override
	public User getUser(Long userId) {
		return list.stream().filter(x-> x.getUserId().equals(userId)).findAny().orElse(null);
	}

}
