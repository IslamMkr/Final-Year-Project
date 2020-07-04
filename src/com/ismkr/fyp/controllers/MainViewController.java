package com.ismkr.fyp.controllers;

import com.ismkr.fyp.views.MainMenu;
import com.ismkr.fyp.views.MainView;

public class MainViewController {

	private MainView mainView;
	
	public MainViewController() {
		mainView = new MainView();
	}
	
	public MainView getView() {
		return mainView;
	}
	
	public void addMenu(MainMenu menu) {
		mainView.addMenu(menu);
	}
	
}
