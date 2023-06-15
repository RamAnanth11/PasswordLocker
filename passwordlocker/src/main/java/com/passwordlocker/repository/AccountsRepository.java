package com.passwordlocker.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.passwordlocker.entity.Account;
import com.passwordlocker.entity.User;
import com.passwordlocker.util.UserEntityManagerFactoryUtil;
import com.passwordlocker.util.ValidUser;

public class AccountsRepository implements AccountsRepInterface {
	EntityManager manager = UserEntityManagerFactoryUtil.getFactory().createEntityManager();
	
	private User user;
	{
		user = new ValidUser().getUser();
		System.out.println(user);
	}
	
	
	@Override
	public String saveAccount(Account account) {
		EntityTransaction transaction = manager.getTransaction();
		account.setUserID(user.getId());
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
		EntityTransaction transaction = manager.getTransaction();
		List<Account> list = getAccountByAccountName(account.getAccountName());
		Account account2 = list.get(0);
		transaction.begin();
		manager.merge(account2);
		transaction.commit();
		
		return account2;
	}

	@Override
	public Account deleteAccount(int id) {
		EntityTransaction transaction = manager.getTransaction();
		try {
			Account account = manager.find(Account.class, id);
			transaction.begin();
			manager.remove(account);
			transaction.commit();
			return account;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Account> getAllAccount() {
		String sql = "From Account a";
		try {
			Query query = manager.createQuery(sql);
			List<Account> list = query.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public List<Account> getAccountByAccountName(String name) {
		String query = "FROM Account a WHERE a.accountName = ?1 AND a.userID = ?2";
		Query query2 = manager.createQuery(query);
		query2.setParameter(1, name);
		query2.setParameter(2, user.getId());
		try {
			List<Account> list = query2.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
