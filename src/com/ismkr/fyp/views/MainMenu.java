package com.ismkr.fyp.views;

import javax.swing.JPanel;

import com.ismkr.fyp.controllers.MenuController;
import com.ismkr.fyp.res.Colors;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainMenu extends JPanel implements MouseListener {

	private MenuController controller;
	
	private JPanel currentPane;
	private JLabel currentLbl;
	
	private JPanel panelHome;
	private JPanel panelPlanning;
	private JPanel panelClass;
	private JPanel panelNote;
	private JLabel lblHome;
	private JLabel lblPlanning;
	private JLabel lblClasses;
	private JLabel lblNotes;
	private JPanel panelLogout;
	
	public MainMenu(MenuController controller) {
		setSize(80, 600);
		setBackground(Colors.darknight);
		setLayout(null);
		
		this.controller = controller;
		
		panelHome = new JPanel();
		panelHome.setBackground(Colors.lightwhite);
		panelHome.setBounds(0, 100, 80, 60);
		panelHome.setLayout(null);
		panelHome.addMouseListener(this);
		add(panelHome);
		
		lblHome = new JLabel("Acceuil");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(0, 0, 80, 60);
		lblHome.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblHome.setForeground(Colors.pink);
		panelHome.add(lblHome);
		
		panelPlanning = new JPanel();
		panelPlanning.setBackground(Colors.darknight);
		panelPlanning.setLayout(null);
		panelPlanning.setBounds(0, 160, 80, 60);
		panelPlanning.addMouseListener(this);
		add(panelPlanning);
		
		lblPlanning = new JLabel("Planning");
		lblPlanning.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanning.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblPlanning.setBounds(0, 0, 80, 60);
		lblPlanning.setForeground(Colors.white);
		panelPlanning.add(lblPlanning);
		
		panelClass = new JPanel();
		panelClass.setBackground(Colors.darknight);
		panelClass.setLayout(null);
		panelClass.setBounds(0, 220, 80, 60);
		panelClass.addMouseListener(this);
		add(panelClass);
		
		lblClasses = new JLabel("Classes");
		lblClasses.setHorizontalAlignment(SwingConstants.CENTER);
		lblClasses.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblClasses.setBounds(0, 0, 80, 60);
		lblClasses.setForeground(Colors.white);
		panelClass.add(lblClasses);
		
		panelNote = new JPanel();
		panelNote.setBackground(Colors.darknight);
		panelNote.setLayout(null);
		panelNote.setBounds(0, 280, 80, 60);
		panelNote.addMouseListener(this);
		add(panelNote);
		
		lblNotes = new JLabel("Notes");
		lblNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotes.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNotes.setBounds(0, 0, 80, 60);
		lblNotes.setForeground(Colors.white);
		panelNote.add(lblNotes);
		
		currentPane = panelHome;
		currentLbl = lblHome;
		
		panelLogout = new JPanel();
		panelLogout.setLayout(null);
		panelLogout.setBackground(Colors.pink);
		panelLogout.setBounds(0, 500, 80, 60);
		panelLogout.addMouseListener(this);
		add(panelLogout);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(new Color(234, 234, 234));
		lblLogout.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblLogout.setBounds(0, 0, 80, 60);
		panelLogout.add(lblLogout);
	}

	/*******************************************************
	 * *****************************************************
	 *              Handling Mouse Events
	 * *****************************************************
	 * ******************************************************/
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(panelHome)) {
			currentPane.setBackground(Colors.darknight);
			currentLbl.setForeground(Colors.white);
			panelHome.setBackground(Colors.lightwhite);
			lblHome.setForeground(Colors.pink);
			currentPane = panelHome;
			currentLbl = lblHome;
		} else if(e.getSource().equals(panelPlanning)) {
			currentPane.setBackground(Colors.darknight);
			currentLbl.setForeground(Colors.white);
			panelPlanning.setBackground(Colors.lightwhite);
			lblPlanning.setForeground(Colors.pink);
			currentPane = panelPlanning;
			currentLbl = lblPlanning;
		} else if(e.getSource().equals(panelClass)) {
			currentPane.setBackground(Colors.darknight);
			currentLbl.setForeground(Colors.white);
			panelClass.setBackground(Colors.lightwhite);
			lblClasses.setForeground(Colors.pink);
			currentPane = panelClass;
			currentLbl = lblClasses;
		} else if(e.getSource().equals(panelNote)) {
			currentPane.setBackground(Colors.darknight);
			currentLbl.setForeground(Colors.white);
			panelNote.setBackground(Colors.lightwhite);
			lblNotes.setForeground(Colors.pink);
			currentPane = panelNote;
			currentLbl = lblNotes;
		} else if(e.getSource().equals(panelLogout)) {
			controller.disconnect();
		}
	}
	
	@Override public void mousePressed(MouseEvent e) {}
	@Override public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource().equals(panelHome) && !currentPane.equals(panelHome)) panelHome.setBackground(Colors.grey);
		else if(e.getSource().equals(panelPlanning) && !currentPane.equals(panelPlanning)) panelPlanning.setBackground(Colors.grey);
		else if(e.getSource().equals(panelClass) && !currentPane.equals(panelClass)) panelClass.setBackground(Colors.grey);
		else if(e.getSource().equals(panelNote) && !currentPane.equals(panelNote)) panelNote.setBackground(Colors.grey);
		else if(e.getSource().equals(panelLogout)) panelLogout.setBackground(Color.red);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource().equals(panelHome) && !currentPane.equals(panelHome)) panelHome.setBackground(Colors.darknight);
		else if(e.getSource().equals(panelPlanning) && !currentPane.equals(panelPlanning)) panelPlanning.setBackground(Colors.darknight);
		else if(e.getSource().equals(panelClass) && !currentPane.equals(panelClass)) panelClass.setBackground(Colors.darknight);
		else if(e.getSource().equals(panelNote) && !currentPane.equals(panelNote)) panelNote.setBackground(Colors.darknight);
		else if(e.getSource().equals(panelLogout)) panelLogout.setBackground(Colors.pink);
	}
}
