package com.ismkr.fyp.controllers;

import com.ismkr.fyp.listeners.IUserConnection;
import com.ismkr.fyp.views.LoginView;

public class LoginController {
	
	private IUserConnection listener;
	private LoginView signinView;
	
	public LoginController(IUserConnection listener) {
		this.listener = listener;
		signinView = new LoginView(this);
	}
	
	public LoginView getView() {
		return signinView;
	}

	public void buttonClicked() {
		listener.userConnected();
	}

}
