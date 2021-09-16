package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.model.Contact;
import com.user.model.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = userService.getUser(userId);
		List<Contact> contactsList = this.restTemplate.getForObject("http://contact-service/contact/user/"+ user.getUserId(), List.class);
		user.setContacts(contactsList);
		return user;
	}
	
}
