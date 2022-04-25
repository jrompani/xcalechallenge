package com.xcalechallenge.app.mapper;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xcalechallenge.app.dto.ContactResponseDto;
import com.xcalechallenge.app.dto.MessageRequest;
import com.xcalechallenge.app.dto.MessageResponse;
import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.service.ContactService;
import com.xcalechallenge.app.service.GroupService;

@Component
public class MessageMapper {
	   @Autowired
	    private GroupService groupService;

	    @Autowired
	    private ContactService contactService;

	    @Autowired
	    private ContactMapper contactMapper;

	    public Message toMessage(MessageRequest messageRequest) {
	        Message message = new Message();
	        message.setGroup(groupService.getById(messageRequest.getGroupId()));
	        message.setText(messageRequest.getText());
	        message.setSender(contactService.getById(messageRequest.getSenderId()));
	        message.setSendAt(LocalDateTime.now());
	        return message;
	    }

	    public MessageResponse toMessageReponse(Message message) {
	        ContactResponseDto contactResponse = contactMapper.toContactResponse(message.getSender());
	        return new MessageResponse(message.getId(), message.getText(), message.getSendAt(), contactResponse);
	    }
}
