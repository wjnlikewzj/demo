package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.dao.UserDao;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;
	public void add(User user) {
		
		dao.add(user);
	}
	public void update(User user) {
		dao.update(user);
	}
	public void delete(int id) {
		dao.delete(id);
	}
	public List<User> select() {
		return dao.select();
	}
	/*public User selectByName(String name, String password) {
		
		return dao.selectByName(name, password);
	}*/
	public User selectById(int id) {
		
		return dao.selectById(id);
	}
	
}
