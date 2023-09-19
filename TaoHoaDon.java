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

public class TaoHoaDon extends JFrame {

	private JPanel contentPane;
	private JTextField tenmon;
	private JTextField giatien;
	private JTextField soluong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaoHoaDon frame = new TaoHoaDon();
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
	public TaoHoaDon() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 128));
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tạo hóa đơn mới");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBounds(139, 10, 152, 25);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Tên món");
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(39, 60, 78, 25);
		contentPane.add(lblNewLabel_1);
		
		tenmon = new JTextField();
		tenmon.setForeground(new Color(128, 0, 128));
		tenmon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tenmon.setBackground(new Color(255, 240, 245));
		tenmon.setBounds(139, 61, 215, 24);
		contentPane.add(tenmon);
		tenmon.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Giá tiền");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(39, 107, 78, 25);
		contentPane.add(lblNewLabel_2);
		
		giatien = new JTextField();
		giatien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		giatien.setForeground(new Color(128, 0, 128));
		giatien.setBackground(new Color(255, 240, 245));
		giatien.setBounds(139, 109, 215, 25);
		contentPane.add(giatien);
		giatien.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Số lượng");
		lblNewLabel_3.setForeground(new Color(128, 0, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(39, 154, 78, 25);
		contentPane.add(lblNewLabel_3);
		
		soluong = new JTextField();
		soluong.setForeground(new Color(128, 0, 128));
		soluong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		soluong.setBackground(new Color(255, 240, 245));
		soluong.setBounds(139, 156, 215, 25);
		contentPane.add(soluong);
		soluong.setColumns(10);
		
		JButton btnNewButton = new JButton("Hủy");
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(39, 217, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xác nhận");
		btnNewButton_1.setBackground(new Color(255, 240, 245));
		btnNewButton_1.setForeground(new Color(128, 0, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					System.out.println("Kết nối thành công!");
				} catch (ClassNotFoundException | SQLException j) {
					// TODO Auto-generated catch block
					System.out.println("Kết nối thất bại!");
					j.printStackTrace();
				}
				try {
					PreparedStatement pstm1 = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
					pstm1.setString(1, String.valueOf(tenmon.getText()));
					pstm1.setString(2, String.valueOf(giatien.getText()));
					pstm1.setString(3, String.valueOf(soluong.getText()));
					
					pstm1.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(284, 217, 114, 36);
		contentPane.add(btnNewButton_1);
	}
}
