package com.passwordlocker.repository;

import java.util.List;

import com.passwordlocker.entity.Account;
import com.passwordlocker.entity.User;
import com.passwordlocker.util.ValidUser;

public class UserServiceImplementation implements UserService {
	private UserRepInterface repository;
	private AccountsRepInterface accrep;
	{
		
		repository = new UserRepository();
		accrep = new AccountsRepository();
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
		User user = repository.deleteUser(id);
		return user;
	}

	@Override
	public String saveAccount(Account account) {
		return accrep.saveAccount(account);
	}

	@Override
	public Account updateAccount(Account account) {
		return accrep.updateAccount(account);
	}

	@Override
	public Account deleteAccount(int id) {
		return accrep.deleteAccount(id);
	}

	@Override
	public List<Account> getAllAccount() {
		return accrep.getAllAccount();
	}

	@Override
	public List<Account> getAccountByAccountName(String name) {
		return accrep.getAccountByAccountName(name);
	}

}
