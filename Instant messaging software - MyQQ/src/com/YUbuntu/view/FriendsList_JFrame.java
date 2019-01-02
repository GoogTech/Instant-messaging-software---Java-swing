package com.YUbuntu.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.YUbuntu.view.function.FriendsList_JFrame_function;

/**
 * 
 * @Project Instant messaging software - QQ
 * @Package com.YUbuntu.view
 * @Description The interface of friends list.
 * @Author #YUbuntu
 * @Date Dec 30, 2018-5:33:43 PM
 * @version 1.0
 */
public class FriendsList_JFrame extends JFrame implements FriendsList_JFrame_function
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					FriendsList_JFrame frame = new FriendsList_JFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FriendsList_JFrame()
	{
		setResizable(false);
		setTitle("\u6625\u6696\u82B1\u5F00\uFF0C\u71D5\u5B50\u5F52\u6765~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 646);
		
		JMenuBar Function_JMenuBar = new JMenuBar();
		setJMenuBar(Function_JMenuBar);
		
		JMenu mnSettings = new JMenu("Settings");
		mnSettings.setFont(new Font("Consolas", Font.PLAIN, 11));
		Function_JMenuBar.add(mnSettings);
		
		JMenuItem PersonalInformation_JMenuItem = new JMenuItem("Personal information");
		PersonalInformation_JMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Interface_PersonalInformation(e);
			}
		});
		mnSettings.add(PersonalInformation_JMenuItem);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change password");
		mnSettings.add(mntmChangePassword);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnSettings.add(mntmExit);
		
		JMenu mnFunctions = new JMenu("Functions");
		mnFunctions.setFont(new Font("Consolas", Font.PLAIN, 11));
		Function_JMenuBar.add(mnFunctions);
		
		JMenuItem AddFriend_JMenuItem = new JMenuItem("Add friend");
		AddFriend_JMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Interface_AddFriend(e);
			}
		});
		mnFunctions.add(AddFriend_JMenuItem);
		
		JMenuItem mntmFindFriend = new JMenuItem("Find friend");
		mnFunctions.add(mntmFindFriend);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Consolas", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, 0, 0, Short.MAX_VALUE))
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE))
		);
		
		JPanel FriendsList_JPanel = new JPanel();
		tabbedPane.addTab("Friends list", null, FriendsList_JPanel, null);
		
		JScrollPane FriendsList_ScrollPane = new JScrollPane();
		
		/*------------------------------------------------------------------------------
		 * Add the friend information panel into FriendsList_ScrollPane(Friends list). |
		 *------------------------------------------------------------------------------
		 */
		FriendsList_ScrollPane.setViewportView(new Firends_JPanel());
		
		GroupLayout gl_FriendsList_JPanel = new GroupLayout(FriendsList_JPanel);
		gl_FriendsList_JPanel.setHorizontalGroup(
			gl_FriendsList_JPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FriendsList_JPanel.createSequentialGroup()
					.addComponent(FriendsList_ScrollPane, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_FriendsList_JPanel.setVerticalGroup(
			gl_FriendsList_JPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(FriendsList_ScrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
		);
		FriendsList_JPanel.setLayout(gl_FriendsList_JPanel);
				
		
		
		JPanel FriendsBlog_JPanel = new JPanel();
		tabbedPane.addTab("Friends blog", null, FriendsBlog_JPanel, null);
		GroupLayout gl_FriendsBlog_JPanel = new GroupLayout(FriendsBlog_JPanel);
		gl_FriendsBlog_JPanel.setHorizontalGroup(
			gl_FriendsBlog_JPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 289, Short.MAX_VALUE)
		);
		gl_FriendsBlog_JPanel.setVerticalGroup(
			gl_FriendsBlog_JPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
		);
		FriendsBlog_JPanel.setLayout(gl_FriendsBlog_JPanel);
		
		JLabel lblyubuntu = new JLabel("#YUbuntu");
		lblyubuntu.setFont(new Font("Consolas", Font.PLAIN, 18));
		
		JLabel lblHttpsyubuntugithubio = new JLabel("https://YUbuntu0109.github.io/");
		lblHttpsyubuntugithubio.setFont(new Font("Consolas", Font.PLAIN, 9));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHttpsyubuntugithubio, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblyubuntu))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(34)
					.addComponent(lblyubuntu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHttpsyubuntugithubio)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FriendsList_JFrame.class.getResource("/Icon/The portrait.png")));
		panel.add(label, BorderLayout.CENTER);
		contentPane.setLayout(gl_contentPane);
	}
	
	/**
	 * 
	 * @Title Interface
	 * @Description The interface of personal information.
	 * @param Performed action
	 * @return void
	 * @date Dec 31, 2018-9:36:39 AM
	 * @throws no
	 *
	 */
	public void Interface_PersonalInformation(ActionEvent e)
	{
		PersonalInformation_JFrame userPersonalInformation_JFrame = new PersonalInformation_JFrame();
		userPersonalInformation_JFrame.setVisible(true);
	}

	/**
	 * 
	 * @Title Interface
	 * @Description The interface of adding new friend.
	 * @param Performed action
	 * @return void
	 * @date Dec 31, 2018-9:28:50 AM
	 * @throws no
	 *
	 */
	public void Interface_AddFriend(ActionEvent e)
	{
		AddFriend_JFrame addFriend_JFrame = new AddFriend_JFrame();
		addFriend_JFrame.setVisible(true);
	}
}
