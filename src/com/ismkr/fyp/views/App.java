package com.ismkr.fyp.views;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JFrame {
	
	private static final String APP_NAME = "My Class";
	public static final Dimension APP_SIZE = new Dimension(850, 600);
	
	public App() {
		init();
	}

	private void init() {
		setTitle(APP_NAME);
		setSize(APP_SIZE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public void setView(JPanel contentPane) {
		setContentPane(contentPane);
	}

}
