package com.ismkr.fyp.controllers;

import com.ismkr.fyp.listeners.IUserConnection;
import com.ismkr.fyp.views.RegisterView;

public class RegisterController {

	private IUserConnection listener;
	private RegisterView signupView;
	
	public RegisterController(IUserConnection listener) {
		this.listener = listener;
		signupView = new RegisterView(this);
	}
	
	public RegisterView getView() {
		return signupView;
	}

	public void buttonClicked() {
		listener.userConnected();
	}
	
}
