package com.passwordlocker.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.passwordlocker.entity.User;
import com.passwordlocker.util.UserEntityManagerFactoryUtil;

public class UserRepository {
	EntityManager manager = UserEntityManagerFactoryUtil.getFactory().createEntityManager();
	
	public User userLogin(String email, String password)
	{
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	public String saveUser(String userName, String passWord)
	{
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(transaction);
		
		
		return null;
	}
}
