import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ViewTableData extends JFrame {

	private JPanel contentPane;
	 JPanel panel=new JPanel();
	 JTable table=new JTable();
	 private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTableData frame = new ViewTableData();
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
	public ViewTableData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewdata = new JButton("ViewData");
		btnViewdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
			    String pid=textField.getText();		
				String str="select * from addproduct where pid='"+pid+"'";
				Class.forName("org.h2.Driver");
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/krr","sa","");
				Statement stm=conn.createStatement();
				ResultSet rs=stm.executeQuery(str);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception y)
				{
					
				}
				
			}
		});
		btnViewdata.setBounds(311, 32, 89, 23);
		contentPane.add(btnViewdata);
		//Important code for view tables
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.setBounds(26, 74, 398, 332);
				contentPane.add(panel);
				panel.setLayout(null);
				
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 11, 381, 310);
				panel.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				
				textField = new JTextField();
				textField.setBounds(103, 33, 137, 20);
				contentPane.add(textField);
				textField.setColumns(10);
	}
}
