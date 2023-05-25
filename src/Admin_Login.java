import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Login frame = new Admin_Login();
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
	public Admin_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(258, 177, 79, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(128, 255, 255));
		textField.setBounds(347, 175, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(258, 222, 91, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(128, 255, 255));
		passwordField.setBounds(347, 220, 140, 20);
		contentPane.add(passwordField);
		
		String correctUsername = "admin";
		String correctPassword = "password";
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredUsername = textField.getText();
		        String enteredPassword = passwordField.getText();
		        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
		        	Admin obj = new Admin();
					obj.setVisible(true);
					dispose();
		        } else {
		        	JOptionPane.showMessageDialog(null, "INCORRECT CREDENTIALS");
		        }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(340, 267, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ADMIN DETAILS");
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_2.setBounds(266, 71, 245, 44);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select obj = new Select();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(477, 312, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\CHAITANYA RAJU\\eclipse-workspace\\BloodBank\\img\\360_F_67704008_fxdmJ8wDOqDYts9P3tzdbxqZf8NfWT21.jpg"));
		lblNewLabel_3.setBounds(52, 11, 984, 440);
		contentPane.add(lblNewLabel_3);
	}
}
