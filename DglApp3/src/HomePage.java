import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

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
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomepage = new JLabel("HOMEPAGE");
		lblHomepage.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblHomepage.setBounds(167, 11, 128, 21);
		contentPane.add(lblHomepage);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblUsername.setBounds(31, 69, 102, 21);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblPassword.setBounds(31, 137, 81, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(141, 69, 154, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 134, 154, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(103, 199, 89, 23);
		contentPane.add(btnLogin);
		
		final JButton btnMainpage = new JButton("MAINPAGE");
		btnMainpage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnMainpage)
				{
					new MainMenu().setVisible(true);
				}
			}
		});
		btnMainpage.setBounds(229, 199, 112, 23);
		contentPane.add(btnMainpage);
	}
}
