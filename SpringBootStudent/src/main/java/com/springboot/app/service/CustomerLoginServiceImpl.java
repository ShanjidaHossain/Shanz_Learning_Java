package com.springboot.app.service;

import com.springboot.app.controller.BankException;
import com.springboot.app.dto.CustomerLoginDTO;
import com.springboot.app.repository.CustomerLoginRepository;
import com.springboot.app.repository.CustomerLoginRepositoryImpl;

public class CustomerLoginServiceImpl implements CustomerLoginService {
	private CustomerLoginRepository customerLoginRepository = new CustomerLoginRepositoryImpl();
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws BankException {
		String toReturn = null;
		CustomerLoginDTO customerLoginFromRepository = 
				customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toReturn = "SUCCESS";
		} else {
			throw new BankException("Service.WRONG_CREDENTIALS");
		}
		return toReturn;
	}
}

