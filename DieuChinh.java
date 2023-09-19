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

public class DieuChinh extends JFrame {

	private JPanel contentPane;
	private JTextField tenmon;
	private JTextField giatien;
	private JTextField SoLuong;
	private JButton btnHuy;
	private JButton btnXacNhan;
	private JLabel lbMa;
	private JTextField Mamon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DieuChinh frame = new DieuChinh();
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
	public DieuChinh() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Dieuchinh = new JLabel("Điều chỉnh");
		Dieuchinh.setForeground(new Color(205, 92, 92));
		Dieuchinh.setBounds(169, 10, 94, 25);
		contentPane.add(Dieuchinh);
		Dieuchinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lbltenmon = new JLabel("Tên món");
		lbltenmon.setForeground(new Color(205, 92, 92));
		lbltenmon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbltenmon.setBounds(36, 48, 84, 25);
		contentPane.add(lbltenmon);
		
		tenmon = new JTextField();
		tenmon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tenmon.setBackground(new Color(255, 240, 245));
		tenmon.setForeground(new Color(205, 92, 92));
		tenmon.setBounds(142, 45, 223, 25);
		contentPane.add(tenmon);
		tenmon.setColumns(10);
		
		JLabel lbGiaTien = new JLabel("Giá tiền");
		lbGiaTien.setForeground(new Color(205, 92, 92));
		lbGiaTien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGiaTien.setBounds(36, 83, 84, 25);
		contentPane.add(lbGiaTien);
		
		giatien = new JTextField();
		giatien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		giatien.setBackground(new Color(255, 240, 245));
		giatien.setForeground(new Color(205, 92, 92));
		giatien.setBounds(142, 85, 223, 25);
		contentPane.add(giatien);
		giatien.setColumns(10);
		
		JLabel lbSoLuong = new JLabel("Số lượng");
		lbSoLuong.setForeground(new Color(205, 92, 92));
		lbSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbSoLuong.setBounds(36, 128, 68, 25);
		contentPane.add(lbSoLuong);
		
		SoLuong = new JTextField();
		SoLuong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SoLuong.setBackground(new Color(255, 240, 245));
		SoLuong.setForeground(new Color(205, 92, 92));
		SoLuong.setBounds(142, 128, 223, 25);
		contentPane.add(SoLuong);
		SoLuong.setColumns(10);
		
		lbMa = new JLabel("Mã món");
		lbMa.setForeground(new Color(205, 92, 92));
		lbMa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMa.setBounds(36, 171, 68, 25);
		contentPane.add(lbMa);
		
		Mamon = new JTextField();
		Mamon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Mamon.setBackground(new Color(255, 240, 245));
		Mamon.setForeground(new Color(205, 92, 92));
		Mamon.setBounds(142, 173, 223, 25);
		contentPane.add(Mamon);
		Mamon.setColumns(10);
		
		btnHuy = new JButton("Hủy");
		btnHuy.setBackground(new Color(255, 240, 245));
		btnHuy.setForeground(new Color(205, 92, 92));
		btnHuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHuy.setBounds(74, 217, 97, 36);
		contentPane.add(btnHuy);
		
		btnXacNhan = new JButton("Xác nhận");
		btnXacNhan.setBackground(new Color(255, 240, 245));
		btnXacNhan.setForeground(new Color(205, 92, 92));
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
					PreparedStatement pstm1 = conn.prepareStatement("UPDATE doanhthu SET tensp=?,giatien=?,soluong=? WHERE id=?");
					pstm1.setString(1, String.valueOf(tenmon.getText()));
					pstm1.setString(2, String.valueOf(giatien.getText()));
					pstm1.setString(3, String.valueOf(SoLuong.getText()));
					pstm1.setString(4, String.valueOf(Mamon.getText()));
					
					pstm1.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXacNhan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXacNhan.setBounds(286, 217, 97, 36);
		contentPane.add(btnXacNhan);
		
		
	}

}
