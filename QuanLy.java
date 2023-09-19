package QuanLyQuanCafe;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLy extends JPanel {
	private JTabbedPane tb;
	/**
	 * Create the panel.
	 */
	public QuanLy() {
		setBackground(new Color(211, 211, 211));
		setLayout(null);
		
		JButton btnTk = new JButton("Tài khoản");
		btnTk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.removeAll();
				TaiKhoan tk = new TaiKhoan();
				tb.addTab("Tài khoản", tk);
				tb.setSelectedComponent(tk);
			}
		});
		btnTk.setBackground(new Color(240, 255, 240));
		btnTk.setForeground(new Color(47, 79, 79));
		btnTk.setBounds(10, 20, 107, 31);
		add(btnTk);
		
		JButton btnDoanhThu = new JButton("Doanh Thu");
		btnDoanhThu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.removeAll();
				qlDoanhThu dt = new qlDoanhThu();
				tb.addTab("Doanh thu", dt);
				tb.setSelectedComponent(dt);
			}
		});
		btnDoanhThu.setBackground(new Color(240, 255, 240));
		btnDoanhThu.setForeground(new Color(47, 79, 79));
		btnDoanhThu.setBounds(149, 20, 123, 31);
		add(btnDoanhThu);
		
		tb = new JTabbedPane(JTabbedPane.TOP);
		tb.setBackground(new Color(224, 255, 255));
		tb.setBounds(0, 61, 745, 354);
		add(tb);
		
		JLabel lbql = new JLabel("Quản lý");
		lbql.setForeground(new Color(47, 79, 79));
		lbql.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lbql.setBounds(326, 0, 88, 32);
		add(lbql);
		
		JButton btnNhanVien = new JButton("Nhân viên");
		btnNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.removeAll();
				Nhanvien nv = new Nhanvien();
				tb.addTab("Doanh thu", nv);
				tb.setSelectedComponent(nv);
			}
		});
		btnNhanVien.setBackground(new Color(240, 255, 240));
		btnNhanVien.setForeground(new Color(47, 79, 79));
		btnNhanVien.setBounds(481, 20, 123, 31);
		add(btnNhanVien);

	}
}
