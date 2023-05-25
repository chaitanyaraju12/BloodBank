import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Donor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_3;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donor frame = new Donor();
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
	public Donor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(308, 35, 459, 451);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("DONOR DETAILS");
		lblNewLabel_8.setBackground(new Color(240, 240, 240));
		lblNewLabel_8.setBounds(126, 24, 223, 38);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 23));
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(21, 111, 167, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("DONOR_ID:");
		lblNewLabel.setBounds(25, 94, 101, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(241, 111, 167, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setBounds(241, 94, 60, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(241, 161, 167, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("AGE:");
		lblNewLabel_2.setBounds(241, 144, 33, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("SEX:");
		lblNewLabel_3.setBounds(21, 142, 33, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setBounds(21, 161, 168, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setBounds(241, 211, 167, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("REGISTER_DATE:");
		lblNewLabel_4.setBounds(241, 192, 116, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_5 = new JLabel("BLOOD_TYPE:");
		lblNewLabel_5.setBounds(21, 192, 101, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setBounds(21, 211, 167, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBounds(241, 260, 167, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("BLOOD QUANTITY:");
		lblNewLabel_6.setBounds(241, 242, 130, 14);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_11 = new JLabel("PHONE NUMBER:");
		lblNewLabel_11.setBounds(21, 242, 116, 14);
		panel.add(lblNewLabel_11);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(255, 255, 255));
		textField_9.setBounds(21, 260, 167, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(255, 255, 255));
		textField_7.setBounds(21, 307, 167, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("STATE:");
		lblNewLabel_7.setBounds(21, 291, 47, 14);
		panel.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_9 = new JLabel("CITY:");
		lblNewLabel_9.setBounds(241, 291, 46, 14);
		panel.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(255, 255, 255));
		textField_8.setBounds(241, 307, 167, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setBounds(144, 358, 130, 61);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()!=0 && textField_1.getText().length()!=0 && textField_2.getText().length()!=0 && textField_3.getText().length()!=0 && 
						textField_4.getText().length()!=0 && textField_5.getText().length()!=0 && textField_6.getText().length()!=0 && textField_9.getText().length()!=0 && textField_7.getText().length()!=0 &&
						textField_8.getText().length()!=0) {
					Donor1 obj = new Donor1();
					obj.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter all Credentials!!");
				}
				
				connectDB obj_connectDB=new connectDB();
				Connection con=obj_connectDB.get_db();
				java.sql.Statement st=null;
				String query="INSERT INTO Donor values('"+textField.getText()+"','"+textField_1.getText()+"',"+textField_2.getText()+",'"+textField_3.getText()+"','"+textField_4.getText()
				+"','"+textField_5.getText()+"',"+textField_6.getText()+","+textField_9.getText()+",'"+textField_7.getText()+"','"+textField_8.getText()+"')";
				try {
					st = con.createStatement();
					System.out.println(st.executeQuery(query));
				}catch(Exception i) {
					System.out.println(i);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setBounds(308, 396, 89, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select obj = new Select();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\CHAITANYA RAJU\\eclipse-workspace\\BloodBank\\img\\pngtree-red-effect-blood-background-image_516336.jpg"));
		lblNewLabel_10.setBounds(0, 0, 1184, 590);
		contentPane.add(lblNewLabel_10);
	}
}
