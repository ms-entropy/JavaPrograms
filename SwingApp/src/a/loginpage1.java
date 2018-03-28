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

public class loginpage1 extends JFrame {

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
					loginpage1 frame = new loginpage1();
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
	public loginpage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("LoginPage");
		lblLoginpage.setBounds(175, 23, 74, 14);
		contentPane.add(lblLoginpage);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(45, 76, 61, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(147, 73, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(45, 149, 46, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 146, 144, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					
					String str="select * from vsbuserlogin where uname='"+u+"' OR pass='"+p+"'";
					
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection conn=DriverManager.getConnection("jdbc:odbc:vsblogin","","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					
					if(u.equals(uname)&&p.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess!!");
						new registerpage().setVisible(true);
					}
					
					
					
					
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "LoginFail!!");
					System.out.println(t);
					
				}
			}
		});
		btnLogin.setBounds(160, 197, 89, 23);
		contentPane.add(btnLogin);
	}
}
