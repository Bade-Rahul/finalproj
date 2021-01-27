package com.bankapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Account;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;

@SpringBootApplication
public class BankapplicationApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(BankapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		TransactionLog trans1=new TransactionLog(2,1 ,new Date(), "success",1000,AccountType.SAVINGS);
//		
//		TransactionLog trans2=new TransactionLog(3,2 ,new Date(), "success",500,AccountType.SAVINGS);
//		TransactionLog trans3=new TransactionLog(3,1 ,new Date(), "success",700,AccountType.CUREENT);
//		
//		TransactionLog trans4=new TransactionLog(4,3 ,new Date(), "success",550,AccountType.SAVINGS);
//		TransactionLog trans5=new TransactionLog(4,5 ,new Date(), "success",1500,AccountType.CUREENT);
//		
//		Account account1=new Account("rahul", 67889912, "rahul@sgmailcom", 
//				"vskp","Axis", 5000,"SAVINGS");		
//	Account account2=new Account("umesh", 6786781, "umesh@vgmailcom", 
//				"sklm","ICIC", 7000,"CURRENT");
//		
//		Account account3=new Account("Siva", 671234567, "siva@3gmailcom", 
//				"Buchi","SBI", 4000, "SAVINGS");
//		
//		Account account4=new Account("Madhu", 675612489, "madhu@3gmailcom", 
//				"hyd","Syndicate", 8000,"SAVINGS");
//		
//		Account account5=new Account("Mahesh", 671234567, "mahesh@3gmailcom", 
//				"hyd","Andhra", 5670, "CURRENT");
//		
//	
//		accountService.addCustomerAccount(account1);
//	accountService.addCustomerAccount(account2);
//		accountService.addCustomerAccount(account3);
//	accountService.addCustomerAccount(account4);
//		accountService.addCustomerAccount(account5);
//	
//	
//		accountService.addCustomerTransactions(trans1);
//		accountService.addCustomerTransactions(trans2);
//		accountService.addCustomerTransactions(trans3);
//		accountService.addCustomerTransactions(trans4);
//		accountService.addCustomerTransactions(trans5);
//		
	}

}
