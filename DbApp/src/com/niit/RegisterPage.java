package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(100, 100, 450, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(RegisterPage.class.getResource("/com/niit/img1.png")));
		lblNewLabel.setBounds(31, 11, 348, 80);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(31, 102, 332, 345);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 29, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(91, 26, 153, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 109, 46, 14);
		panel.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(91, 105, 54, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(167, 105, 77, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 163, 46, 14);
		panel.add(lblCourse);
		
		final JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(99, 159, 59, 23);
		panel.add(chckbxUg);
		
		final JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(185, 159, 59, 23);
		panel.add(chckbxPg);
		
		JLabel lblDepart = new JLabel("Depart");
		lblDepart.setBounds(10, 240, 46, 14);
		panel.add(lblDepart);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BE", "MBA"}));
		comboBox.setBounds(105, 237, 87, 20);
		panel.add(comboBox);
		
		final JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					 String uname=textField.getText();
					 String pass=textField_1.getText();
					 String gen="";
					 String ug="";
					 String pg="";
					 String dep=(String) comboBox.getSelectedItem();
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
						ug="ug";
						pg="pg";
					  }
					  else if(chckbxUg.isSelected())
					  {
						  ug="ug";
						  pg="null";
					  }
					  else
					  {
						  ug="null";
						  pg="pg";
					  }
					  
					  String str="insert into ureg values(?,?,?,?,?,?)";
					  Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  /*Statement stm=con.createStatement();
					  stm.executeUpdate(str);*/
					  PreparedStatement pt=con.prepareStatement(str);
					  pt.setString(1,uname);
					  pt.setString(2,pass);
					  pt.setString(3, gen);
					  pt.setString(4,ug);
					  pt.setString(5, pg);
					  pt.setString(6, dep);
					  pt.executeUpdate();
					  JOptionPane.showMessageDialog(btnInsert, "Insert!!!");
					  
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnInsert.setBounds(115, 299, 89, 23);
		panel.add(btnInsert);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(10, 69, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 66, 153, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
	}
}
