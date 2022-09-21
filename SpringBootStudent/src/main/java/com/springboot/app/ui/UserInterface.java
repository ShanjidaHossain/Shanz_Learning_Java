package com.springboot.app.ui;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;

import com.springboot.app.controller.CustomerLoginController;
import com.springboot.app.dto.CustomerLoginDTO;

public class UserInterface {
	private static final Log LOGGER = LogFactory.getLog(UserInterface.class);

	public static void main(String[] args) throws Exception {

		PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		try {
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("harry");
			customerLoginDTO.setPassword("harry123");

			CustomerLoginController customerLoginController = new CustomerLoginController();
			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			LOGGER.info(config.getProperty(message));
		} catch (Exception exception) {
			LOGGER.info(config.getProperty(exception.getMessage()));
		}
	}
}