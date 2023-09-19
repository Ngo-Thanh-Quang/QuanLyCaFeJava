package QuanLyQuanCafe;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class NuocEp extends JPanel {

	/**
	 * Create the panel.
	 */
	public NuocEp() {
		setBackground(new Color(173, 216, 230));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Ép bưởi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException q) {
					// TODO Auto-generated catch block
					
					q.printStackTrace();
				}
				
				
				try {
				PreparedStatement pstm = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
			
					pstm.setString(1, "Nước ép bưởi");
					pstm.setInt(2, 20000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setForeground(new Color(128, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(38, 21, 245, 39);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ép cam");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException q) {
					// TODO Auto-generated catch block
					
					q.printStackTrace();
				}
				
				
				try {
				PreparedStatement pstm = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
			
					pstm.setString(1, "Nước ép cam");
					pstm.setInt(2, 20000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1.setForeground(new Color(128, 128, 0));
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(38, 69, 245, 43);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ép dâu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException q) {
					// TODO Auto-generated catch block
					
					q.printStackTrace();
				}
				
				
				try {
				PreparedStatement pstm = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
			
					pstm.setString(1, "Nước ép dâu");
					pstm.setInt(2, 20000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_2.setForeground(new Color(128, 128, 0));
		btnNewButton_2.setBackground(new Color(230, 230, 250));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(38, 122, 245, 43);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ép táo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException q) {
					// TODO Auto-generated catch block
					
					q.printStackTrace();
				}
				
				
				try {
				PreparedStatement pstm = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
			
					pstm.setString(1, "Nước ép táo");
					pstm.setInt(2, 20000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_3.setForeground(new Color(128, 128, 0));
		btnNewButton_3.setBackground(new Color(230, 230, 250));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(38, 175, 245, 47);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Ép ổi");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException q) {
					// TODO Auto-generated catch block
					
					q.printStackTrace();
				}
				
				
				try {
				PreparedStatement pstm = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
			
					pstm.setString(1, "Nước ép ổi");
					pstm.setInt(2, 20000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_4.setForeground(new Color(128, 128, 0));
		btnNewButton_4.setBackground(new Color(230, 230, 250));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(38, 232, 245, 43);
		add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("20.000");
		lblNewLabel.setForeground(new Color(128, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(339, 21, 80, 39);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("20.000");
		lblNewLabel_1.setForeground(new Color(128, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(339, 69, 80, 43);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("20.000");
		lblNewLabel_2.setForeground(new Color(128, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(339, 131, 80, 24);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("20.000");
		lblNewLabel_3.setForeground(new Color(128, 128, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(339, 175, 80, 39);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("20.000");
		lblNewLabel_4.setForeground(new Color(128, 128, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(339, 232, 80, 39);
		add(lblNewLabel_4);

	}
}
