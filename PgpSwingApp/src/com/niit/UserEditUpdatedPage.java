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

public class UserEditUpdatedPage extends JFrame {

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
					UserEditUpdatedPage frame = new UserEditUpdatedPage();
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
	public UserEditUpdatedPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 27, 377, 299);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsereditupdatepage = new JLabel("UserEditUpdatePage");
		lblUsereditupdatepage.setBounds(95, 11, 110, 23);
		panel.add(lblUsereditupdatepage);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(28, 65, 97, 23);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 66, 140, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(28, 124, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 121, 139, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCource = new JLabel("Cource");
		lblCource.setBounds(28, 186, 46, 14);
		panel.add(lblCource);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 183, 140, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String u=textField.getText();
					String qstr1="select pass,cource from ureg where uname='"+u+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/pgpproject","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(qstr1);
					rs.next();
					textField_1.setText(rs.getString(1).trim());
					textField_2.setText(rs.getString(2).trim());
					
					
					
					JOptionPane.showMessageDialog(btnView, "SearchSucess!!");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnView.setBounds(55, 250, 89, 23);
		panel.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String c=textField_2.getText();
					String str="update ureg set pass='"+p+"',cource='"+c+"' where uname='"+u+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/pgpproject","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnUpdate, "UpdatedSucess!!");
					
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnUpdate.setBounds(180, 250, 89, 23);
		panel.add(btnUpdate);
	}
}
