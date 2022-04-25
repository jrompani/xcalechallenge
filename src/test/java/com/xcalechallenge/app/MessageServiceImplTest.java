package com.xcalechallenge.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.repository.MessageRepository;
import com.xcalechallenge.app.service.MessageServiceImpl;
import com.xcalechallenge.app.service.NotificationServiceImpl;


public class MessageServiceImplTest {

    @Mock
    private MessageRepository messageRepository;

    @Mock
    private NotificationServiceImpl notificationService;

    @InjectMocks
    private MessageServiceImpl messageService;

    @Test
    void sendTest() {
        Message message = LoadData.getMessageMocked();
        Mockito.when(messageRepository.save(Mockito.any(Message.class))).thenReturn(message);
        assertEquals(message, messageService.sendMessage(message));
    }
}
