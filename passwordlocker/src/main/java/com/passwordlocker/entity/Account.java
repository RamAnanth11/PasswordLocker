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

}
