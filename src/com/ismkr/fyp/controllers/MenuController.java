package com.ismkr.fyp.controllers;

import com.ismkr.fyp.listeners.IUserConnection;
import com.ismkr.fyp.views.MainMenu;

public class MenuController {
	
	private IUserConnection listener;
	private MainMenu menu;
	
	public MenuController(IUserConnection listener) {
		this.listener = listener;
		menu = new MainMenu(this);
	}
	
	public MainMenu getView() {
		return menu;
	}

	public void disconnect() {
		listener.userDisconnected();
	}

}
