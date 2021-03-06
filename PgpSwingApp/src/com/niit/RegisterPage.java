package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class RegisterPage extends JFrame {

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
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(36, 50, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(121, 47, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(36, 120, 46, 14);
		contentPane.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(116, 116, 65, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(183, 116, 75, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA", "BSC"}));
		comboBox.setBounds(136, 174, 75, 20);
		contentPane.add(comboBox);
		
		final JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(114, 222, 75, 23);
		contentPane.add(chckbxUg);
		
		final JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(206, 222, 97, 23);
		contentPane.add(chckbxPg);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(36, 177, 46, 14);
		contentPane.add(lblCourse);
		
		JLabel lblDepat = new JLabel("Depat");
		lblDepat.setBounds(36, 226, 46, 14);
		contentPane.add(lblDepat);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u=textField.getText();
					String p=passwordField.getText();
					String gen="";
					String cource=(String) comboBox.getSelectedItem();
					String ug="";
					String pg="";
					
					if(rdbtnMale.isSelected())
					{
					  gen="Male";
					}
					else
					{
						gen="Female";
					}
					
					if(chckbxUg.isSelected()&&chckbxPg.isSelected())
					{
						ug="UG";
						pg="PG";
					}
					else if(chckbxPg.isSelected())
					{
						ug="null";
						pg="PG";
					}
					else if(chckbxUg.isSelected())
					{
						ug="UG";
						pg="null";
					}
					
				    String qstr="insert into ureg values(?,?,?,?,?,?)";
					//String qstr1="insert into ureg values('"+u+"','"+gen+"','"+cource+"','"+ug+"','"+pg+"')";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/pgpproject","sa","");
					//Statement stm=conn.createStatement();
					//stm.executeUpdate(qstr1);
					PreparedStatement pt=conn.prepareStatement(qstr);
					pt.setString(1,u);
					pt.setString(2, p);
					pt.setString(3,gen);
					pt.setString(4,cource);
					pt.setString(5,ug);
					pt.setString(6, pg);
					pt.executeUpdate();
					JOptionPane.showMessageDialog(btnRegister, "Inserted..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBounds(92, 293, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(214, 293, 89, 23);
		contentPane.add(btnView);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(36, 95, 46, 14);
		contentPane.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 89, 115, 20);
		contentPane.add(passwordField);
	}
}
