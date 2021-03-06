package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewForm frame = new ViewForm();
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
	public ViewForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ViewData");
		lblNewLabel.setBounds(171, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(34, 82, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(113, 82, 177, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGen = new JLabel("Gen");
		lblGen.setBounds(34, 154, 46, 14);
		contentPane.add(lblGen);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 151, 173, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 223, 177, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setBounds(34, 226, 46, 14);
		contentPane.add(lblCity);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u=textField.getText();
					
					String str="select gen,city from reg where uname='"+u+"'";
					
	                Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgldb","sa","");
					
					Statement stm=conn.createStatement();
					
					ResultSet rs=stm.executeQuery(str);
					
					rs.next();
					
					String g1=rs.getString("gen");
					
					String ct=rs.getString("city");
					
					
					textField_1.setText(g1);
					textField_2.setText(ct);
					
					JOptionPane.showMessageDialog(btnView, "Search....");
					
					
					
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setBounds(88, 278, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
				String u=textField.getText();
				
				String ct=textField_2.getText();
				
				String str="update reg set city='"+ct+"' where uname='"+u+"'";
				
				Class.forName("org.h2.Driver");
				
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgldb","sa","");
				
				Statement stm=conn.createStatement();
				
				stm.executeUpdate(str);
				
				JOptionPane.showMessageDialog(btnUpdate, "Updated...");
				
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnUpdate.setBounds(221, 278, 89, 23);
		contentPane.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				try
				{
					String u=textField.getText();
					
					String str="delete from reg where uname='"+u+"'";
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgldb","sa","");
					
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					
					JOptionPane.showMessageDialog(btnDelete, "Deleted..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(335, 278, 89, 23);
		contentPane.add(btnDelete);
	}
}
