package com.contact.serviceimpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> contacts = Arrays.asList(
			new Contact(1L, "Shubham@gmail.com", "Shubham rastogi", 111L),
			new Contact(2L, "Balveer@gmail.com", "Balveer", 222L),
			new Contact(3L, "Tanya@gmail.com", "Tanya", 333L),
			new Contact(4L, "Sparsh@gamil.com", "Sparsh", 111L));
	
	
	@Override
	public List<Contact> getContactsFromUserId(Long userId) {
		return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	
	
}
