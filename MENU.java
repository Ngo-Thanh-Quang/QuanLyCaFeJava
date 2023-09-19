package QuanLyQuanCafe;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;

public class MENU extends JPanel {

	private JTabbedPane tabbedPane;

	/**
	 * Create the panel.
	 */
	public MENU() {
		setBackground(new Color(250, 235, 215));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(0, 0, 744, 43);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("MENU\r\n");
		lblNewLabel.setForeground(new Color(205, 92, 92));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		JButton btnCf = new JButton("Cà phê");
		btnCf.setForeground(new Color(205, 92, 92));
		btnCf.setBackground(new Color(250, 240, 230));
		btnCf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCf.setBounds(36, 60, 252, 43);
		add(btnCf);
		btnCf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.removeAll();
				cafe cafe = new cafe();
				tabbedPane.addTab("Cà phê", cafe);
				tabbedPane.setSelectedComponent(cafe);
				
			}
		});
		
		JButton btnNuocEp = new JButton("Nước ép");
		btnNuocEp.setForeground(new Color(205, 92, 92));
		btnNuocEp.setBackground(new Color(250, 240, 230));
		btnNuocEp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNuocEp.setBounds(36, 113, 252, 43);
		add(btnNuocEp);
		btnNuocEp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.removeAll();
				
				NuocEp NuocEp = new NuocEp();
				tabbedPane.addTab("Nước ép", NuocEp);
				tabbedPane.setSelectedComponent(NuocEp);
				
			}
		});

		
		
		JButton btnNuocLon = new JButton("Nước lon");
		btnNuocLon.setForeground(new Color(205, 92, 92));
		btnNuocLon.setBackground(new Color(250, 240, 230));
		btnNuocLon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNuocLon.setBounds(36, 166, 252, 43);
		add(btnNuocLon);
		btnNuocLon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.removeAll();
				
				NuocLon NuocLon = new NuocLon();
				tabbedPane.addTab("Nước lon", NuocLon);
				tabbedPane.setSelectedComponent(NuocLon);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Trà");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.removeAll();
				
				Tra tra = new Tra();
				tabbedPane.addTab("Trà", tra);
				tabbedPane.setSelectedComponent(tra);
			}
		});
		btnNewButton_3.setForeground(new Color(205, 92, 92));
		btnNewButton_3.setBackground(new Color(250, 240, 230));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(36, 219, 252, 43);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Chè");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.removeAll();
				
				Che che = new Che();
				tabbedPane.addTab("Chè", che);
				tabbedPane.setSelectedComponent(che);
			}
		});
		btnNewButton_4.setForeground(new Color(205, 92, 92));
		btnNewButton_4.setBackground(new Color(250, 240, 230));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(36, 272, 252, 43);
		add(btnNewButton_4);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(298, 53, 446, 362);
		add(tabbedPane);
		
		
		

		
		
		
		this.setVisible(true);

	}
}
