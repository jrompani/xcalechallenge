package com.xcalechallenge.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xcalechallenge.app.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

}
