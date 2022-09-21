package com.springboot.app.repository;

import com.springboot.app.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
