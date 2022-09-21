package com.springboot.app.controller;
import com.springboot.app.dto.CustomerLoginDTO;
import com.springboot.app.service.CustomerLoginService;
import com.springboot.app.service.CustomerLoginServiceImpl;

public class CustomerLoginController {
	private CustomerLoginService customerLoginService;
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws BankException {
		customerLoginService=new CustomerLoginServiceImpl();
		return customerLoginService.authenticateCustomer(customerLoginDTO);
	}
}
