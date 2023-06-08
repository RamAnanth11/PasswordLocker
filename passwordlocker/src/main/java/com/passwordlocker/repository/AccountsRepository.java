package com.passwordlocker.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.passwordlocker.entity.Account;
import com.passwordlocker.util.UserEntityManagerFactoryUtil;

public class AccountsRepository implements AccountsRepInterface {
	EntityManager manager = UserEntityManagerFactoryUtil.getFactory().createEntityManager();
	
	@Override
	public String saveAccount(Account account) {
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return "Data Saved";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Not Saved";
	}

	@Override
	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account deleteAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccountByAccountName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
