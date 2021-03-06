package a;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewDataTableFormat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDataTableFormat frame = new ViewDataTableFormat();
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
	public ViewDataTableFormat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(32, 45, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(132, 42, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 100, 392, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Important code for view tables
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 372, 210);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					 String uname=textField.getText();
    				String str="select * from emp where uname='"+uname+"'";
				//String str="select * from emp";
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						  Connection con=DriverManager.getConnection("jdbc:odbc:sample1","","");
						Statement stm=con.createStatement();
						ResultSet rs=stm.executeQuery(str);
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception t)
				{
					System.out.println("***"+t);
				}
			}
		});
		btnView.setBounds(335, 41, 89, 23);
		contentPane.add(btnView);
	}
}
