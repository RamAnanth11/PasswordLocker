package com.passwordlocker.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.passwordlocker.entity.Account;
import com.passwordlocker.entity.User;
import com.passwordlocker.repository.UserServiceImplementation;

@WebServlet("/updateaccount")
public class UpdateAccount extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user =(User) session.getAttribute("LoggedUser");
		Account account = new Account();
		account.setAccountName(req.getParameter("name"));
		account.setUserName(req.getParameter("username"));
		account.setPassword(req.getParameter("password"));
		account.setReview(req.getParameter("review"));
		account.setUserID(user.getId());
		
		UserServiceImplementation ui = new UserServiceImplementation();
		System.out.println(ui.updateAccount(account));
		
	}
}
