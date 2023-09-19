package QuanLyQuanCafe;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuanLyQuanCafe extends JFrame {
	
    private JTextField tfTk;
    private JPasswordField pfMk;
    private JRadioButton user;
    private JRadioButton admin;
    
    public QuanLyQuanCafe(){
       
        this.init();
        this.setVisible(true);
    }
    private void init() {
        this.setUp();
        
        JPanel jPanelTitle = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.setBackgroundJPanel(jPanelTitle);
        JLabel title = new JLabel("Đăng Nhập");
        title.setFont(new Font("Arial",Font.BOLD, 30));
        title.setForeground(new Color(188,143,143));
        jPanelTitle.add(title);

        this.add(jPanelTitle,BorderLayout.NORTH);
        this.add(this.contentCenter(),BorderLayout.CENTER);
    }
    private JPanel contentCenter() {
    	
    	
        Font font = new Font("Arial", Font.PLAIN,20);
        Font font1 = new Font("Cascadia", Font.BOLD,20);
        Color textColor = new Color(188,143,143);

        
        
        JPanel jPanelUser = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.setBackgroundJPanel(jPanelUser);
        JLabel userLabel = new JLabel("Tài Khoản");
        userLabel.setFont(font1);
        userLabel.setForeground(textColor);
        this.tfTk = new JTextField(15);
        this.tfTk.setFont(font);
        this.tfTk.setForeground(new Color(128,128,128));
        this.tfTk.setBackground(new Color(245,245,220));
        
        jPanelUser.add(userLabel);
        jPanelUser.add(this.tfTk);


        JPanel jPanelPassword= new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.setBackgroundJPanel(jPanelPassword);
        JLabel passwordLabel = new JLabel("Mật Khẩu");
        passwordLabel.setFont(font1);
        passwordLabel.setForeground(textColor);
        
        
        
        this.pfMk = new JPasswordField(15);
        this.pfMk.setFont(font);
        this.pfMk.setForeground(new Color(128,128,128));
        this.pfMk.setBackground(new Color(245,245,220));
        
        jPanelPassword.add(passwordLabel);
        jPanelPassword.add(this.pfMk);

        JPanel jPanelrole = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.setBackgroundJPanel(jPanelrole);
        JLabel role = new JLabel("Chức vụ");
        role.setFont(font1);
        role.setForeground(textColor);
        
        
        user = new JRadioButton("Nhân viên");
        user.setFont(font1);
        user.setForeground(new Color(188,143,143));
        user.setOpaque(true);
        user.setBorderPainted(false);
        user.setBackground(new Color(255,255,224));
        user.setSelected(true);
        
        
        admin = new JRadioButton("Quản lý");
        admin.setFont(font1);
        admin.setForeground(new Color(188,143,143));
        admin.setOpaque(true);
        admin.setBorderPainted(false);
        admin.setBackground(new Color(255,255,224));
        
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.user);
        buttonGroup.add(this.admin);
        
        
        JPanel jPanelCheckButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.setBackgroundJPanel(jPanelCheckButton);
        jPanelCheckButton.add(this.user);
        jPanelCheckButton.add(this.admin);

        
        jPanelrole.add(role);
        jPanelrole.add(jPanelCheckButton);

        
        JPanel formLogin = new JPanel();
        this.setBackgroundJPanel(formLogin);
        formLogin.setLayout(new BoxLayout(formLogin,BoxLayout.Y_AXIS));
        formLogin.add(jPanelUser);
        formLogin.add(jPanelPassword);
        formLogin.add(jPanelrole);

        
        
        JButton register = new JButton("Đăng Ký");
        
        register.setBackground( new Color(245,222,179));
        register.setForeground(new Color(205,133,63));
        register.setBorderPainted(false);
        register.setOpaque(true);
        register.setFont(font1);
        
        register.addActionListener(new ActionListener() {
			
			
        	private JRadioButton nv;
            private JRadioButton ql;

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame f = new JFrame();
				
				JPanel pn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
				setBackgroundJPanel(pn1);
				
				
				JLabel lb1 = new JLabel("Tạo tài khoản");
			  
				lb1.setFont(new Font("Arial",Font.BOLD, 20));
		        lb1.setForeground(new Color(188,143,143));
		        
		        
		        pn1.add(lb1);
		        add(pn1,BorderLayout.NORTH);
		        add(contentCenter(),BorderLayout.CENTER);
		        

		        
		        JPanel puser = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(puser);
		       
		        
				JLabel lbuser = new JLabel("Tài khoản");
				final JTextField tfuser = new JTextField(15);
				
				lbuser.setFont(new Font("Arial",Font.PLAIN, 17));
		        lbuser.setForeground(new Color(188,143,143));
		        
		        tfuser.setFont(new Font("Arial",Font.PLAIN, 17));
		        tfuser.setForeground(new Color(128,128,128));
		        tfuser.setBackground(new Color(245,245,220));
				
		        puser.add(lbuser);
		        puser.add(tfuser);
		        
		       
		        
		        JPanel ppass = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(ppass);
		        
				JLabel lbpass = new JLabel("Mật khẩu");
				final JPasswordField pfpass = new JPasswordField(15);
				
				lbpass.setFont(new Font("Arial",Font.PLAIN, 17));
		        lbpass.setForeground(new Color(188,143,143));
		        
		        pfpass.setFont(new Font("Arial",Font.PLAIN, 17));
		        pfpass.setForeground(new Color(128,128,128));
		        pfpass.setBackground(new Color(245,245,220));
		        
		        ppass.add(lbpass);
				ppass.add(pfpass);
				
				
				JPanel photen = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(photen);
		       
		        
				JLabel lbhoten = new JLabel("Họ và tên");
				final JTextField hoten = new JTextField(15);
				
				lbhoten.setFont(new Font("Arial",Font.PLAIN, 17));
				lbhoten.setForeground(new Color(188,143,143));
		        
		        hoten.setFont(new Font("Arial",Font.PLAIN, 17));
		        hoten.setForeground(new Color(128,128,128));
		        hoten.setBackground(new Color(245,245,220));
				
		        photen.add(lbhoten);
		        photen.add(hoten);
		        
		        JPanel pdiachi = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(pdiachi);
		        
		        JLabel lbdiachi = new JLabel("Địa chỉ");
				final JTextField diachi = new JTextField(15);
				
				lbdiachi.setFont(new Font("Arial",Font.PLAIN, 17));
				lbdiachi.setForeground(new Color(188,143,143));
		        
				diachi.setFont(new Font("Arial",Font.PLAIN, 17));
				diachi.setForeground(new Color(128,128,128));
				diachi.setBackground(new Color(245,245,220));
				
		        pdiachi.add(lbdiachi);
		        pdiachi.add(diachi);
		        
		        
		        JPanel psdt = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(psdt);
		        
		        JLabel lbsdt = new JLabel("Số điện thoại");
				final JTextField sdt = new JTextField(15);
				
				lbsdt.setFont(new Font("Arial",Font.PLAIN, 17));
				lbsdt.setForeground(new Color(188,143,143));
		        
				sdt.setFont(new Font("Arial",Font.PLAIN, 17));
				sdt.setForeground(new Color(128,128,128));
				sdt.setBackground(new Color(245,245,220));
				
		        psdt.add(lbsdt);
		        psdt.add(sdt);
				
				
				JPanel pnsex = new JPanel(new FlowLayout(FlowLayout.CENTER));
				setBackgroundJPanel(pnsex);
				
				JLabel sex = new JLabel("Giới tính");
		        sex.setFont(new Font("Cascadia", Font.BOLD,17));
		        sex.setForeground(new Color(188,143,143));
		        
		        final JRadioButton female =new JRadioButton("Nữ"); 
		        female.setFont(new Font("Cascadia", Font.BOLD,17));
		        female.setForeground(new Color(188,143,143));
		        female.setOpaque(true);
		        female.setBorderPainted(false);
		        female.setBackground(new Color(255,255,224));
		        
		        
		    	final JRadioButton male =new JRadioButton("Nam");
		    	male.setFont(new Font("Cascadia", Font.BOLD,17));
		    	male.setForeground(new Color(188,143,143));
		    	male.setOpaque(true);
		    	male.setBorderPainted(false);
		    	male.setBackground(new Color(255,255,224));
		    	male.setSelected(true);
		        
		    	
		        
		        
		        ButtonGroup btngr = new ButtonGroup();
		        btngr.add(male);
		        btngr.add(female);
		        
		        
		        JPanel pnchecksex = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(pnchecksex);
		        pnchecksex.add(male);
		        pnchecksex.add(female);
		        
		        
		        pnsex.add(sex);
		        pnsex.add(pnchecksex);
		        
		        
		    
				
				JPanel pnrole = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(pnrole);
		        
		        JLabel role = new JLabel("Chức vụ");
		        role.setFont(new Font("Cascadia", Font.BOLD,17));
		        role.setForeground(new Color(188,143,143));
		        
		        
		        final JRadioButton nv = new JRadioButton("Nhân viên");
		        nv.setFont(new Font("Cascadia", Font.BOLD,17));
		        nv.setForeground(new Color(188,143,143));
		        nv.setOpaque(true);
		        nv.setBorderPainted(false);
		        nv.setBackground(new Color(255,255,224));
		        nv.setSelected(true);
		        
		        
		        final JRadioButton ql = new JRadioButton("Quản lý");
		        ql.setFont(new Font("Cascadia", Font.BOLD,17));
		        ql.setForeground(new Color(188,143,143));
		        ql.setOpaque(true);
		        ql.setBorderPainted(false);
		        ql.setBackground(new Color(255,255,224));
		        
		        
		        final ButtonGroup btnGr = new ButtonGroup();
		        btnGr.add(nv);
		        btnGr.add(ql);
		        
		        
		        JPanel pncheckrole = new JPanel(new FlowLayout(FlowLayout.CENTER));
		        setBackgroundJPanel(pncheckrole);
		        pncheckrole.add(nv);
		        pncheckrole.add(ql);

		        
		        pnrole.add(role);
		        pnrole.add(pncheckrole);
		        
		        JPanel formLogin = new JPanel();
		        setBackgroundJPanel(formLogin);
		        formLogin.setLayout(new BoxLayout(formLogin,BoxLayout.Y_AXIS));
		        formLogin.add(puser);
		        formLogin.add(ppass);
		        formLogin.add(photen);
		        formLogin.add(pdiachi);
		        formLogin.add(psdt);
		        formLogin.add(pnsex);
		        formLogin.add(pnrole);
				
				
				
				
				  
				
				JButton btnRe = new  JButton("Xác nhận");
				btnRe.setFont(new Font("Cascadia", Font.BOLD,20));
				btnRe.setBackground( new Color(245,222,179));
		        btnRe.setForeground(new Color(205,133,63));
		       
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
			        		if (male.isSelected()) {
			        			try {
				        			PreparedStatement pstm1 = conn.prepareStatement("Insert into nhanvien(hoten,diachi,sdt,gioitinh) values (?,?,?,?)");
				        			
				        			pstm1.setString(1, String.valueOf(hoten.getText()));
				        			pstm1.setString(2, String.valueOf(diachi.getText()));
				        			pstm1.setString(3, String.valueOf(sdt.getText()));
				        			pstm1.setString(4, "Nam");
				        			
				        			
				        			pstm1.executeUpdate();
				        		} catch (SQLException e1) {
				        			// TODO Auto-generated catch block
				        			e1.printStackTrace();
				        		}
			        		}  
			        		if (female.isSelected()) {
			        			try {
				        			PreparedStatement pstm1 = conn.prepareStatement("Insert into nhanvien(hoten,diachi,sdt,gioitinh) values (?,?,?,?)");
				        			
				        			pstm1.setString(1, String.valueOf(hoten.getText()));
				        			pstm1.setString(2, String.valueOf(diachi.getText()));
				        			pstm1.setString(3, String.valueOf(sdt.getText()));
				        			pstm1.setString(4, "Nữ");
				        			
				        			
				        			pstm1.executeUpdate();
				        		} catch (SQLException e1) {
				        			// TODO Auto-generated catch block
				        			e1.printStackTrace();
				        		}
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
			        		dispose();
					}
				});
		        
				
				JPanel pnRe = new JPanel(new GridLayout(1,1));
				pnRe.setBackground(Color.white);
				pnRe.setOpaque(true);
				pnRe.add(btnRe);
		        

		        
		        JPanel contentCenter = new JPanel(new BorderLayout());
		        setBackgroundJPanel(contentCenter);
		        
		        contentCenter.add(pn1,BorderLayout.NORTH);
		        contentCenter.add(formLogin,BorderLayout.CENTER);
		        contentCenter.add(pnRe,BorderLayout.SOUTH);
		        
		        
				
				
				
				
				f.setLocation(500, 200);
				f.add(contentCenter);
				
		    	f.setSize(500,530);
		    	f.setVisible(true);
		    	
		    	dispose();
		            
		                
		               
		            }
		        });

        
        
        JButton submit = new JButton("Đăng nhập");
        
        submit.setBackground( new Color(255,235,205));
        submit.setForeground(new Color(205,133,63));
        submit.setBorderPainted(false);
        submit.setOpaque(true);
        submit.setFont(font1);
        
        submit.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				Connection conn = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
					
				} catch (ClassNotFoundException | SQLException k) {
					// TODO Auto-generated catch block
					
					k.printStackTrace();
				}
				try {
					PreparedStatement pstm = conn.prepareStatement("Select * from accounts");
					ResultSet rs = pstm.executeQuery();
					
					while(rs.next()) {
						
						
						if(tfTk.getText().isEmpty() || pfMk.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không được để trống!","Empty", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if(tfTk.getText().equals(rs.getString("taikhoan")) && pfMk.getText().equals(rs.getString("password")) && user.isSelected()) {
							JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
							new GiaoDienNV();
							break;
							
						}
						if(tfTk.getText().equals(rs.getString("taikhoan")) && pfMk.getText().equals(rs.getString("password")) && admin.isSelected()) {
							JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
							new GiaoDien();
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng!", "Failed", JOptionPane.ERROR_MESSAGE);
							return;
						}
					}
				} catch (SQLException j) {
					// TODO Auto-generated catch block
					j.printStackTrace();
				}
				
				
				dispose();
				
				
			}
        });

        
        JPanel jPanelButton = new JPanel(new GridLayout(1,2));
        jPanelButton.setBackground(Color.white);
        jPanelButton.setOpaque(true);
        jPanelButton.add(submit);
        jPanelButton.add(register);

        
        JPanel contentCenter = new JPanel(new BorderLayout());
        this.setBackgroundJPanel(contentCenter);
        contentCenter.add(formLogin,BorderLayout.NORTH);
        contentCenter.add(jPanelButton,BorderLayout.SOUTH);
        return contentCenter;
    }
    
    private void setUp(){
        this.setTitle("Hệ thống quản lý quán cafe");
        this.setSize(470,250);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                
            }
        });
        
    }
    public JTextField gettfTk() {
        return tfTk;
    }

    public JPasswordField getPasswordField() {
        return pfMk;
    }
    
    public JRadioButton getUser() {
        return user;
    }
    
    public JRadioButton getAdmin() {
        return admin;
    }

    public void setDefaultValue(){
        this.tfTk.setText("");
        this.pfMk.setText("");
    }
    
    private void setBackgroundJPanel(JPanel jPanel){
        jPanel.setOpaque(true);
        jPanel.setBackground(new Color(255,255,224));
    }
}

