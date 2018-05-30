package com.mindtree.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

//		Account account=context.getBean("myAccount",Account.class);
		Account account=context.getBean("myCurrentAccount",Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		
		
		/*Account account1=context.getBean("myCurrentAccount",Account.class);
		System.out.println(account.hashCode());
		System.out.println(account1.hashCode());*/
		
		context.close();
	}
	
	
}
