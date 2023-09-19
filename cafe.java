package QuanLyQuanCafe;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class cafe extends JPanel {

	/**
	 * Create the panel.
	 */
	public cafe() {
		setBackground(new Color(238, 232, 170));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Cà phê đen");
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
			
					pstm.setString(1, "Cà phê đen");
					pstm.setInt(2, 19000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setForeground(new Color(205, 92, 92));
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(45, 21, 280, 33);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cà phê sữa");
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
			
					pstm.setString(1, "Cà phê sữa");
					pstm.setInt(2, 19000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1.setForeground(new Color(205, 92, 92));
		btnNewButton_1.setBackground(new Color(250, 250, 210));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(45, 76, 280, 33);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Latte");
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
				
				//them
				try {
				PreparedStatement pstm = conn.prepareStatement("Insert into doanhthu(tensp,giatien,soluong) values (?,?,?)");
			
					pstm.setString(1, "Latte");
					pstm.setInt(2, 35000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_2.setForeground(new Color(205, 92, 92));
		btnNewButton_2.setBackground(new Color(250, 250, 210));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(45, 132, 280, 33);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Capuchino");
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
			
					pstm.setString(1, "Capuchino");
					pstm.setInt(2, 35000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_3.setForeground(new Color(205, 92, 92));
		btnNewButton_3.setBackground(new Color(250, 250, 210));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(45, 185, 280, 33);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Chocolate");
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
			
					pstm.setString(1, "Chocolate");
					pstm.setInt(2, 40000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_4.setForeground(new Color(205, 92, 92));
		btnNewButton_4.setBackground(new Color(250, 250, 210));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(45, 243, 280, 33);
		add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("19.000");
		lblNewLabel.setForeground(new Color(205, 92, 92));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(362, 21, 81, 33);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("19.000");
		lblNewLabel_1.setForeground(new Color(205, 92, 92));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(362, 79, 81, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("35.000");
		lblNewLabel_2.setForeground(new Color(205, 92, 92));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(362, 132, 81, 33);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("35.000");
		lblNewLabel_3.setForeground(new Color(205, 92, 92));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(362, 185, 81, 33);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("40.000");
		lblNewLabel_4.setForeground(new Color(205, 92, 92));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(362, 243, 81, 27);
		add(lblNewLabel_4);

	}

}
