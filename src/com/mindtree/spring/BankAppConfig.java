package com.mindtree.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.mindtree.spring.model.CreditCard;
import com.mindtree.spring.model.CurrentAccount;

public class BankAppConfig {
	
	@Bean
	public CreditCard creditCard(){
		return new CreditCard();
	}

	@Bean(initMethod="onInit",destroyMethod="onDestroy")
	@Scope("prototype")
	public CurrentAccount currentAccount(){
		return new CurrentAccount();
	}
}
