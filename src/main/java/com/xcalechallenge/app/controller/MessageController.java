package com.xcalechallenge.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcalechallenge.app.dto.MessageRequest;
import com.xcalechallenge.app.dto.MessageResponse;
import com.xcalechallenge.app.mapper.MessageMapper;
import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
	
    @Autowired
    private MessageService messageService;

    @Autowired
    private MessageMapper messageMapper;

    @PostMapping
    public ResponseEntity<MessageResponse> send(@RequestBody @Valid MessageRequest messageRequest){
        Message message = messageMapper.toMessage(messageRequest);
        return new ResponseEntity<>(messageMapper.toMessageReponse(messageService.send(message)), HttpStatus.CREATED);
    }
}
