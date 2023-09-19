package QuanLyQuanCafe;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class NuocLon extends JPanel {

	/**
	 * Create the panel.
	 */
	public NuocLon() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Coca");
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
			
					pstm.setString(1, "Coca");
					pstm.setInt(2, 10000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(52, 33, 212, 37);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pepsi");
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
			
					pstm.setString(1, "Pepsi");
					pstm.setInt(2, 10000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(220, 220, 220));
		btnNewButton_1.setBounds(52, 80, 212, 37);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7 Up");
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
			
					pstm.setString(1, "7 Up");
					pstm.setInt(2, 10000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(220, 220, 220));
		btnNewButton_2.setBounds(52, 127, 212, 38);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mirinda");
		btnNewButton_3.setBackground(new Color(220, 220, 220));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
			
					pstm.setString(1, "Mirinda");
					pstm.setInt(2, 10000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_3.setBounds(52, 175, 212, 38);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Larue");
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
			
					pstm.setString(1, "Larue");
					pstm.setInt(2, 12000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_4.setBackground(new Color(220, 220, 220));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(52, 223, 212, 37);
		add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("10.000");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(311, 45, 106, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("10.000");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(311, 92, 106, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("10.000");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(311, 140, 106, 25);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("10.000");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(311, 188, 106, 25);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("12.000");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(311, 235, 106, 25);
		add(lblNewLabel_4);

	}

}
