package com.ismkr.fyp.controllers;

import javax.swing.JPanel;

import com.ismkr.fyp.views.LaunchView;

public class LaunchController {
	
	private LaunchView launchView;
	private LoginController loginController;
	private RegisterController registerController;
	
	public LaunchController(LoginController loginController, RegisterController registerController) {
		launchView = new LaunchView();
		
		this.loginController = loginController;
		launchView.setLoginView(this.loginController.getView());

		this.registerController = registerController;
		launchView.setRegisterView(this.registerController.getView());
		
		launchView.repaint();
	}
	
	public JPanel getView() {
		return launchView;
	}
	
}
