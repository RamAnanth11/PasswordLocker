package com.passwordlocker.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.passwordlocker.entity.User;
 import com.passwordlocker.repository.UserService;
import com.passwordlocker.repository.UserServiceImplementation;

@WebServlet("/userlogin")
public class UserLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserService service = new UserServiceImplementation();
		User user = service.userLogin(email, password);
		HttpSession session = req.getSession();
		session.setAttribute("LoggedUser", user);
		
		resp.sendRedirect("userMenu.jsp");
		
		
	}
}
