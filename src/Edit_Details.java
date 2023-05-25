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

public class Edit_Details extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Details frame = new Edit_Details();
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
	public Edit_Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("DONOR_ID:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(287, 126, 101, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(379, 124, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("BLOOD QUANTITY:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(246, 177, 130, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(192, 192, 192));
		textField_6.setBounds(379, 175, 167, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("DONOR DETAILS");
		lblNewLabel_8.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_8.setBounds(353, 34, 276, 38);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connectDB obj_connectDB=new connectDB();
				Connection con=obj_connectDB.get_db();
				if(textField.getText().length()!=0 && textField_6.getText().length()!=0) {
					java.sql.Statement st=null;
					String query="Update donor set blood_quantity="+textField_6.getText()+" where donor_id='"+textField.getText()+"'";
					try {
						st = con.createStatement();
						System.out.println(st.executeQuery(query));
					}catch(Exception i) {
						System.out.println(i);
					}
					JOptionPane.showMessageDialog(null, "Updated Blood Quantity");
					Admin obj = new Admin();
					obj.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter all Credentials!!");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(362, 220, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin obj = new Admin();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\CHAITANYA RAJU\\eclipse-workspace\\BloodBank\\img\\pngtree-red-effect-blood-background-image_516336.jpg"));
		lblNewLabel_10.setBounds(0, 0, 1184, 590);
		contentPane.add(lblNewLabel_10);
	}
}