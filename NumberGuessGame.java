package numberguessgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberGuessGame extends JFrame {
	int k;

	int answer;

	int getk() {
		return k;

	}

	int getAnswer() {
		return answer;
	}

	void setAnswer() {
		this.answer = (int) (Math.random() * 100 + 1);
	}

	void setK(int k) {
		this.k = k;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterTheNumber;

	/**
	 * Launch the application.
	 */

	public static void noguess(JLabel l5, JLabel l6, JLabel l7, JTextField textField, int k, int answer,
			NumberGuessGame obj) {

		if (k > 0) {
			int check = 0;
			int guess = 0;
			if (textField.getText().trim().length() > 0) {
				try {
					guess = Integer.parseInt(textField.getText());

				} catch (Exception e) {
					l5.setForeground(Color.red);
					l6.setText("#%*");
					l7.setText("" + (k - 1));
					if (k - 1 == 0 && check == 0) {
						l5.setForeground(Color.red);
						l5.setText("You ran out of tries!.You lose!.The Answer is " + answer);
						textField.setVisible(false);
					}
					obj.setK(k - 1);

					l5.setText("Invalid Format!.Only Number is Valid");
					return;
				}
			} else {
				l5.setForeground(Color.red);
				l5.setText("Empty!.Please Enter the Number(Ex:89)");
				l6.setText("");
				l7.setText("" + (k - 1));
				if (k - 1 == 0 && check == 0) {
					l5.setForeground(Color.red);
					l5.setText("You ran out of tries!.You lose!.The Answer is " + answer);
					textField.setVisible(false);
				}
				obj.setK(k - 1);

				return;
			}

			if (guess > 100 || guess <= 0) {
				l5.setForeground(Color.red);
				l5.setText("Invalid!.Guess Between 1 and 100");
			} else if (guess == answer) {

				l5.setForeground(Color.black);
				l5.setText("You guessed the number!. You win!");
				textField.setText("Congratulations!!!");
				check = 1;
			} else if (guess > answer) {
				l5.setForeground(Color.red);
				l5.setText("Too High! Try again!");
			} else if (guess < answer) {
				l5.setForeground(Color.red);
				l5.setText("Too low!Try again!");
			}

			l6.setText("" + guess);
			l7.setText("" + (k - 1));
			if (k - 1 == 0 && check == 0) {
				l5.setForeground(Color.red);
				l5.setText("You ran out of tries!.You lose!.The Answer is " + answer);
				textField.setVisible(false);
			}
			obj.setK(k - 1);

		}
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberGuessGame obj = new NumberGuessGame();

					NumberGuessGame frame1 = new NumberGuessGame(obj);
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	NumberGuessGame() {

	}

	public NumberGuessGame(NumberGuessGame obj) {

		setTitle("NumberGuessGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("I'm thinking of a number between 1 and 100.");
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		lblNewLabel.setBounds(58, 0, 376, 35);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("You have  6 tries to guess the number");
		lblNewLabel_1.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblNewLabel_1.setBounds(68, 24, 275, 19);
		contentPane.add(lblNewLabel_1);

		txtEnterTheNumber = new JTextField();
		txtEnterTheNumber.setVisible(false);
		txtEnterTheNumber.setText("Enter The Number");
		txtEnterTheNumber.setBounds(110, 91, 151, 35);
		contentPane.add(txtEnterTheNumber);
		txtEnterTheNumber.setColumns(10);

		JLabel l5 = new JLabel("");
		l5.setForeground(Color.RED);
		l5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		l5.setBounds(39, 193, 368, 23);
		contentPane.add(l5);

		JLabel l6 = new JLabel("0");
		l6.setBounds(231, 137, 38, 24);
		contentPane.add(l6);

		JLabel l7 = new JLabel("6");
		l7.setBounds(230, 162, 36, 14);
		contentPane.add(l7);

		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				obj.setAnswer();
				obj.setK(6);

				txtEnterTheNumber.setVisible(true);

			}
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setToolTipText("Start the game");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(80, 227, 109, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("RESTART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				obj.setK(6);
				obj.setAnswer();
				txtEnterTheNumber.setVisible(true);
				l5.setText("");
				txtEnterTheNumber.setText("Enter The Number:");
				l6.setText(0 + "");
				l7.setText("" + 6);

			}
		});
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setToolTipText("Restart The Game ");
		btnNewButton_1.setBounds(231, 227, 103, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("SUBMIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int k = obj.getk();
				int answer = obj.getAnswer();

				noguess(l5, l6, l7, txtEnterTheNumber, k, answer, obj);
			}
		});
		btnNewButton_2.setToolTipText("Submit your Guess");
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnNewButton_2.setBounds(273, 96, 103, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_2 = new JLabel("Guess a Number!");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 14));
		lblNewLabel_2.setLabelFor(this);
		lblNewLabel_2.setBounds(127, 46, 151, 34);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Previous  Guesses :");
		lblNewLabel_3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		lblNewLabel_3.setBounds(110, 137, 117, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Guesses Remaining :");
		lblNewLabel_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		lblNewLabel_4.setBounds(110, 162, 124, 14);
		contentPane.add(lblNewLabel_4);

	}
}
 