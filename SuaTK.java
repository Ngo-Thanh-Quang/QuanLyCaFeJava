package QuanLyQuanCafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SuaTK extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuaTK frame = new SuaTK();
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
	public SuaTK() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Điều chỉnh");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setBounds(172, 10, 108, 28);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(24, 50, 95, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 100, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(123, 50, 246, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mật khẩu");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(24, 147, 78, 27);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 100, 0));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(123, 148, 246, 30);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Chức vụ");
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(24, 96, 78, 27);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 100, 0));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(123, 97, 246, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Hủy");
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(57, 196, 131, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xác nhận");
		btnNewButton_1.setBackground(new Color(240, 255, 255));
		btnNewButton_1.setForeground(new Color(0, 100, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException j) {
					// TODO Auto-generated catch block
					
					j.printStackTrace();
				}
				try {
					PreparedStatement pstm1 = conn.prepareStatement("UPDATE accounts SET password=?,chucvu=? WHERE id=?");
					pstm1.setString(1, String.valueOf(passwordField.getPassword()));
					pstm1.setString(2, String.valueOf(textField_1.getText()));
					pstm1.setString(3, String.valueOf(textField.getText()));
					
					pstm1.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(250, 196, 131, 57);
		contentPane.add(btnNewButton_1);
		
		this.setVisible(true);
	}
}
