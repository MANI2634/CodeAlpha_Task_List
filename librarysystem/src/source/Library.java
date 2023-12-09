package source;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Library extends JFrame  {
	static Library frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
		public static void main(String[] args){
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Library();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibraryManagement = new JLabel("Library Management System");
		lblLibraryManagement.setBounds(96, 11, 265, 22);
		lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLibraryManagement.setForeground(Color.GRAY);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(32, 60, 146, 27);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setBounds(32, 97, 146, 27);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});
		btnLibrarianLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 424, 351);
		lblNewLabel.setIcon(new ImageIcon(Library.class.getResource("/source/iconlib1.png")));
		contentPane.setLayout(null);
		contentPane.add(lblLibraryManagement);
		contentPane.add(btnAdminLogin);
		contentPane.add(lblNewLabel);
		contentPane.add(btnLibrarianLogin);
	}
}
