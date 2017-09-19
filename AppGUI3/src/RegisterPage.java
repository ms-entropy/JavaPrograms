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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 283);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 21, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(66, 18, 136, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 76, 46, 14);
		panel.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(77, 72, 109, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(228, 72, 109, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 129, 46, 14);
		panel.add(lblCourse);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA"}));
		comboBox.setBounds(77, 126, 103, 20);
		panel.add(comboBox);
		
		JLabel lblDepart = new JLabel("Depart");
		lblDepart.setBounds(10, 182, 46, 14);
		panel.add(lblDepart);
		
		final JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(66, 178, 51, 23);
		panel.add(chckbxUg);
		
		final JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(155, 178, 97, 23);
		panel.add(chckbxPg);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				
				try
				{
					String u=textField.getText();
					String gen="";
					String course=(String) comboBox.getSelectedItem();
					String ug="";
					String pg="";
					if(rdbtnMale.isSelected())
					{
						gen="MALE";
					}
					else
					{
						gen="FEMALE";
					}
					if(chckbxUg.isSelected()&&chckbxPg.isSelected())
					{
						ug="UG";
						pg="PG";
					}
					else if(chckbxUg.isSelected())
					{
						ug="UG";
						pg="NULL";
					}
					else
					{
						ug="NULL";
						pg="PG";
					}
					String str="insert into reg values('"+u+"','"+gen+"','"+course+"','"+ug+"','"+pg+"')";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:reg1");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnRegister,"Inserted!!!");
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnRegister.setBounds(93, 238, 89, 23);
		panel.add(btnRegister);
	}
}