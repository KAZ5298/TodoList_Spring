package todolist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todolist.model.User;
import todolist.repository.UserMapper;
import todolist.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;

	@Override
	public User getLoginUser(String user) {
		return mapper.findLoginUser(user);
	}
	
}