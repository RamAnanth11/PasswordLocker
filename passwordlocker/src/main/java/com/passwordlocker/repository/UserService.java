package com.passwordlocker.repository;

import com.passwordlocker.entity.User;

public interface UserService {
	String saveUser(User user);

	User updateUser(User user);

	User userLogin(String email, String password);

	User deleteUser(int id);
}
