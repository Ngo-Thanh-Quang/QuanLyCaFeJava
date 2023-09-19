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

public class Tra extends JPanel {

	/**
	 * Create the panel.
	 */
	public Tra() {
		setBackground(new Color(255, 228, 225));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Trà đào");
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
			
					pstm.setString(1, "Trà đào");
					pstm.setInt(2, 25000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(48, 10, 219, 43);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Trà vải");
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
			
					pstm.setString(1, "Trà vải");
					pstm.setInt(2, 25000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1.setForeground(new Color(165, 42, 42));
		btnNewButton_1.setBackground(new Color(255, 240, 245));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(48, 63, 219, 43);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Trà bí đao");
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
			
					pstm.setString(1, "Trà bí đao");
					pstm.setInt(2, 25000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_2.setForeground(new Color(165, 42, 42));
		btnNewButton_2.setBackground(new Color(255, 240, 245));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(48, 238, 219, 52);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Trà ổi hồng\r\n");
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
			
					pstm.setString(1, "Trà ổi hồng");
					pstm.setInt(2, 25000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_3.setForeground(new Color(165, 42, 42));
		btnNewButton_3.setBackground(new Color(255, 240, 245));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(48, 116, 219, 51);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Trà thơm");
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
			
					pstm.setString(1, "Trà thơm");
					pstm.setInt(2, 25000);
					pstm.setInt(3, 1);
					pstm.executeUpdate();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_4.setForeground(new Color(165, 42, 42));
		btnNewButton_4.setBackground(new Color(255, 240, 245));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(48, 177, 219, 51);
		add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("25.000");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(306, 25, 134, 28);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("25.000\r\n");
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(306, 70, 134, 28);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("25.000");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(306, 131, 134, 28);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("25.000");
		lblNewLabel_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(306, 188, 134, 28);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("25.000");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(306, 250, 134, 28);
		add(lblNewLabel_4);

	}

}
