import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 35, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(138, 79, 769, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TO VIEW RECORDS:");
		lblNewLabel_1.setBounds(49, 78, 128, 17);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		
		JButton btnNewButton = new JButton("VIEW RECORDS");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(49, 106, 168, 36);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRecords obj = new ViewRecords();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("TO VIEW USERS");
		lblNewLabel_2.setBounds(284, 79, 133, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		
		JButton btnNewButton_1 = new JButton("View Users");
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(284, 106, 155, 36);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register_Table obj = new Register_Table();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("TO DELETE RECORDS:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(500, 80, 162, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("DELETE RECORDS");
		btnNewButton_3.setBackground(new Color(0, 255, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Donor obj = new Delete_Donor();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_3.setBounds(500, 106, 162, 31);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(670, 275, 89, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(255, 128, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select obj = new Select();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_4 = new JLabel("TO EDIT RECORDS:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_4.setBounds(49, 183, 141, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("EDIT RECORDS");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_Details obj = new Edit_Details();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBackground(new Color(0, 255, 0));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_4.setBounds(49, 208, 168, 36);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("WELCOME ADMIN");
		lblNewLabel.setBounds(283, 11, 393, 57);
		lblNewLabel.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 45));
		contentPane.add(lblNewLabel);
	}
}
