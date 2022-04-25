package com.xcalechallenge.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.xcalechallenge.app.model.Group;
import com.xcalechallenge.app.repository.GroupRepository;
import com.xcalechallenge.app.service.GroupServiceImpl;


@SpringBootTest
class GroupServiceImplTest {

    @Mock
    private GroupRepository groupRepository;

    @InjectMocks
    private GroupServiceImpl groupService;


    @Test
    void createTest() {
        Group group = LoadData.getGroupMocked();
        Mockito.when(groupRepository.save(Mockito.any(Group.class))).thenReturn(group);
        assertEquals(group, groupService.create(group));
    }

}
