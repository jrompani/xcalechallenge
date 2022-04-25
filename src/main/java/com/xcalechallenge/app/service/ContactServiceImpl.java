package com.xcalechallenge.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcalechallenge.app.model.Contact;
import com.xcalechallenge.app.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact getById(Long id) {
        return contactRepository.findById(id).orElseThrow(ContactNotFoundException::new);
    }

}
