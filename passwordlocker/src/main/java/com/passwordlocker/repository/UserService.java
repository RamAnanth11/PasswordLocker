package com.passwordlocker.repository;

import java.util.List;

import com.passwordlocker.entity.Account;
import com.passwordlocker.entity.User;

public interface UserService {
	String saveUser(User user);

	User updateUser(User user);

	User userLogin(String email, String password);

	User deleteUser(int id);
	
	String saveAccount(Account account);

	Account updateAccount(Account account);

	Account deleteAccount(int id);

	List<Account> getAllAccount();

	List<Account> getAccountByAccountName(String name);
}
