package com.springboot.bankapp.service;

import java.util.List;

import com.springboot.bankapp.entity.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accountNumber);
	public List<Account> getAllAccountDetails();
	public Account depositAmount(Long accountNumber,Double amount) ;
	public Account withdrawaAmount(Long accountNumber, Double amount);
	public void closeAccount(Long accountNumber);
	
}
