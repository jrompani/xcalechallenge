package com.xcalechallenge.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcalechallenge.app.model.Group;
import com.xcalechallenge.app.repository.GroupRepository;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group create(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group getById(Long id) {
        return groupRepository.findById(id).orElseThrow(GroupNotFoundException::new);
    }
}
