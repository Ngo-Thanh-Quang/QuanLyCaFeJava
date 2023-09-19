package QuanLyQuanCafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ThemNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField hoten;
	private JTextField diachi;
	private JTextField sdt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemNhanVien frame = new ThemNhanVien();
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
	public ThemNhanVien() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhân viên");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(183, 10, 114, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 58, 71, 19);
		contentPane.add(lblNewLabel_1);
		
		hoten = new JTextField();
		hoten.setBackground(new Color(250, 240, 230));
		hoten.setForeground(new Color(165, 42, 42));
		hoten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hoten.setBounds(132, 48, 247, 31);
		contentPane.add(hoten);
		hoten.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Địa chỉ");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 96, 71, 19);
		contentPane.add(lblNewLabel_2);
		
		diachi = new JTextField();
		diachi.setForeground(new Color(165, 42, 42));
		diachi.setBackground(new Color(250, 240, 230));
		diachi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		diachi.setBounds(132, 89, 247, 28);
		contentPane.add(diachi);
		diachi.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Số điện thoại");
		lblNewLabel_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(32, 133, 99, 19);
		contentPane.add(lblNewLabel_3);
		
		sdt = new JTextField();
		sdt.setForeground(new Color(165, 42, 42));
		sdt.setBackground(new Color(250, 240, 230));
		sdt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sdt.setBounds(132, 126, 247, 28);
		contentPane.add(sdt);
		sdt.setColumns(10);
		
		final JRadioButton male = new JRadioButton("Nam");
		male.setBackground(new Color(255, 250, 240));
		male.setForeground(new Color(165, 42, 42));
		male.setFont(new Font("Tahoma", Font.PLAIN, 15));
		male.setBounds(132, 177, 58, 21);
		male.setSelected(true);
		contentPane.add(male);
		
		final JRadioButton female = new JRadioButton("Nữ");
		female.setBackground(new Color(255, 250, 240));
		female.setForeground(new Color(165, 42, 42));
		female.setFont(new Font("Tahoma", Font.PLAIN, 15));
		female.setBounds(261, 177, 71, 21);
		contentPane.add(female);
		
		final ButtonGroup btnGr = new ButtonGroup();
        btnGr.add(male);
        btnGr.add(female);
		
		JLabel lblNewLabel_4 = new JLabel("Giới tính");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(32, 178, 80, 19);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Hủy");
		btnNewButton.setBackground(new Color(250, 240, 230));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(32, 222, 99, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xác nhận");
		btnNewButton_1.setBackground(new Color(250, 240, 230));
		btnNewButton_1.setForeground(new Color(165, 42, 42));
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
        		if (male.isSelected()) {
        			try {
	        			PreparedStatement pstm1 = conn.prepareStatement("Insert into nhanvien(hoten,diachi,sdt,gioitinh) values (?,?,?,?)");
	        			
	        			pstm1.setString(1, String.valueOf(hoten.getText()));
	        			pstm1.setString(2, String.valueOf(diachi.getText()));
	        			pstm1.setString(3, String.valueOf(sdt.getText()));
	        			pstm1.setString(4, "Nam");
	        			
	        			
	        			pstm1.executeUpdate();
	        		} catch (SQLException e1) {
	        			// TODO Auto-generated catch block
	        			e1.printStackTrace();
	        		}
        		}  
        		if (female.isSelected()) {
        			try {
	        			PreparedStatement pstm1 = conn.prepareStatement("Insert into nhanvien(hoten,diachi,sdt,gioitinh) values (?,?,?,?)");
	        			
	        			pstm1.setString(1, String.valueOf(hoten.getText()));
	        			pstm1.setString(2, String.valueOf(diachi.getText()));
	        			pstm1.setString(3, String.valueOf(sdt.getText()));
	        			pstm1.setString(4, "Nữ");
	        			
	        			
	        			pstm1.executeUpdate();
	        		} catch (SQLException e1) {
	        			// TODO Auto-generated catch block
	        			e1.printStackTrace();
	        		}
        		}  
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(296, 222, 105, 30);
		contentPane.add(btnNewButton_1);
	}
}
