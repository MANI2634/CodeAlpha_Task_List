package word_counter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Word_Character_Count extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Word_Character_Count frame = new Word_Character_Count();
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
	public Word_Character_Count() {
		setTitle("Word_Character_Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setSelectedTextColor(SystemColor.textHighlight);
		textArea.setToolTipText("Type here..");
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(51, 104, 550, 225);
		contentPane.add(textArea);
		
		JLabel l1 = new JLabel("Character :");
		l1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		l1.setBounds(49, 24, 141, 32);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Word :");
		l2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		l2.setBounds(50, 56, 130, 32);
		contentPane.add(l2);
		
		JButton click = new JButton("Click");
		click.setToolTipText("Submit Text");
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textArea.getText();
				l1.setText("Character : "+text.length());
				String word[]=text.split("\\s");
				l2.setText("Words : "+word.length);
				
				
				}
		});
		click.setBackground(SystemColor.activeCaption);
		click.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		click.setBounds(145, 372, 109, 37);
		contentPane.add(click);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setToolTipText("Clear the paragraph");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				l1.setText("Character :");
				l2.setText("Word :");
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setBounds(344, 372, 109, 37);
		contentPane.add(btnNewButton);
		
		
		
	
			
		
	}
}
