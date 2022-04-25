package com.xcalechallenge.app.service;

import com.xcalechallenge.app.model.Group;

public interface GroupService {
	Group getById(Long id);
	
	Group create(Group group);

}
