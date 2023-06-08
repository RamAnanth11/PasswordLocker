package com.passwordlocker.controller;

import java.sql.Date;
import java.time.LocalDate;

import com.passwordlocker.entity.Account;
import com.passwordlocker.entity.User;
import com.passwordlocker.repository.AccountsRepository;
import com.passwordlocker.repository.UserRepository;

public class Controller {

	public static void main(String[] args) {
		User user = new User("Ananth", "Male", Date.valueOf(LocalDate.of(1998, 9, 11)), "9876543210", "armnjs", "1234");
		Account account = new Account("Facebook", "annath", "123", "Password for FB", 1);
		
		UserRepository ur = new UserRepository();
		AccountsRepository ar = new AccountsRepository();
		
		ur.saveUser(user);
//		ar.saveAccount(account);
		
	}

}
