package com.xcalechallenge.app.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xcalechallenge.app.dto.ContactResponseDto;
import com.xcalechallenge.app.dto.GroupRequestDto;
import com.xcalechallenge.app.dto.GroupResponseDto;
import com.xcalechallenge.app.model.Group;
import com.xcalechallenge.app.service.ContactService;

import io.swagger.models.Contact;

@Component
public class GroupMapper {
	
    @Autowired
    private ContactService contactService;

    @Autowired
    private ContactMapper contactMapper;

    public GroupResponseDto toGroupResponse (Group group) {
        List<ContactResponseDto> contactResponseList = contactMapper.toContactResponseList(group.getMembers());
        return new GroupResponseDto(group.getId(), group.getName(), contactResponseList);
    }

    public Group toGroup(GroupRequestDto groupRequest) {
        Group group = new Group();
        group.setName(groupRequest.getName());
        List<Contact> members = groupRequest.getMembersId()
                .stream()
                .map(memberId -> contactService.getById(memberId))
                .collect(Collectors.toList());
        group.setMembers(members);
        return group;
    }
}
