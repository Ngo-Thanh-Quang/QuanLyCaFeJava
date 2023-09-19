package QuanLyQuanCafe;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Che extends JPanel {

	/**
	 * Create the panel.
	 */
	public Che() {
		setBackground(new Color(152, 251, 152));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Chè bưởi");
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
			
					pstm.setString(1, "Chè bưởi");
					pstm.setInt(2, 12000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setForeground(new Color(128, 128, 0));
		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(54, 21, 245, 39);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chè Thái ");
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
			
					pstm.setString(1, "Chè Thái");
					pstm.setInt(2, 15000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.setForeground(new Color(128, 128, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(54, 70, 245, 46);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Chè đậu đỏ");
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
			
					pstm.setString(1, "Chè đậu đỏ");
					pstm.setInt(2, 12000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_2.setForeground(new Color(128, 128, 0));
		btnNewButton_2.setBackground(new Color(240, 255, 240));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(54, 126, 245, 41);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Chè đậu xanh");
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
			
					pstm.setString(1, "Chè đậu xanh");
					pstm.setInt(2, 12000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_3.setBackground(new Color(240, 255, 240));
		btnNewButton_3.setForeground(new Color(128, 128, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(54, 178, 245, 41);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Chè chuối");
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
			
					pstm.setString(1, "Chè chuối");
					pstm.setInt(2, 12000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_4.setBackground(new Color(240, 255, 240));
		btnNewButton_4.setForeground(new Color(128, 128, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(54, 233, 245, 41);
		add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("12.000");
		lblNewLabel.setForeground(new Color(128, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(336, 27, 89, 26);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("15.000");
		lblNewLabel_1.setForeground(new Color(128, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(336, 79, 89, 29);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("12.000");
		lblNewLabel_2.setForeground(new Color(128, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(336, 133, 89, 27);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("12.000");
		lblNewLabel_3.setForeground(new Color(128, 128, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(336, 185, 89, 27);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("12.000");
		lblNewLabel_4.setForeground(new Color(128, 128, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(336, 240, 89, 27);
		add(lblNewLabel_4);

	}

}
