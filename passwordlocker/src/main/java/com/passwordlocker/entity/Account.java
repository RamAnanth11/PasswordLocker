package com.passwordlocker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account {
	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "account_name", nullable = false)
	private String accountName;
	@Column(name = "user_name", nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	private String review;
	@Column(name = "user_id", nullable = false)
	private Integer userID;
	
	
	
	public Account() {
		super();
	}



	public Account(String accountName, String userName, String password, String review, Integer userID) {
		this.accountName = accountName;
		this.userName = userName;
		this.password = password;
		this.review = review;
		this.userID = userID;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName + ", userName=" + userName + ", password="
				+ password + ", review=" + review + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getReview() {
		return review;
	}



	public void setReview(String review) {
		this.review = review;
	}



	public Integer getUserID() {
		return userID;
	}



	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	
}
