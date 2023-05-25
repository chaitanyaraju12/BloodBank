import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Delete_Donor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Donor frame = new Delete_Donor();
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
	public Delete_Donor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columns = {"Donor_ID", "Name", "Age", "Sex",
                "Register_Date" , "Blood_Type" , "Blood_Quantity" ,"Phone_no", "State","City"};

		DefaultTableModel obj=new DefaultTableModel(columns,0);
		
		JTable table = new JTable(obj);
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 62, 1042, 367);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("DONOR_ID:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel.setBounds(102, 26, 83, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(184, 24, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connectDB obj_connectDB=new connectDB();
				Connection con=obj_connectDB.get_db();
				if(textField.getText().length()!=0) {
					String query  = "SELECT * from Donor WHERE donor_id='"+textField.getText()+"'";
					connectDB obj_connectDB1=new connectDB();
					Connection con1=obj_connectDB1.get_db();
					java.sql.Statement st=null;
					try {
						st = con1.createStatement();
						ResultSet rs = st.executeQuery(query);
						if(rs.next()!=false) {
							java.sql.Statement st1=null;
							String query1="DELETE FROM Donor WHERE donor_id='"+textField.getText()+"';";
							try {
								st1 = con.createStatement();
								System.out.println(st1.executeQuery(query1));
							}catch(Exception i) {
								System.out.println(i);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "You are not a registered user.");
						}
					}catch(Exception i) {
						System.out.println(i);
				}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "You have not entered anything!!");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(339, 23, 108, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW RECORDS");
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.setRowCount(0);
				connectDB obj_connectDB=new connectDB();
				Connection con=obj_connectDB.get_db();
				java.sql.Statement st=null;
				String query="Select * from Donor";
				try {
					st = con.createStatement();
					ResultSet rs = st.executeQuery(query);
					while(rs.next()!=false) {
						Object[] update2 = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
						obj.addRow(update2);
					}
				}catch(Exception i) {
					System.out.println(i);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(468, 22, 162, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin obj = new Admin();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(255, 128, 0));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(952, 458, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
