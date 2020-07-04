package com.ismkr.fyp.views;

import javax.swing.JPanel;

import com.ismkr.fyp.res.Colors;

public class MainView extends JPanel {

	public MainView() {
		setSize(App.APP_SIZE);
		setBackground(Colors.lightwhite);
		setLayout(null);
	}

	public void addMenu(MainMenu menu) {
		menu.setBounds(0, 0, 80, 600);
		add(menu);
	}

}
