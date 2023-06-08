package com.passwordlocker.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.passwordlocker.entity.User;
import com.passwordlocker.util.UserEntityManagerFactoryUtil;

public class UserRepository implements UserRepInterface {
	EntityManager manager = UserEntityManagerFactoryUtil.getFactory().createEntityManager();

	@Override
	public String saveUser(User user) {
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return "Data Saved";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT Saved";
	}

	public User userLogin(String email, String password) {
//		String sql = "SELECT u.id from User u where email = ?1 and password = ?2;";
//		Query query = manager.createQuery(sql);
//		query.setParameter(1, email);
//		query.setParameter(2, password);
//
//		List list = query.getResultList();
//
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
