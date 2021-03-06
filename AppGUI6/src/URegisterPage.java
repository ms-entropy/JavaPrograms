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
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class URegisterPage extends JFrame {

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
					URegisterPage frame = new URegisterPage();
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
	public URegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 25, 374, 286);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 37, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(111, 34, 144, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(26, 93, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 90, 144, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(26, 158, 46, 14);
		panel.add(lblMobile);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 155, 144, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String m=textField_2.getText();
					
					String str="insert into ureg values(?,?,?)";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					PreparedStatement pt=conn.prepareStatement(str);
					pt.setString(1,u);
					pt.setString(2,p);
					pt.setString(3, m);
					pt.executeUpdate();
					JOptionPane.showMessageDialog(btnInsert, "LoginSucess");
					new ULoginPage().setVisible(true);
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnInsert.setBounds(75, 224, 89, 23);
		panel.add(btnInsert);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(197, 224, 89, 23);
		panel.add(btnReset);
	}
}
