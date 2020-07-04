package com.ismkr.fyp.controllers;

import java.awt.EventQueue;

import javax.swing.JPanel;

import com.ismkr.fyp.listeners.IUserConnection;
import com.ismkr.fyp.views.App;

public class MainController implements IUserConnection {
	
	private static App app;
	private static LoginController loginController;
	private static RegisterController registerController;
	private static LaunchController launchController;
	private static MainViewController mainViewController;
	private static MenuController menuController;
	
	public MainController() {
		loginController = new LoginController(this);
		registerController = new RegisterController(this);
		launchController = new LaunchController(loginController, registerController);
		mainViewController = new MainViewController();
		menuController = new MenuController(this);

		app = new App();
		
		mainViewController.addMenu(menuController.getView());
	}

	/**
	 * Resets all views to the initial state
	 */
	private void reset() {
		loginController = new LoginController(this);
		registerController = new RegisterController(this);
		launchController = new LaunchController(loginController, registerController);
		mainViewController = new MainViewController();
		menuController = new MenuController(this);

		mainViewController.addMenu(menuController.getView());
	}
	
	/**
	 * This method sets the contentPane of the Frame with the given panel
	 * it sets the view showed in the app
	 * @param contentPane
	 */
	public void setView(JPanel contentPane) {
		app.setView(contentPane);
	}
	
	/**
	 * Make the Frame visible
	 */
	public void setVisible() {
		app.setVisible(true);
	}

	/**
	 * Shows the main view of the user, the home view of the app
	 */
	@Override
	public void userConnected() {
		app.setView((JPanel) mainViewController.getView());
		reset();
	}

	/**
	 * Disconnects the user
	 */
	@Override
	public void userDisconnected() {
		app.setView((JPanel) launchController.getView());
		reset();
	}
	
	public static void main(String[] args) {
		
		MainController controller = new MainController();
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				controller.setView((JPanel) launchController.getView());
				controller.setVisible();
//				app.setView(launchController.getView());
//				app.setView(mainViewController.getView());
			}
			
		});
	}
	
}
