package com.xcalechallenge.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	@Autowired
	private NotificationService notificationService;

    @Override
    @Transactional
    public Message sendMessage(Message message) {
        notificationService.sendAll(message.getGroup().getUsers(), message);
        return messageRepository.save(message); 
    }

}
