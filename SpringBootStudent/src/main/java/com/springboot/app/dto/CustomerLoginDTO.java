package com.springboot.app.dto;
public class CustomerLoginDTO {
	private String loginName;
	private String password;  
    
	public CustomerLoginDTO(){
		
	}
	
	public CustomerLoginDTO(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}
	//getter and setter methods
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
