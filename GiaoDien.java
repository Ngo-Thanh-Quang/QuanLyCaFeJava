package QuanLyQuanCafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class GiaoDien extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tb;
	/**
	 * @wbp.nonvisual location=-207,504
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GiaoDien() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 560);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(250, 235, 215));
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setBounds(0, 0, 750, 51);
		
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("TQ Coffee");
		lblNewLabel.setForeground(new Color(205, 92, 92));
		lblNewLabel.setFont(new Font("Vladimir Script", Font.BOLD, 33));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(0, 49, 750, 50);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnsell = new JButton("Bán Hàng");
		btnsell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tb.removeAll();
				MENU menu = new MENU();
				tb.addTab("Cà phê", menu);
				tb.setSelectedComponent(menu);
			}
		});
		btnsell.setForeground(new Color(205, 92, 92));
		btnsell.setBackground(new Color(245, 245, 220));
		btnsell.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnsell);
		
		JButton btnDoanhThu = new JButton("Doanh Thu");
		btnDoanhThu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tb.removeAll();
				DoanhThu doanhThu = new DoanhThu();
				tb.addTab("Doanh Thu", doanhThu);
				tb.setSelectedComponent(doanhThu);
			}
		});
		btnDoanhThu.setForeground(new Color(205, 92, 92));
		btnDoanhThu.setBackground(new Color(245, 245, 220));
		btnDoanhThu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnDoanhThu);
		
		JButton btnql = new JButton("Quản Lý");
		btnql.setForeground(new Color(205, 92, 92));
		btnql.setBackground(new Color(245, 245, 220));
		btnql.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.removeAll();
				QuanLy quanly = new QuanLy();
				tb.addTab("Quản lý", quanly);
				tb.setSelectedComponent(quanly);
			}
		});
		panel.add(btnql);
		
		
		
		tb = new JTabbedPane(JTabbedPane.TOP);
		tb.setBounds(0, 100, 750, 423);
		contentPane.add(tb);
		
		
		
		/*bàn btButton = new bàn();
		tabbedPane.addTab(null, btButton);
		tabbedPane.setSelectedComponent(btButton);*/
		
		/*MENU MENU = new MENU();
		tabbedPane.addTab(null, MENU);
		tabbedPane.setSelectedComponent(MENU);*/
		
		
		
		
		
		
		
		this.setVisible(true);
	}
}
