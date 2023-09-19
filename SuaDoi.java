package QuanLyQuanCafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SuaDoi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuaDoi frame = new SuaDoi();
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
	public SuaDoi() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chỉnh sửa");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(157, 0, 128, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Địa chỉ");
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(38, 168, 105, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số điện thoại");
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(38, 104, 105, 19);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(105, 105, 105));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBackground(new Color(250, 250, 210));
		textField.setBounds(139, 51, 238, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(250, 250, 210));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setForeground(new Color(105, 105, 105));
		textField_1.setColumns(10);
		textField_1.setBounds(139, 101, 238, 30);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Hủy");
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setForeground(new Color(105, 105, 105));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(38, 219, 105, 34);
		contentPane.add(btnNewButton);
		
		JButton btnXacNhan = new JButton("Xác nhận");
		btnXacNhan.setBackground(new Color(250, 250, 210));
		btnXacNhan.setForeground(new Color(105, 105, 105));
		btnXacNhan.addActionListener(new ActionListener() {
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
					PreparedStatement pstm1 = conn.prepareStatement("UPDATE nhanvien SET diachi=?,sdt=? WHERE idnhanvien=?");
					pstm1.setString(1, String.valueOf(textField_2.getText()));
					pstm1.setString(2, String.valueOf(textField_1.getText()));
					pstm1.setString(3, String.valueOf(textField.getText()));
					
					pstm1.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnXacNhan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXacNhan.setBounds(290, 219, 105, 34);
		contentPane.add(btnXacNhan);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setForeground(new Color(105, 105, 105));
		textField_2.setBackground(new Color(250, 250, 210));
		textField_2.setColumns(10);
		textField_2.setBounds(139, 157, 238, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mã nhân viên");
		lblNewLabel_3.setForeground(new Color(105, 105, 105));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(38, 59, 96, 19);
		contentPane.add(lblNewLabel_3);
	}

}
