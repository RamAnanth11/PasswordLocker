package com.passwordlocker.repository;

import java.util.List;

import com.passwordlocker.entity.Account;

public interface AccountsRepInterface {
	String saveAccount(Account account);

	Account updateAccount(Account account);

	Account deleteAccount(int id);

	List<Account> getAllAccount();

	List<Account> getAccountByAccountName(String name);

}
