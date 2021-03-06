package a;

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

public class Viewdetails extends JFrame {

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
					Viewdetails frame = new Viewdetails();
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
	public Viewdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewdetails = new JLabel("ViewDetails");
		lblViewdetails.setBounds(174, 11, 78, 14);
		contentPane.add(lblViewdetails);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(30, 64, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(113, 61, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(30, 130, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 127, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(30, 196, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 193, 157, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					String str="select pass,email from emp where uname='"+u+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection conn=DriverManager.getConnection("jdbc:odbc:sample1","","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String pass=rs.getString(1);
					String email=rs.getString(2);
					textField_1.setText(pass);
					textField_2.setText(email);
					
					JOptionPane.showMessageDialog(btnView, "Search...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setBounds(56, 265, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u=textField.getText();
					String e1=textField_2.getText();
					
					String str="update emp set email='"+e1+"' where uname='"+u+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:sample1","","");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnUpdate, "UpdateSuces!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(186, 265, 89, 23);
		contentPane.add(btnUpdate);
		
		final JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u=textField.getText();
					String str="delete  from emp where uname='"+u+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:sample1","","");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnNewButton,"Deleted!!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton.setBounds(317, 265, 89, 23);
		contentPane.add(btnNewButton);
	}
}
