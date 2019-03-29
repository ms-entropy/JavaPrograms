package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
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
	public RegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(34, 36, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(34, 99, 46, 14);
		contentPane.add(lblAge);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(34, 143, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(34, 192, 67, 14);
		contentPane.add(lblPassword);
		
		JLabel lblPhoneNo = new JLabel("PHONE NO");
		lblPhoneNo.setBounds(34, 242, 80, 14);
		contentPane.add(lblPhoneNo);
		
		textField = new JTextField();
		textField.setBounds(113, 30, 169, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 93, 174, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 142, 174, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 186, 171, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 236, 169, 27);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnRegister)
				{
					new UserLoginPage().setVisible(true);
				}
			}
		});
		btnRegister.setBounds(313, 78, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(313, 144, 89, 23);
		contentPane.add(btnReset);
	}
}