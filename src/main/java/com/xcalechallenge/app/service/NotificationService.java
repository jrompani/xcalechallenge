package com.xcalechallenge.app.service;

import java.util.List;

import com.xcalechallenge.app.model.Contact;
import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.model.Notification;

public interface NotificationService {
	List<Notification> sendAll(List<Contact> members, Message message);
}
