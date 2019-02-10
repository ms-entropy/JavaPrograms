import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class friends extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					friends frame = new friends();
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
	public friends() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.RED);
		lblName.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblName.setBounds(157, 94, 60, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(270, 92, 170, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblAge.setForeground(Color.RED);
		lblAge.setBounds(157, 143, 46, 20);
		contentPane.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 144, 170, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.RED);
		lblEmail.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblEmail.setBounds(157, 211, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(270, 209, 170, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("course");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.PLAIN, 17));
		lblNewLabel.setBounds(157, 256, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(270, 256, 170, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.CYAN);
		lblLogin.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		lblLogin.setBounds(270, 26, 96, 31);
		contentPane.add(lblLogin);
		
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			
			}
			
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdd.setBounds(62, 320, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnView = new JButton("view");
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnView.setBounds(196, 323, 89, 23);
		contentPane.add(btnView);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDelete.setBounds(315, 323, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnUpdate.setBounds(444, 323, 89, 23);
		contentPane.add(btnUpdate);
	}
}
