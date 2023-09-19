package QuanLyQuanCafe;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class DoanhThu extends JPanel {
	private DefaultTableModel model = new DefaultTableModel();
	
	
	private JTable table;
	private String[] header = new String[]{
            "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá bán",  "Số lượng"
           
    };

	/**
	 * Create the panel.
	 */
	public DoanhThu() {
		//setBackground(new Color(250, 235, 215));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 0, 747, 35);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Doanh Thu ");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		
		
		
		table = new JTable();
		table.setForeground(new Color(165, 42, 42));
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		model.setColumnIdentifiers(header);
		table.setModel(model);
		table.setBackground(new Color(248, 248, 255));
		table.setBounds(0, 52, 747, 414);
		
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane.setBounds(0, 34, 747, 364);
	    
	    
	    add(scrollPane);
		load();
		
		
	
}
	
	public void load() {
		
		
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
			
			PreparedStatement pstm = conn.prepareStatement("Select * from doanhthu");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				 String[] row = new String[]{
						 String.valueOf(rs.getInt("id")), rs.getString("tensp"), String.valueOf(rs.getInt("giatien")),
						 String.valueOf(rs.getInt("soluong"))	                    	                   
	                };
	                model.addRow(row);
	                model.setColumnIdentifiers(header);
	            }
			  model.fireTableDataChanged();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}
}
