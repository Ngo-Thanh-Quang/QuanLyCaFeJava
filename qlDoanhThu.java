package QuanLyQuanCafe;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.EventQueue;

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

public class qlDoanhThu extends JPanel {
	private DefaultTableModel model=new DefaultTableModel();
	
	
	private JTable table;
	private String[] header = new String[]{
            "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá bán",  "Số lượng"
           
    };

	/**
	 * Create the panel.
	 */
	public qlDoanhThu() {
		
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
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.setColumnIdentifiers(header);
		table.setModel(model);
		table.setBackground(new Color(248, 248, 255));
		table.setBounds(0, 52, 747, 414);
		
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane.setBounds(0, 34, 747, 221);
	    
	    
	    add(scrollPane);
	    
	    JButton btnTao = new JButton("Tạo ");
	    btnTao.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
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
	    });
	    btnTao.setBackground(new Color(248, 248, 255));
	    btnTao.setForeground(new Color(165, 42, 42));
	    btnTao.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnTao.setBounds(28, 265, 120, 39);
	    add(btnTao);
	    
	    JButton btnDieuChinh = new JButton("Điều chỉnh");
	    btnDieuChinh.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
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
	    });
	    btnDieuChinh.setBackground(new Color(248, 248, 255));
	    btnDieuChinh.setForeground(new Color(165, 42, 42));
	    btnDieuChinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnDieuChinh.setBounds(319, 265, 120, 39);
	    add(btnDieuChinh);
	    
	    JButton btnXoa = new JButton("Xóa");
	    btnXoa.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		EventQueue.invokeLater(new Runnable() {
	    			public void run() {
	    				try {
	    					XoaDoanhThu frame = new XoaDoanhThu();
	    					frame.setVisible(true);
	    				} catch (Exception e) {
	    					e.printStackTrace();
	    				}
	    			}
	    		});
	    	}
	    });
	    btnXoa.setBackground(new Color(248, 248, 255));
	    btnXoa.setForeground(new Color(165, 42, 42));
	    btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnXoa.setBounds(598, 265, 120, 39);
	    add(btnXoa);
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
