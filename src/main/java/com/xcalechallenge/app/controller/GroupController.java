package com.xcalechallenge.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcalechallenge.app.dto.GroupRequestDto;
import com.xcalechallenge.app.dto.GroupResponseDto;
import com.xcalechallenge.app.mapper.GroupMapper;
import com.xcalechallenge.app.model.Group;
import com.xcalechallenge.app.service.GroupService;

@RestController
@RequestMapping("/group")
public class GroupController {
	
    @Autowired
    private GroupService groupService;

    @Autowired
    private GroupMapper groupMapper;

    @PostMapping
    public ResponseEntity<GroupResponseDto> create (@RequestBody @Valid GroupRequestDto groupRequest) {
        Group group = groupMapper.toGroup(groupRequest);
        return new ResponseEntity<>(groupMapper.toGroupResponse(groupService.create(group)), HttpStatus.CREATED);
    }
}
