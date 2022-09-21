package com.springboot.app.service;

import com.springboot.app.controller.BankException;
import com.springboot.app.dto.CustomerLoginDTO;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws BankException;
}
