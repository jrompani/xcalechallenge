package com.xcalechallenge.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xcalechallenge.app.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
