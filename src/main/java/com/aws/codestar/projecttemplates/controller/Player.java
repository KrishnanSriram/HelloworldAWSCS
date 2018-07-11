package com.aws.codestar.projecttemplates.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	private String playerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobile;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String playerId, String firstName, String lastName, String emailId, String mobile) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobile = mobile;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}