import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class LoginPage extends JFrame {

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
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(41, 26, 412, 280);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("ADMIN");
		lblUname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUname.setBounds(25, 104, 46, 14);
		panel.add(lblUname);
		
		JLabel lblPass = new JLabel("PASS");
		lblPass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPass.setBounds(25, 173, 46, 14);
		panel.add(lblPass);
		
		textField = new JTextField();
		textField.setBounds(148, 101, 108, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 170, 108, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				try
				{
					if(evt.getSource()==btnLogin)
					{
						String u=textField.getText();
						String p=textField_1.getText();
						String str="select * from ulogin";
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						Connection con=DriverManager.getConnection("jdbc:odbc:foo4");
						Statement stm=con.createStatement();
						ResultSet rs=stm.executeQuery(str);
						rs.next();
						String uname=rs.getString(1);
						String pass=rs.getString(2);
						if(u.equals(uname)&&p.equals(pass))
						{
							JOptionPane.showMessageDialog(btnLogin, "LoginSucess");
							new RegisterPage().setVisible(true);
							
						}
						else
						{
							JOptionPane.showMessageDialog(btnLogin, "LoginFail!!!");
						}
					}
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnLogin.setBounds(80, 225, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReset.setBounds(215, 225, 89, 23);
		panel.add(btnReset);
		
		JLabel lblAdminlogin = new JLabel("ADMINLOGIN");
		lblAdminlogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAdminlogin.setBounds(135, 25, 121, 30);
		panel.add(lblAdminlogin);
	}
}
