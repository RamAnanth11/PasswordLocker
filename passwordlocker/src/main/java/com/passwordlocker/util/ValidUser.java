package com.passwordlocker.util;

import com.passwordlocker.entity.User;

public class ValidUser {
	private static User user;

	public void setUser(User user1) {
		ValidUser.user = user1;
	}

	public User getUser() {
		return user;
	}

}
