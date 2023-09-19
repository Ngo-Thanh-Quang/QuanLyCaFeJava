package QuanLyQuanCafe;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaiKhoan extends JPanel {
	private DefaultTableModel model	=	new DefaultTableModel();
	
	
	private JTable table;
	private String[] header = new String[]{
            "Mã nhân viên","Tài khoản", "Mật khẩu",  "Chức vụ"
           
    };
	/**
	 * Create the panel.
	 */
	public TaiKhoan() {
		setLayout(null);
		
		table = new JTable();
		
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.setColumnIdentifiers(header);
		table.setModel(model);
		table.setBounds(0, 52, 747, 414);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane.setBounds(0, 34, 747, 222);
	    
	    
	    add(scrollPane);
	    
	    JLabel lblNewLabel = new JLabel("Quản lý tài khoản");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel.setBounds(304, -1, 156, 25);
	    add(lblNewLabel);
	    
	    JButton btnThem = new JButton("Đăng ký");
	    btnThem.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnThem.setForeground(new Color(25, 25, 112));
	    btnThem.setBackground(new Color(240, 248, 255));
	    btnThem.addActionListener(new ActionListener() {
	    	JRadioButton nv;
            JRadioButton ql;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame f = new JFrame();
				
				JPanel pn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
				add(pn1);
				
				
				JLabel lb1 = new JLabel("Tạo tài khoản");
			  
				lb1.setFont(new Font("Arial",Font.BOLD, 20));
		        lb1.setForeground(new Color(188,143,143));
		        
		        
		        pn1.add(lb1);
		        add(pn1,BorderLayout.NORTH);
		        
		        

		        
		        JPanel puser = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        add(puser);
		       
		        
				JLabel lbuser = new JLabel("Tài khoản");
				final JTextField tfuser = new JTextField(15);
				
				lbuser.setFont(new Font("Arial",Font.PLAIN, 17));
		        lbuser.setForeground(new Color(188,143,143));
		        
		        tfuser.setFont(new Font("Arial",Font.PLAIN, 17));
		        tfuser.setForeground(new Color(128,128,128));
		        
				
		        puser.add(lbuser);
		        puser.add(tfuser);
		        
		       
		        
		        JPanel ppass = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        add(ppass);
		        
				JLabel lbpass = new JLabel("Mật khẩu");
				final JPasswordField pfpass = new JPasswordField(15);
				
				lbpass.setFont(new Font("Arial",Font.PLAIN, 17));
		        lbpass.setForeground(new Color(188,143,143));
		        
		        pfpass.setFont(new Font("Arial",Font.PLAIN, 17));
		        pfpass.setForeground(new Color(128,128,128));
		        
		        
		        ppass.add(lbpass);
				ppass.add(pfpass);
				
				
				JPanel photen = new JPanel(new FlowLayout(FlowLayout.CENTER));
		       
		       
		        
				JLabel lbhoten = new JLabel("Họ và tên");
				final JTextField hoten = new JTextField(15);
				
				lbhoten.setFont(new Font("Arial",Font.PLAIN, 17));
				lbhoten.setForeground(new Color(188,143,143));
		        
		        hoten.setFont(new Font("Arial",Font.PLAIN, 17));
		        hoten.setForeground(new Color(128,128,128));
		        
				
		        photen.add(lbhoten);
		        photen.add(hoten);
		        
		        JPanel pdiachi = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        
		        
		        JLabel lbdiachi = new JLabel("Địa chỉ");
				final JTextField diachi = new JTextField(15);
				
				lbdiachi.setFont(new Font("Arial",Font.PLAIN, 17));
				lbdiachi.setForeground(new Color(188,143,143));
		        
				diachi.setFont(new Font("Arial",Font.PLAIN, 17));
				diachi.setForeground(new Color(128,128,128));
				
				
		        pdiachi.add(lbdiachi);
		        pdiachi.add(diachi);
		        
		        
		        JPanel psdt = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        
		        
		        JLabel lbsdt = new JLabel("Số điện thoại");
				final JTextField sdt = new JTextField(15);
				
				lbsdt.setFont(new Font("Arial",Font.PLAIN, 17));
				lbsdt.setForeground(new Color(188,143,143));
		        
				sdt.setFont(new Font("Arial",Font.PLAIN, 17));
				sdt.setForeground(new Color(128,128,128));
				
				
		        psdt.add(lbsdt);
		        psdt.add(sdt);
				

				
				JPanel pnrole = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        add(pnrole);
		        
		        JLabel role = new JLabel("Chức vụ");
		        role.setFont(new Font("Cascadia", Font.BOLD,17));
		        role.setForeground(new Color(188,143,143));
		        
		        
		        final JRadioButton nv = new JRadioButton("Nhân viên");
		        nv.setFont(new Font("Cascadia", Font.BOLD,17));
		        nv.setForeground(new Color(188,143,143));
		        nv.setOpaque(true);
		        nv.setBorderPainted(false);
		      
		        nv.setSelected(true);
		        
		        
		        final JRadioButton ql = new JRadioButton("Quản lý");
		        ql.setFont(new Font("Cascadia", Font.BOLD,17));
		        ql.setForeground(new Color(188,143,143));
		        ql.setOpaque(true);
		        ql.setBorderPainted(false);
		       
		        
		        
		        final ButtonGroup btnGr = new ButtonGroup();
		        btnGr.add(nv);
		        btnGr.add(ql);
		        
		        
		        JPanel pncheckrole = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        add(pncheckrole);
		        pncheckrole.add(nv);
		        pncheckrole.add(ql);

		        
		        pnrole.add(role);
		        pnrole.add(pncheckrole);
		        
		        JPanel formLogin = new JPanel();
		        add(formLogin);
		        formLogin.setLayout(new BoxLayout(formLogin,BoxLayout.Y_AXIS));
		        formLogin.add(puser);
		        formLogin.add(ppass);
		        formLogin.add(pnrole);
				
				
				
				
				  
				
				JButton btnRe = new  JButton("Xác nhận");
				btnRe.setFont(new Font("Cascadia", Font.BOLD,20));
				btnRe.setBackground( new Color(248,248,255));
		        btnRe.setForeground(new Color(188,143,143));
		       
		        btnRe.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						 Connection conn = null;
			        		try {
			        			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			        			
			        			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
			        		
			        		} catch (ClassNotFoundException | SQLException j) {
			        			// TODO Auto-generated catch block
			        		
			        			j.printStackTrace();
			        		}
			        		if (nv.isSelected() ) {
			                try {
			        			PreparedStatement pstm1 = conn.prepareStatement("Insert into accounts(taikhoan,password,chucvu) values (?,?,?)");
			        			
			        			pstm1.setString(1, String.valueOf(tfuser.getText()));
			        			pstm1.setString(2, String.valueOf(pfpass.getPassword()));
			        			
			        			pstm1.setString(3, "Nhân viên");
			        			
			        			pstm1.executeUpdate();
			        		} catch (SQLException e1) {
			        			// TODO Auto-generated catch block
			        			e1.printStackTrace();
			        		}
			        		}
			        		
			        		if (ql.isSelected()) {
				                try {
				        			PreparedStatement pstm1 = conn.prepareStatement("Insert into accounts(taikhoan,password,chucvu) values (?,?,?)");
				        			
				        			pstm1.setString(1, String.valueOf(tfuser.getText()));
				        			pstm1.setString(2, String.valueOf(pfpass.getPassword()));
				        			
				        			pstm1.setString(3, "Quản lý");
				        			
				        			pstm1.executeUpdate();
				        		} catch (SQLException e1) {
				        			// TODO Auto-generated catch block
				        			e1.printStackTrace();
				        		}
				        		}
			        		
			        		
					}
				});
		        
				
				JPanel pnRe = new JPanel(new GridLayout(1,1));
				pnRe.setBackground(Color.white);
				pnRe.setOpaque(true);
				pnRe.add(btnRe);
		        

		        
		        JPanel contentCenter = new JPanel(new BorderLayout());
		        add(contentCenter);
		        
		        contentCenter.add(pn1,BorderLayout.NORTH);
		        contentCenter.add(formLogin,BorderLayout.CENTER);
		        contentCenter.add(pnRe,BorderLayout.SOUTH);
		        
		        
				
				
				
				
				f.setLocation(500, 200);
				f.getContentPane().add(contentCenter);
				
		    	f.setSize(300,300);
		    	f.setVisible(true);
		    	
		    	
		            
		                
		               
		            }
    	

	    });
	    btnThem.setBounds(57, 266, 114, 35);
	    add(btnThem);
	    
	    JButton btnSua = new JButton("Sửa ");
	    btnSua.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnSua.setForeground(new Color(25, 25, 112));
	    btnSua.setBackground(new Color(240, 248, 255));
	    btnSua.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		EventQueue.invokeLater(new Runnable() {
	    			public void run() {
	    				try {
	    					SuaTK frame = new SuaTK();
	    					frame.setVisible(true);
	    				} catch (Exception e) {
	    					e.printStackTrace();
	    				}
	    			}
	    		});
	    	}
	    });
	    btnSua.setBounds(325, 266, 114, 35);
	    add(btnSua);
	    
	    JButton btnXoa = new JButton("Xóa");
	    btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnXoa.setForeground(new Color(25, 25, 112));
	    btnXoa.setBackground(new Color(240, 248, 255));
	    btnXoa.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		EventQueue.invokeLater(new Runnable() {
	    			public void run() {
	    				try {
	    					XoaTK frame = new XoaTK();
	    					frame.setVisible(true);
	    				} catch (Exception e) {
	    					e.printStackTrace();
	    				}
	    			}
	    		});
	    	}
	    });
	    btnXoa.setBounds(582, 266, 108, 35);
	    add(btnXoa);
		load();
		
	}
	public void load() {
		
		
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
			
			PreparedStatement pstm = conn.prepareStatement("Select * from accounts");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				 String[] row = new String[]{
						 rs.getString("id"), rs.getString("taikhoan") , String.valueOf(rs.getInt("password")),
						 rs.getString("chucvu")	                    	                   
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
