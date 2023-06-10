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
		String query = "FROM Account a WHERE a.accountName = ?1 AND a.userID = ?2";
		Query query2 = manager.createQuery(query);
		query2.setParameter(1, name);
		query2.setParameter(2, user.getId());
		List<Account> list = query2.getResultList();
		return list;
	}

}
