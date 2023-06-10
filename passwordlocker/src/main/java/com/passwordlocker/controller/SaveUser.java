package com.passwordlocker.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.passwordlocker.entity.User;
import com.passwordlocker.repository.UserService;
import com.passwordlocker.repository.UserServiceImplementation;

@WebServlet("/saveuser")
public class SaveUser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		user.setName(req.getParameter("name"));
		user.setPhoneNumber(req.getParameter("phone"));
		user.setGender(req.getParameter("gender"));
		user.setPassword(req.getParameter("password"));
		user.setEmail(req.getParameter("email"));
		user.setDob(Date.valueOf(req.getParameter("dob")));
		String dob = req.getParameter("dob");

		UserService service = new UserServiceImplementation();
		String message1 = service.saveUser(user);
		HttpSession session = req.getSession();
		session.setAttribute("savemessage1", message1);
		resp.sendRedirect("userLogin.jsp");

	}

}
