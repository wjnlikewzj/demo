package com.zhiyou.model;

public class User {
	private Integer id;
	private String name;
	private Integer money;
	private String password;
	
	public User() {
		super();
	}

	public User(Integer id, String name, Integer money, String password) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.password = password;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", money=" + money + ", password=" + password + "]";
	}
	
}
