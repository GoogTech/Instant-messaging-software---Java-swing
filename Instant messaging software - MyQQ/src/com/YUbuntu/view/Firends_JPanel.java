package com.YUbuntu.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.YUbuntu.view
 * @Description The panel of friend information.
 * @Author #YUbuntu
 * @Date Jan 1, 2019-9:57:44 PM
 * @version 1.0
 */
public class Firends_JPanel extends JPanel
{

	/**
	 * Create the panel.
	 */
	public Firends_JPanel()
	{
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Firends_JPanel.class.getResource("/Icon/The portrait.png")));
		
		JLabel lblFriendName_1 = new JLabel("Friend name - 2");
		lblFriendName_1.setFont(new Font("Consolas", Font.PLAIN, 12));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addGap(35)
					.addComponent(lblFriendName_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(22)
							.addComponent(label_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(44)
							.addComponent(lblFriendName_1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Firends_JPanel.class.getResource("/Icon/The portrait.png")));
		
		JLabel lblFriendName_2 = new JLabel("Friend name - 3");
		lblFriendName_2.setFont(new Font("Consolas", Font.PLAIN, 12));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_2)
					.addGap(35)
					.addComponent(lblFriendName_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(44)
							.addComponent(lblFriendName_2))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(22)
							.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Firends_JPanel.class.getResource("/Icon/The portrait.png")));
		
		JLabel lblFriendName = new JLabel("Friend name - 1");
		lblFriendName.setFont(new Font("Consolas", Font.PLAIN, 12));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(35)
					.addComponent(lblFriendName, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addComponent(label))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(44)
							.addComponent(lblFriendName)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
		
	}
}
