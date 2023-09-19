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

public class XoaDoanhThu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XoaDoanhThu frame = new XoaDoanhThu();
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
	public XoaDoanhThu() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã món");
		lblNewLabel_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(38, 104, 86, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(210, 105, 30));
		textField.setBackground(new Color(245, 222, 179));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(134, 90, 259, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Xác nhận");
		btnNewButton_1.setBackground(new Color(245, 222, 179));
		btnNewButton_1.setForeground(new Color(210, 105, 30));
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
					PreparedStatement pstm1 = conn.prepareStatement("DELETE doanhthu WHERE id=?");
					pstm1.setString(1, String.valueOf(textField.getText()));
					
					
					
					pstm1.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(284, 204, 108, 37);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Hủy");
		btnNewButton.setForeground(new Color(210, 105, 30));
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(38, 204, 108, 37);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Xóa hóa đơn");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setBounds(157, 10, 143, 37);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
	}
}
