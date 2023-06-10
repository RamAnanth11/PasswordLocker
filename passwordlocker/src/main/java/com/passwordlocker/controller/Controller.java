package com.passwordlocker.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.passwordlocker.entity.Account;
import com.passwordlocker.entity.User;
import com.passwordlocker.repository.AccountsRepository;
import com.passwordlocker.repository.UserRepository;
import com.passwordlocker.repository.UserServiceImplementation;

public class Controller {

	public static void main(String[] args) {
//		User user = new User(1, "Ananth Ram", "Male", Date.valueOf(LocalDate.of(1998, 9, 11)), "1234567890", "ananthram", "1234");
//		Account account = new Account("Facebook", "annath", "123", "Password for FB", 1);
		
//		UserRepository ur = new UserRepository();
		UserServiceImplementation usri = new UserServiceImplementation();
		
		
//		System.out.println(ur.updateUser(user));
		
		
//		ur.saveUser(user);
//		ar.saveAccount(account);
		
		User user2 = usri.userLogin("ananthram", "1234");
		AccountsRepository ar = new AccountsRepository();
		System.out.println(user2);
		List<Account> list = ar.getAccountByAccountName("Facebook");
		System.out.println(list);
		
	}

}
