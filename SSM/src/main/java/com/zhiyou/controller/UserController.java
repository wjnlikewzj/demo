package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@RequestMapping("add")
	public String add(User user,HttpServletRequest req,HttpServletResponse resp){
		service.add(user);
		return "forward:show";
	}
	@RequestMapping("selectById")
	public String selectById(int id,HttpServletRequest req,HttpServletResponse resp){
		User user = service.selectById(id);
		req.setAttribute("user", user);
		return "UserUpdate";
	}
	
	@RequestMapping("update")
	public String update(User user,HttpServletRequest req,HttpServletResponse resp){
		service.update(user);
		return "forward:show";
	}
	
	@RequestMapping("delete")
	public String delete(int id,HttpServletRequest req,HttpServletResponse resp){
		service.delete(id);
		return "forward:show";
	}
	
	@RequestMapping("show")
	public String select(@RequestParam(value="n",defaultValue="1")int n,HttpServletRequest req,HttpServletResponse resp){
		PageHelper.startPage(n,3);
		List<User> list = service.select();
		//页码显示几个
		PageInfo<User> info = new PageInfo<User>(list,3);
		req.setAttribute("pageInfo", info);
		//req.setAttribute("list", list);
		return "Userlist";
	}
	
}
