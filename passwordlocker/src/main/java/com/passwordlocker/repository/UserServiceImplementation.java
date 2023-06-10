
package com.passwordlocker.repository;

import com.passwordlocker.entity.User;
import com.passwordlocker.util.ValidUser;

public class UserServiceImplementation implements UserService {
	private UserRepInterface repository;
	{
		
		repository = new UserRepository();
	}

	@Override
	public String saveUser(User user) {
		return repository.saveUser(user);
	}

	@Override
	public User updateUser(User user) {
		return repository.updateUser(user);
	}

	@Override
	public User userLogin(String email, String password) {
		User user = repository.userLogin(email, password);
		if(user!=null)
		{
			new ValidUser().setUser(user);
		}
		
		return user;
	}

	@Override
	public User deleteUser(int id) {

		return null;
	}

}
