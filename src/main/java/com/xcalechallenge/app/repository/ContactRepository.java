package com.xcalechallenge.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xcalechallenge.app.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
