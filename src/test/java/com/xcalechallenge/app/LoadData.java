package com.xcalechallenge.app;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import com.xcalechallenge.app.model.Contact;
import com.xcalechallenge.app.model.Group;
import com.xcalechallenge.app.model.Message;
import com.xcalechallenge.app.model.Notification;



public class LoadData {
    private static final Contact contact_1 = new Contact(1L, "Juan", "Perez", "15-2434-5771");
    private static final Contact contact_2 = new Contact(2L, "Mariana", "Lazanski", "15-5794-1347");
    private static final Contact contact_3 = new Contact(3L, "Jorge" ,"Poeta", "15-5741-3663");


    public static Group getGroupMocked(){
        List<Contact> contactList = Arrays.asList(
        		contact_1,
        		contact_2,
        		contact_3
        );
        return new Group(1L, "Group Test", contactList);
    }

    public static Contact getContactMocked() {
        return contact_3;
    }

    public static Message getMessageMocked() {
        return new Message(1L, getGroupMocked(), "Test", getContactMocked(), LocalDateTime.now());
    }

    public static List<Notification> getNotificationList() {
        return Arrays.asList(
                new Notification(contact_1, getMessageMocked()),
                new Notification(contact_2, getMessageMocked()),
                new Notification(contact_3, getMessageMocked())
        );
    }
}
