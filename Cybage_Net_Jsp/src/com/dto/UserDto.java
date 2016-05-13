package com.dto;

public class UserDto {

	private Integer id;
	private String name;
	private String pass;
	private String type;
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDto(String name, String pass, String type) {
		super();
		this.name = name;
		this.pass = pass;
		this.type = type;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "UserDao [id=" + id + ", name=" + name + ", pass=" + pass + ", type=" + type + "]";
	}
	
	
	
}
