package com.ismkr.fyp.views;

import javax.swing.JPanel;

import com.ismkr.fyp.res.Colors;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class LaunchView extends JPanel implements ActionListener{
	
	private JButton btnSignup;
	private JLabel lblNotSigned;
	private LoginView loginView;
	private RegisterView registerView;

	public LaunchView() {
		setSize(App.APP_SIZE);
		setBackground(Colors.lightwhite);
		setLayout(null);
		
		JPanel presentationPane = new JPanel();
		presentationPane.setBounds(0, 0, 300, 600);
		presentationPane.setLayout(null);
		presentationPane.setBackground(Colors.blue);
		add(presentationPane);
		
		JLabel lblMy = new JLabel("My");
		lblMy.setFont(new Font("Tw Cen MT", Font.ITALIC, 40));
		lblMy.setBounds(81, 128, 53, 45);
		lblMy.setForeground(Colors.black);
		presentationPane.add(lblMy);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tw Cen MT", Font.ITALIC, 40));
		lblClass.setBounds(145, 128, 79, 45);
		lblClass.setForeground(Colors.white);
		presentationPane.add(lblClass);
		
		lblNotSigned = new JLabel("Vous n'\u00EAtes pas inscrit ?");
		lblNotSigned.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblNotSigned.setBounds(595, 17, 104, 14);
		lblNotSigned.setForeground(Colors.black);
		add(lblNotSigned);
		
		btnSignup = new JButton("Inscrire");
		btnSignup.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnSignup.setBounds(709, 11, 104, 25);
		btnSignup.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Colors.black));
		btnSignup.setBackground(Colors.white);
		btnSignup.addActionListener(this);
		add(btnSignup);
	}
	
	public void setRegisterView(RegisterView registerView) {
		this.registerView = registerView;
		this.registerView.setBounds(340, 90, 500, 400);
		add(this.registerView);
		registerView.setVisible(false);
	}
	
	public void setLoginView(LoginView loginView) {
		this.loginView = loginView;
		this.loginView.setBounds(340, 90, 500, 400);
		add(this.loginView);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(lblNotSigned.isVisible()) {
			lblNotSigned.setVisible(false);
			registerView.setVisible(true);
			loginView.setVisible(false);
			btnSignup.setText("Connecter");
		} else {
			lblNotSigned.setVisible(true);
			registerView.setVisible(false);
			loginView.setVisible(true);
			btnSignup.setText("Inscrire");
		}
	}
	
}
