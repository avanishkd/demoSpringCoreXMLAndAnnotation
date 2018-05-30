package com.mindtree.spring.model;

import com.mindtree.spring.Account;
import com.mindtree.spring.Card;

public class SavingsAccount implements Account {

	private Card atmCard;

	public SavingsAccount(Card card) {
		atmCard = card;
		
	}

	@Override
	public String createAccount() {
		return "savings account created successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return atmCard.cardDetails();
	}
}
