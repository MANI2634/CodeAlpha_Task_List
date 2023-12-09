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

public class AdminLogin extends JFrame {
	static AdminLogin frame;
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
					frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Admin Login Form");
		lblAdminLoginForm.setBounds(126, 0, 220, 22);
		lblAdminLoginForm.setForeground(Color.YELLOW);
		lblAdminLoginForm.setFont(new Font("Engravers MT", Font.BOLD, 18));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setFont(new Font("Engravers MT", Font.BOLD, 11));
		lblEnterName.setForeground(Color.WHITE);
		lblEnterName.setBounds(37, 65, 103, 34);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setFont(new Font("Engravers MT", Font.BOLD, 10));
		lblEnterPassword.setForeground(Color.WHITE);
		lblEnterPassword.setBounds(10, 101, 145, 20);
		
		textField = new JTextField();
		textField.setBounds(150, 72, 172, 20);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(192, 139, 86, 37);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("admin")&&password.equals("admin123")){
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
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
		lblNewLabel.setIcon(new ImageIcon(AdminLogin.class.getResource("/source/icon4.jpg")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
