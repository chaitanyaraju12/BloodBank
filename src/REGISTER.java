import java.awt.Component;
import java.sql.Connection;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class REGISTER extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTER frame = new REGISTER();
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
	public REGISTER() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 35, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(189, 34, 444, 442);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setBounds(31, 127, 101, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(31, 152, 167, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("FULL NAME:");
		lblNewLabel_1.setBounds(246, 127, 91, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JTextField textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(246, 152, 167, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL:");
		lblNewLabel_2.setBounds(31, 180, 50, 18);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(31, 209, 167, 20);
		panel.add(textField_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("SEX:");
		lblNewLabel_3.setBounds(246, 182, 33, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(246, 209, 167, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DATE_OF_BIRTH:");
		lblNewLabel_4.setBounds(31, 246, 130, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JTextField textField_4 = new JTextField();
		textField_4.setBackground(new Color(192, 192, 192));
		textField_4.setBounds(31, 271, 167, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("PASSWORD:");
		lblNewLabel_5.setBounds(246, 246, 101, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		passwordField = new JPasswordField(10);
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setBounds(246, 271, 167, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_9 = new JLabel("CONFIRM PASSWORD:");
		lblNewLabel_9.setBounds(31, 302, 157, 14);
		panel.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		passwordField_1 = new JPasswordField(10);
		passwordField_1.setBackground(new Color(192, 192, 192));
		passwordField_1.setBounds(31, 327, 167, 20);
		panel.add(passwordField_1);
		
		JLabel lblNewLabel_6 = new JLabel("PHONE_NO:");
		lblNewLabel_6.setBounds(246, 302, 78, 14);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JTextField textField_6 = new JTextField();
		textField_6.setBackground(new Color(192, 192, 192));
		textField_6.setBounds(246, 327, 167, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setBounds(158, 376, 141, 38);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] input1 = passwordField.getPassword();
		        char[] input2 = passwordField_1.getPassword();
		        boolean match = Arrays.equals(input1, input2);
		        if(textField_1.getText().length()!=0 && textField_2.getText().length()!=0 && textField_3.getText().length()!=0 && textField_4.getText().length()!=0
	        			&& passwordField.getText().length()!=0 && passwordField_1.getText().length()!=0 && textField_6.getText().length()!=0) {
			        if (match) {
			        	Select obj = new Select();
						obj.setVisible(true);
						dispose();
			        	}
			        else {
			        	 JOptionPane.showMessageDialog(null, "Passwords do not match!");
			        }
			        }
		        else {
		        	JOptionPane.showMessageDialog(null, "Enter all Credentials!!");
		        }
		         
				connectDB obj_connectDB=new connectDB();
				Connection con=obj_connectDB.get_db();
				java.sql.Statement st=null;
				String query="INSERT INTO register values('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"','"+textField_4.getText()
				+"','"+passwordField.getText()+"',"+textField_6.getText()+")";
				try {
					st = con.createStatement();
					System.out.println(st.executeQuery(query));
				}catch(Exception i) {
					System.out.println(i);
				}		
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_8 = new JLabel("REGISTER");
		lblNewLabel_8.setBounds(158, 40, 276, 38);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 23));
		
		
		
		
		
		
		
	}
}
