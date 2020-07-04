package com.ismkr.fyp.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.ismkr.fyp.controllers.RegisterController;
import com.ismkr.fyp.res.Colors;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegisterView extends JPanel {
	
	private RegisterController controller;
	private JTextField tfEmail;
	private JPasswordField passwordField;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JComboBox<String> cbProfession;

	public RegisterView(RegisterController controller) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		this.controller = controller;
		
		JPanel logo = new JPanel();
		logo.setLayout(null);
		logo.setBackground(new Color(8, 217, 214));
		logo.setBounds(209, 15, 112, 35);
		add(logo);
		
		JLabel lblMy = new JLabel("My");
		lblMy.setForeground(new Color(37, 42, 52));
		lblMy.setFont(new Font("Tw Cen MT", Font.ITALIC, 30));
		lblMy.setBounds(5, 0, 36, 35);
		logo.add(lblMy);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setForeground(new Color(234, 234, 234));
		lblClass.setFont(new Font("Tw Cen MT", Font.ITALIC, 30));
		lblClass.setBounds(45, 0, 60, 35);
		logo.add(lblClass);
		
		JLabel lblInscrivezvousSur = new JLabel("Inscrivez-vous sur");
		lblInscrivezvousSur.setForeground(new Color(37, 42, 52));
		lblInscrivezvousSur.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblInscrivezvousSur.setBounds(10, 17, 189, 33);
		add(lblInscrivezvousSur);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(37, 42, 52));
		lblEmail.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblEmail.setBounds(233, 72, 169, 14);
		add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(new Color(37, 42, 52));
		tfEmail.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		tfEmail.setColumns(10);
		tfEmail.setBounds(233, 90, 169, 25);
		add(tfEmail);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setForeground(new Color(37, 42, 52));
		lblMotDePasse.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblMotDePasse.setBounds(233, 126, 169, 14);
		add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(37, 42, 52));
		passwordField.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		passwordField.setBounds(233, 144, 169, 25);
		add(passwordField);
		
		JButton btnInscrire = new JButton("Inscrire");
		btnInscrire.setForeground(new Color(234, 234, 234));
		btnInscrire.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnInscrire.setBackground(new Color(255, 46, 99));
		btnInscrire.setBounds(304, 260, 100, 27);
		add(btnInscrire);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(new Color(37, 42, 52));
		lblNom.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNom.setBounds(10, 126, 169, 14);
		add(lblNom);
		
		tfNom = new JTextField();
		tfNom.setForeground(new Color(37, 42, 52));
		tfNom.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		tfNom.setColumns(10);
		tfNom.setBounds(10, 144, 169, 25);
		add(tfNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setForeground(new Color(37, 42, 52));
		lblPrnom.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblPrnom.setBounds(10, 180, 169, 14);
		add(lblPrnom);
		
		tfPrenom = new JTextField();
		tfPrenom.setForeground(new Color(37, 42, 52));
		tfPrenom.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(10, 198, 169, 25);
		add(tfPrenom);
		
		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setForeground(new Color(37, 42, 52));
		lblProfession.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblProfession.setBounds(10, 73, 169, 14);
		add(lblProfession);
		
		cbProfession = new JComboBox<>();
		cbProfession.setModel(new DefaultComboBoxModel<>(new String[] {"Professeur", "Etudiant"}));
		cbProfession.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		cbProfession.setBounds(10, 90, 169, 25);
		cbProfession.setBackground(Colors.white);
		add(cbProfession);

		btnInscrire.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonClicked();
			}
		});
	}

	protected void buttonClicked() {
		controller.buttonClicked();
	}
}
