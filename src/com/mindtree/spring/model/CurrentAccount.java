package com.mindtree.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.spring.Account;
import com.mindtree.spring.Card;

public class CurrentAccount implements Account {
	
//	using annotation for spring configuration using annotation
	@Autowired
	private Card creditCard;
	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String createAccount() {
		return "current account created successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return creditCard.cardDetails();
	}
	
	//method to be invoked on bean's initialization, it should always be public and void
	public void onInit(){
		System.out.println("Bean's initialization method called.");
	}
	
	//method to be invoked on bean's destrucion, it should always be public and void
		public void onDestroy(){
			System.out.println("Bean's destruction method called at the end.");
		}
}
