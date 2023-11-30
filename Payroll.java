package Payroll_System;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class Payroll {

	private JFrame frame;
	private JTextField textField;
	private JTextField name;
	private JTextField address;
	private JTextField code;
	private JTextField city;
	private JTextField salary;
	private JTextField overtime;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	Double lblNewLabel_2_2_3;
	Double innercity;
	Double Basic;
	Double overtime1;
	Double Gross;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter()
				{
			
			
			public void WindowActivated(WindowEvent args)
			{
				int refs=1325+(int)(Math.random()*4238);
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tdate=new SimpleDateFormat("dd-MMM-yyyy");
				tdate.format(timer.getTime());
				//textField_10.setText(tdate.format(timer.getTime()));
				String sRef=String.format("%.2f ",refs);
					
				textField.setText(sRef);
				
				}
	});
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(0,0,1370,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Ref.No");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(36, 92, 156, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(36, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(36, 117, 107, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(36, 142, 134, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Post Code");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(36, 167, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(177, 90, 320, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		name = new JTextField();
		name.setBounds(177, 115, 320, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setBounds(177, 140, 320, 20);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		code = new JTextField();
		code.setBounds(177, 165, 320, 20);
		frame.getContentPane().add(code);
		code.setColumns(10);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Inner city weighting");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(36, 250, 134, 14);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Basic Salary");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_2.setBounds(36, 275, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_2);
		
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Over time");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_3.setBounds(36, 298, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("Gross Pay");
		lblNewLabel_2_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_4.setBounds(36, 375, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_4);
		
		city = new JTextField();
		city.setBounds(177, 248, 86, 20);
		frame.getContentPane().add(city);
		city.setColumns(10);
		
		salary = new JTextField();
		salary.setBounds(177, 273, 86, 20);
		frame.getContentPane().add(salary);
		salary.setColumns(10);
		
		overtime = new JTextField();
		overtime.setBounds(177, 296, 86, 20);
		frame.getContentPane().add(overtime);
		overtime.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(177, 369, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("Pensionabel Pay");
		lblNewLabel_2_2_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_5.setBounds(36, 400, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_5);
		
		JLabel lblNewLabel_2_2_6 = new JLabel("Net Pay");
		lblNewLabel_2_2_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_6.setBounds(36, 425, 107, 14);
		frame.getContentPane().add(lblNewLabel_2_2_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(177, 398, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(177, 423, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_4_4 = new JLabel("Tax\r\n");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_4.setBounds(355, 276, 46, 14);
		frame.getContentPane().add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Pension");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_5.setBounds(355, 299, 71, 14);
		frame.getContentPane().add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Student Loan");
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_6.setBounds(355, 325, 86, 14);
		frame.getContentPane().add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("NI Payment");
		lblNewLabel_4_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_7.setBounds(355, 350, 86, 14);
		frame.getContentPane().add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_8 = new JLabel("Taxabel Pay");
		lblNewLabel_4_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_8.setBounds(355, 376, 106, 14);
		frame.getContentPane().add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_4_9 = new JLabel("Deduction");
		lblNewLabel_4_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_9.setBounds(355, 401, 86, 14);
		frame.getContentPane().add(lblNewLabel_4_9);
		
		textField_15 = new JTextField();
		textField_15.setBounds(471, 273, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(471, 298, 86, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(471, 322, 86, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(471, 347, 86, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(471, 373, 86, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(471, 404, 86, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(655, 87, 424, 225);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton_1 = new JButton("Pay Slip");
		;
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//rtfPayslip.append("Owane Aviatio");
				
			}
		});
		btnNewButton_1.setBounds(889, 347, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Net wages");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A00,A30,B40,Pensionabelpay,TaxabelPay;
				double deduction,Pension,studentloan,Nipayment,Total,netpay;
				innercity=Double.parseDouble(city.getText());
				Basic=Double.parseDouble(salary.getText());
				overtime1=Double.parseDouble(overtime.getText());
				Gross=innercity+Basic+overtime1;
				String Grosspay=String.format("$% 2f", Gross);
				textField_7.setText(Grosspay);
				//*************
				try {
					if(comboBox_2.getSelectedItem().equals("A000"))
					{
						A00=(Gross *9)/100;
						deduction=Gross-A00;
						Pension=(deduction *12)/100;
						studentloan=Pension*A00;
						studentloan=Gross-studentloan;
						studentloan=(studentloan*5.9)/100;
						Nipayment=studentloan+Pension*A00;
						Nipayment=Gross-Nipayment;
						Nipayment=(Nipayment*4.2)/100;
						String TaxPaid=String.format("% 2f", A00);
						textField_15.setText(TaxPaid);
						textField_15.setText("$"+TaxPaid);
						
						
						
						
						
						String  PensionPay=String.format("% 2f", Pension);
						 textField_16.setText(PensionPay);
						 textField_16.setText("$"+PensionPay);
						 
						 String studentloanpaid=String.format("% 2f",studentloan);
						 textField_17.setText(studentloanpaid);
						 textField_17.setText("$"+studentloanpaid);
						 
						 
						
						
						 String Nipaymentt=String.format("% 2f",Nipayment);
						 textField_18.setText(Nipaymentt);
						 textField_18.setText("$"+Nipaymentt);
						 Total=A00*Pension*studentloan*Nipayment;
						 netpay=Gross-Total;
						 
						 String tdeduc=String.format("% 2f",Total);
						 textField_20.setText(tdeduc);
						 textField_20.setText("$"+tdeduc);
						 
						 String netpayy=String.format("% 2f",netpay);
						 textField_9.setText(netpayy);
						 textField_9.setText("$"+netpayy);
						
						 String Taxperiod=comboBox.getSelectedItem().toString();
						 
						 TaxabelPay=Double.parseDouble(Taxperiod);
						 Pensionabelpay= TaxabelPay* Pension;
						 TaxabelPay= TaxabelPay*A00;
						 
						 String pensional=String.format("% 2f",Pensionabelpay);
						 textField_8.setText(pensional);
						 textField_8.setText("$"+pensional);
						 
						 String taxabel=String.format("% 2f",TaxabelPay);
						 textField_19.setText(taxabel);
						 textField_19.setText("$"+taxabel);
						
					}
					
					//textField_7.setText("$"+Grosspay);
				}
				catch(NumberFormatException e1)
				{
					JOptionPane.showConfirmDialog(null, "enter a vald number","Payroll System",
							JOptionPane.INFORMATION_MESSAGE	);
				}
				
				 String sInnercity=String.format("% 2f",innercity);
					city.setText(sInnercity);
					
					String sBasic=String.format("% 2f",Basic);
					salary.setText(sBasic);
					
					String sOver=String.format("$% 2f",overtime1);
					overtime.setText(sOver);
				
			}	
			
		});
		btnNewButton.setBounds(772, 347, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	rtfPayslip.setText(null);
				textField.setText(null);
				name.setText(null);
				address.setText(null);
				code.setText(null);
				city.setText(null);
				salary.setText(null);
				overtime.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				
				//textField_13.setText(null);
				textField_14.setText(null);
				textField_15.setText(null);
				textField_16.setText(null);
				textField_17.setText(null);
				textField_18.setText(null);
				textField_19.setText(null);
				textField_20.setText(null);
			
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(1007, 347, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit","ps", JOptionPane.YES_NO_OPTION, 0)== JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				
			}
			}
		});
		btnNewButton_3.setBounds(889, 400, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("PaySlip");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(670, 49, 97, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Employee Payroll System");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 19));
		lblNewLabel_3.setBounds(273, 21, 353, 37);
		frame.getContentPane().add(lblNewLabel_3);
	
	}
}
