package com.xcalechallenge.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcalechallenge.app.model.Contact;
import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.model.Notification;
import com.xcalechallenge.app.repository.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	

	@Override
	public List<Notification> sendAll(List<Contact> users, Message message) {
		return this.notificationRepository.saveAll(users.stream()
				.map(user -> new Notification(user, message))
						.collect(Collectors.toList())
						
				);
	}



}

