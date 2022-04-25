package com.xcalechallenge.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xcalechallenge.app.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
