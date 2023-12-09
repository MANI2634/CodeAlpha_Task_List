package source;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class LibrarianLogin extends JFrame {
	static LibrarianLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianLogin();
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
	public LibrarianLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Librarian Login Form");
		lblAdminLoginForm.setBounds(129, 5, 162, 22);
		lblAdminLoginForm.setForeground(Color.WHITE);
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setForeground(Color.RED);
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterName.setBounds(62, 55, 86, 14);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setForeground(Color.RED);
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterPassword.setBounds(43, 103, 116, 14);
		
		textField = new JTextField();
		textField.setBounds(150, 53, 172, 20);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(192, 139, 86, 37);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			//System.out.println(name+" "+password);
			if(LibrarianDao.validate(name, password)){
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 101, 172, 20);
		contentPane.setLayout(null);
		contentPane.add(lblAdminLoginForm);
		contentPane.add(lblEnterName);
		contentPane.add(lblEnterPassword);
		contentPane.add(passwordField);
		contentPane.add(textField);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LibrarianLogin.class.getResource("/source/icon5.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
