package com.ismkr.fyp.views;

import javax.swing.JPanel;

import com.ismkr.fyp.controllers.LoginController;
import com.ismkr.fyp.res.Colors;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView extends JPanel {
	
	private LoginController controller;
	private JTextField tfEmail;
	private JPasswordField passwordField;
	private JButton btnConnecter;
	
	public LoginView(LoginController controller) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		this.controller = controller;
		
		JLabel title = new JLabel("Connectez-vous sur");
		title.setForeground(Colors.black);
		title.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		title.setBounds(10, 17, 204, 33);
		add(title);
		
		JPanel logo = new JPanel();
		logo.setBounds(224, 15, 112, 35);
		logo.setBackground(Colors.blue);
		add(logo);
		logo.setLayout(null);
		
		JLabel lblMy = new JLabel("My");
		lblMy.setBounds(5, 0, 36, 35);
		logo.add(lblMy);
		lblMy.setForeground(Colors.black);
		lblMy.setFont(new Font("Tw Cen MT", Font.ITALIC, 30));
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(45, 0, 60, 35);
		logo.add(lblClass);
		lblClass.setForeground(Colors.white);
		lblClass.setFont(new Font("Tw Cen MT", Font.ITALIC, 30));
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Colors.black);
		lblEmail.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblEmail.setBounds(10, 76, 169, 14);
		add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Colors.black);
		tfEmail.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		tfEmail.setBounds(10, 94, 169, 25);
		tfEmail.setColumns(10);
		add(tfEmail);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setForeground(new Color(37, 42, 52));
		lblMotDePasse.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblMotDePasse.setBounds(10, 130, 169, 14);
		add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Colors.black);
		passwordField.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		passwordField.setBounds(10, 148, 169, 25);
		add(passwordField);
		
		btnConnecter = new JButton("Connecter");
		btnConnecter.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnConnecter.setBounds(10, 197, 100, 27);
		btnConnecter.setBackground(Colors.pink);
		btnConnecter.setForeground(Colors.white);
		add(btnConnecter);

		btnConnecter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonClicked();
			}
		});
	}

	private void buttonClicked() {
		controller.buttonClicked();
	}
}
