package com.YUbuntu.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @Project Instant messaging software - QQ
 * @Package com.YUbuntu.view
 * @Description The chat box interface.
 * @Author #YUbuntu
 * @Date Dec 30, 2018-6:11:51 PM
 * @version 1.0
 */
public class ChatBox_JFrame extends JFrame
{

	private JPanel ChatBox_ContentPane;

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
					ChatBox_JFrame frame = new ChatBox_JFrame();
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
	public ChatBox_JFrame()
	{
		setTitle("Chat Box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 615);
		ChatBox_ContentPane = new JPanel();
		ChatBox_ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ChatBox_ContentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(ChatBox_ContentPane);
		
		JPanel FriendPersonalInformation_Panel = new JPanel();
		ChatBox_ContentPane.add(FriendPersonalInformation_Panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_FriendPersonalInformation_Panel = new GroupLayout(FriendPersonalInformation_Panel);
		gl_FriendPersonalInformation_Panel.setHorizontalGroup(
			gl_FriendPersonalInformation_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FriendPersonalInformation_Panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 734, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_FriendPersonalInformation_Panel.setVerticalGroup(
			gl_FriendPersonalInformation_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FriendPersonalInformation_Panel.createSequentialGroup()
					.addGroup(gl_FriendPersonalInformation_Panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		JLabel FriendName_JLabel = new JLabel("Hi,#YUbuntu");
		FriendName_JLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
		
		JLabel FriendSignature_JLabel = new JLabel("Personal signature : As long as i love you ~");
		FriendSignature_JLabel.setFont(new Font("Consolas", Font.PLAIN, 13));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(FriendName_JLabel)
					.addGap(32)
					.addComponent(FriendSignature_JLabel)
					.addContainerGap(259, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(17, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(FriendName_JLabel)
						.addComponent(FriendSignature_JLabel))
					.addGap(23))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel FriendPortrait_JLabel = new JLabel("");
		FriendPortrait_JLabel.setIcon(new ImageIcon(ChatBox_JFrame.class.getResource("/Icon/The portrait.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(FriendPortrait_JLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(FriendPortrait_JLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		FriendPersonalInformation_Panel.setLayout(gl_FriendPersonalInformation_Panel);
		
		JSplitPane AllChatBox_SplitPane = new JSplitPane();
		AllChatBox_SplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		ChatBox_ContentPane.add(AllChatBox_SplitPane, BorderLayout.CENTER);
		
		JPanel MyChat_Panel = new JPanel();
		AllChatBox_SplitPane.setRightComponent(MyChat_Panel);
		
		JPanel ChatJMenuBar_Panel = new JPanel();
		
		JPanel Reset_Vibration_Send_Panel = new JPanel();
		
		JButton SendInformation_JButton = new JButton("Send");
		SendInformation_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JButton ResetInformation_JButton = new JButton("Reset");
		ResetInformation_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JButton Vibration_JButton = new JButton("Vibration");
		Vibration_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		GroupLayout gl_Reset_Vibration_Send_Panel = new GroupLayout(Reset_Vibration_Send_Panel);
		gl_Reset_Vibration_Send_Panel.setHorizontalGroup(
			gl_Reset_Vibration_Send_Panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Reset_Vibration_Send_Panel.createSequentialGroup()
					.addContainerGap(594, Short.MAX_VALUE)
					.addComponent(ResetInformation_JButton)
					.addGap(10)
					.addComponent(Vibration_JButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(SendInformation_JButton)
					.addGap(41))
		);
		gl_Reset_Vibration_Send_Panel.setVerticalGroup(
			gl_Reset_Vibration_Send_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Reset_Vibration_Send_Panel.createSequentialGroup()
					.addGroup(gl_Reset_Vibration_Send_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(ResetInformation_JButton)
						.addComponent(SendInformation_JButton)
						.addComponent(Vibration_JButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Reset_Vibration_Send_Panel.setLayout(gl_Reset_Vibration_Send_Panel);
		ChatJMenuBar_Panel.setLayout(null);
		
		JMenuBar ChatFuntion_JMenuBar = new JMenuBar();
		ChatFuntion_JMenuBar.setBounds(0, 0, 847, 22);
		ChatJMenuBar_Panel.add(ChatFuntion_JMenuBar);
		
		JMenu FontStyle_JMenu = new JMenu("Font style\r\n");
		FontStyle_JMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
		ChatFuntion_JMenuBar.add(FontStyle_JMenu);
		
		JMenuItem mntmStrongFont = new JMenuItem("Strong font");
		FontStyle_JMenu.add(mntmStrongFont);
		
		JMenuItem mntmConsole = new JMenuItem("Console font");
		FontStyle_JMenu.add(mntmConsole);
		
		JMenu ExpressionPackage_JMenu = new JMenu("Expression package");
		ExpressionPackage_JMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
		ChatFuntion_JMenuBar.add(ExpressionPackage_JMenu);
		
		JMenu SendFile_JMenu = new JMenu("Send files");
		SendFile_JMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
		ChatFuntion_JMenuBar.add(SendFile_JMenu);
		
		JScrollPane SendInformation_JScrollPane = new JScrollPane();
		GroupLayout gl_MyChat_Panel = new GroupLayout(MyChat_Panel);
		gl_MyChat_Panel.setHorizontalGroup(
			gl_MyChat_Panel.createParallelGroup(Alignment.LEADING)
				.addComponent(Reset_Vibration_Send_Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_MyChat_Panel.createSequentialGroup()
					.addGroup(gl_MyChat_Panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_MyChat_Panel.createSequentialGroup()
							.addComponent(ChatJMenuBar_Panel, GroupLayout.PREFERRED_SIZE, 857, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_MyChat_Panel.createSequentialGroup()
							.addComponent(SendInformation_JScrollPane, GroupLayout.PREFERRED_SIZE, 855, GroupLayout.PREFERRED_SIZE)
							.addGap(20)))
					.addGap(2))
		);
		gl_MyChat_Panel.setVerticalGroup(
			gl_MyChat_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MyChat_Panel.createSequentialGroup()
					.addComponent(ChatJMenuBar_Panel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(SendInformation_JScrollPane, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Reset_Vibration_Send_Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		JTextArea SendInformation_TextArea = new JTextArea();
		SendInformation_TextArea.setLineWrap(true);
		SendInformation_JScrollPane.setViewportView(SendInformation_TextArea);
		MyChat_Panel.setLayout(gl_MyChat_Panel);
		
		JScrollPane ChatInformation_JScrollPane = new JScrollPane();
		AllChatBox_SplitPane.setLeftComponent(ChatInformation_JScrollPane);
		
		JTextArea ChatInformation_TextArea = new JTextArea();
		ChatInformation_TextArea.setLineWrap(true);
		ChatInformation_JScrollPane.setViewportView(ChatInformation_TextArea);
		AllChatBox_SplitPane.setDividerLocation(280);
	}
}
