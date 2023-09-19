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

public class XoaTK extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XoaTK frame = new XoaTK();
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
	public XoaTK() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Xóa tài khoản");
		lblNewLabel.setForeground(new Color(240, 255, 240));
		lblNewLabel.setBounds(153, 10, 140, 28);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		JLabel lblNewLabel_1 = new JLabel("Mã tài khoản");
		lblNewLabel_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(26, 68, 107, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setForeground(new Color(47, 79, 79));
		textField.setBackground(new Color(102, 205, 170));
		textField.setBounds(143, 69, 259, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Hủy");
		btnNewButton.setBackground(new Color(46, 139, 87));
		btnNewButton.setForeground(new Color(240, 255, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(65, 198, 107, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xác nhận");
		btnNewButton_1.setForeground(new Color(240, 255, 240));
		btnNewButton_1.setBackground(new Color(46, 139, 87));
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
					PreparedStatement pstm1 = conn.prepareStatement("DELETE accounts WHERE id=?");
					pstm1.setString(1, String.valueOf(textField.getText()));
					
					
					
					pstm1.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(272, 198, 107, 43);
		contentPane.add(btnNewButton_1);
		
		this.setVisible(true);
	}

}
