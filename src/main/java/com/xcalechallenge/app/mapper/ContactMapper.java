package com.xcalechallenge.app.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.xcalechallenge.app.dto.ContactResponseDto;
import com.xcalechallenge.app.model.Contact;

@Component
public class ContactMapper {

    public ContactResponseDto toContactResponse(Contact contact){
    	ContactResponseDto contactResponse = new ContactResponseDto();
        contactResponse.setId(contact.getId());
        contactResponse.setFirstName(contact.getFirstName());
        contactResponse.setLastName(contact.getLastName());
        contactResponse.setPhoneNumber(contact.getPhoneNumber());
        return contactResponse;
    }

    public List<ContactResponseDto> toContactResponseList(List<Contact> contactList) {
        return contactList.stream()
                .map(this::toContactResponse)
                .collect(Collectors.toList());
    }
}
