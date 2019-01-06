package com.HuangYuhui.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.HuangYuhui.Utils.MusicPrompt_;
import com.HuangYuhui.View.function.ChatBox_JFrame_function;

/**
 * 
 * @Project Instant messaging software - QQ
 * @Package com.YUbuntu.view
 * @Description The chat box interface.
 * @Author #YUbuntu
 * @Date Dec 30, 2018-6:11:51 PM
 * @version 1.0
 */
public class ChatBox_JFrame extends JFrame implements ChatBox_JFrame_function
{

	/*
	 * Send or receive the message(DatagramPacket)
	 */
	private DatagramSocket datagramSocket;
	
	private JPanel ChatBox_ContentPane;
	private JTextField FriendIP_TextField;
	private JTextArea SendInformation_TextArea;
	private JTextArea ChatInformation_TextArea;
	private JTextField FriendPort_TextField;
	private JLabel MonitoringStatu_JLabel;

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
		/*
		 *  !
		 */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 886, 575);
		ChatBox_ContentPane = new JPanel();
		ChatBox_ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ChatBox_ContentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(ChatBox_ContentPane);
		
		JPanel FriendPersonalInformation_Panel = new JPanel();
		ChatBox_ContentPane.add(FriendPersonalInformation_Panel, BorderLayout.NORTH);
		
		JPanel FriendPortrait_JPanel = new JPanel();
		
		JPanel FriendInfomation_JPanel = new JPanel();
		GroupLayout gl_FriendPersonalInformation_Panel = new GroupLayout(FriendPersonalInformation_Panel);
		gl_FriendPersonalInformation_Panel.setHorizontalGroup(
			gl_FriendPersonalInformation_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FriendPersonalInformation_Panel.createSequentialGroup()
					.addComponent(FriendPortrait_JPanel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(FriendInfomation_JPanel, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
		);
		gl_FriendPersonalInformation_Panel.setVerticalGroup(
			gl_FriendPersonalInformation_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FriendPersonalInformation_Panel.createSequentialGroup()
					.addGroup(gl_FriendPersonalInformation_Panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(FriendInfomation_JPanel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(FriendPortrait_JPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		JLabel FriendName_JLabel = new JLabel("Hi,#YUbuntu");
		FriendName_JLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
		
		JLabel FriendSignature_JLabel = new JLabel("Friend IP ");
		FriendSignature_JLabel.setForeground(Color.RED);
		FriendSignature_JLabel.setFont(new Font("Consolas", Font.BOLD, 14));
		
		FriendIP_TextField = new JTextField();
		FriendIP_TextField.setColumns(10);
		
		JLabel lblFriendPort = new JLabel("Friend Port");
		lblFriendPort.setForeground(Color.RED);
		lblFriendPort.setFont(new Font("Consolas", Font.BOLD, 14));
		
		FriendPort_TextField = new JTextField();
		FriendPort_TextField.setColumns(10);
		GroupLayout gl_FriendInfomation_JPanel = new GroupLayout(FriendInfomation_JPanel);
		gl_FriendInfomation_JPanel.setHorizontalGroup(
			gl_FriendInfomation_JPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FriendInfomation_JPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(FriendName_JLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
					.addComponent(FriendSignature_JLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(FriendIP_TextField, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(lblFriendPort)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(FriendPort_TextField, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_FriendInfomation_JPanel.setVerticalGroup(
			gl_FriendInfomation_JPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_FriendInfomation_JPanel.createSequentialGroup()
					.addContainerGap(17, Short.MAX_VALUE)
					.addGroup(gl_FriendInfomation_JPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(FriendName_JLabel)
						.addComponent(FriendPort_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(FriendIP_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(FriendSignature_JLabel)
						.addComponent(lblFriendPort))
					.addGap(23))
		);
		FriendInfomation_JPanel.setLayout(gl_FriendInfomation_JPanel);
		FriendPortrait_JPanel.setLayout(null);
		
		JLabel FriendPortrait_JLabel = new JLabel("");
		FriendPortrait_JLabel.setBounds(0, 0, 75, 64);
		FriendPortrait_JLabel.setIcon(new ImageIcon(ChatBox_JFrame.class.getResource("/Icon/The portrait.png")));
		FriendPortrait_JPanel.add(FriendPortrait_JLabel);
		FriendPersonalInformation_Panel.setLayout(gl_FriendPersonalInformation_Panel);
		
		JSplitPane AllChatBox_SplitPane = new JSplitPane();
		AllChatBox_SplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		ChatBox_ContentPane.add(AllChatBox_SplitPane, BorderLayout.CENTER);
		
		JPanel MyChat_Panel = new JPanel();
		AllChatBox_SplitPane.setRightComponent(MyChat_Panel);
		
		JPanel ChatJMenuBar_Panel = new JPanel();
		
		JPanel Reset_Vibration_Send_Panel = new JPanel();
		
		JButton SendInformation_JButton = new JButton("Send");
		SendInformation_JButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Function_SendMessage(e);
			}
		});
		SendInformation_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JButton ResetInformation_JButton = new JButton("Reset");
		ResetInformation_JButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Function_ClearChatBoxInfo(e);
			}
		});
		ResetInformation_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JButton Vibration_JButton = new JButton("Vibration");
		Vibration_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JLabel lblMyPort = new JLabel("Monitoring status");
		lblMyPort.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		MonitoringStatu_JLabel = new JLabel("----------");
		MonitoringStatu_JLabel.setFont(new Font("Consolas", Font.BOLD, 14));
		MonitoringStatu_JLabel.setForeground(Color.BLUE);
		MonitoringStatu_JLabel.setBackground(new Color(0, 0, 255));
		GroupLayout gl_Reset_Vibration_Send_Panel = new GroupLayout(Reset_Vibration_Send_Panel);
		gl_Reset_Vibration_Send_Panel.setHorizontalGroup(
			gl_Reset_Vibration_Send_Panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Reset_Vibration_Send_Panel.createSequentialGroup()
					.addGap(18)
					.addComponent(lblMyPort)
					.addGap(18)
					.addComponent(MonitoringStatu_JLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
					.addComponent(ResetInformation_JButton)
					.addGap(18)
					.addComponent(Vibration_JButton)
					.addGap(21)
					.addComponent(SendInformation_JButton)
					.addGap(22))
		);
		gl_Reset_Vibration_Send_Panel.setVerticalGroup(
			gl_Reset_Vibration_Send_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Reset_Vibration_Send_Panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Reset_Vibration_Send_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMyPort)
						.addComponent(ResetInformation_JButton)
						.addComponent(SendInformation_JButton)
						.addComponent(Vibration_JButton)
						.addComponent(MonitoringStatu_JLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Reset_Vibration_Send_Panel.setLayout(gl_Reset_Vibration_Send_Panel);
		ChatJMenuBar_Panel.setLayout(null);
		
		JMenuBar ChatFuntion_JMenuBar = new JMenuBar();
		ChatFuntion_JMenuBar.setBounds(0, 0, 857, 22);
		ChatJMenuBar_Panel.add(ChatFuntion_JMenuBar);
		
		JMenu FontStyle_JMenu = new JMenu("Font style\r\n");
		FontStyle_JMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
		ChatFuntion_JMenuBar.add(FontStyle_JMenu);
		
		JMenuItem mntmStrongFont = new JMenuItem("Strong font");
		mntmStrongFont.setFont(new Font("Consolas", Font.PLAIN, 11));
		FontStyle_JMenu.add(mntmStrongFont);
		
		JMenuItem mntmConsole = new JMenuItem("Console font");
		mntmConsole.setFont(new Font("Consolas", Font.PLAIN, 11));
		FontStyle_JMenu.add(mntmConsole);
		
		JMenu ExpressionPackage_JMenu = new JMenu("Expression package");
		ExpressionPackage_JMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
		ChatFuntion_JMenuBar.add(ExpressionPackage_JMenu);
		
		JMenu SendFile_JMenu = new JMenu("Send files");
		SendFile_JMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
		ChatFuntion_JMenuBar.add(SendFile_JMenu);
		
		JMenuItem mntmSendFile = new JMenuItem("Send file");
		mntmSendFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Function_SendFile(e);
			}
		});
		mntmSendFile.setFont(new Font("Consolas", Font.PLAIN, 12));
		SendFile_JMenu.add(mntmSendFile);
		
		JScrollPane SendInformation_JScrollPane = new JScrollPane();
		GroupLayout gl_MyChat_Panel = new GroupLayout(MyChat_Panel);
		gl_MyChat_Panel.setHorizontalGroup(
			gl_MyChat_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MyChat_Panel.createSequentialGroup()
					.addGroup(gl_MyChat_Panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_MyChat_Panel.createSequentialGroup()
							.addComponent(ChatJMenuBar_Panel, GroupLayout.PREFERRED_SIZE, 857, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_MyChat_Panel.createSequentialGroup()
							.addGroup(gl_MyChat_Panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(Reset_Vibration_Send_Panel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(SendInformation_JScrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE))
							.addGap(20)))
					.addGap(5))
		);
		gl_MyChat_Panel.setVerticalGroup(
			gl_MyChat_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MyChat_Panel.createSequentialGroup()
					.addComponent(ChatJMenuBar_Panel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(SendInformation_JScrollPane, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Reset_Vibration_Send_Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		SendInformation_TextArea = new JTextArea();
		SendInformation_TextArea.setFont(new Font("STXingkai", Font.BOLD, 16));
		SendInformation_TextArea.setLineWrap(true);
		SendInformation_JScrollPane.setViewportView(SendInformation_TextArea);
		MyChat_Panel.setLayout(gl_MyChat_Panel);
		
		JScrollPane ChatInformation_JScrollPane = new JScrollPane();
		AllChatBox_SplitPane.setLeftComponent(ChatInformation_JScrollPane);
		
		ChatInformation_TextArea = new JTextArea();
		ChatInformation_TextArea.setFont(new Font("STXingkai", Font.BOLD, 16));
		ChatInformation_TextArea.setLineWrap(true);
		ChatInformation_JScrollPane.setViewportView(ChatInformation_TextArea);
		AllChatBox_SplitPane.setDividerLocation(235);
		
		/*------------------------------------------------
		 * Strat the DatagramSocket(Receive the message) |
		 *------------------------------------------------
		 */
		Initialize_Socket();
	}
	
	/**
	 * 
	 * @Title Function 
	 * @Description Send the specified file to your friend.
	 * @param Performed action
	 * @return void
	 * @date 2019年1月6日下午10:01:58
	 * @throws no
	 *
	 */
	protected void Function_SendFile(ActionEvent e)
	{
		String filePath = new FileChooser_JFrame().getFilePath();
		//Test
		System.out.println(filePath);
	}


	/**
	 * 
	 * @Title Function
	 * @Description Message prompt tone.
	 * @param no
	 * @return void
	 * @date Jan 3, 2019-7:54:19 PM
	 * @throws no
	 *
	 */
	public void Function_ReceiveMessagePromptMusic()
	{
		new Thread()
		{
			@Override
			public void run()
			{
				super.run();
				MusicPrompt_ musicPrompt_ = MusicPrompt_.getMusicPrompt_();
				musicPrompt_.play();
			}
		}.start();		
	}
	
	/**
	 * 
	 * @Title Initialize
	 * @Description 
	 * @param no
	 * @return void
	 * @date Jan 2, 2019-9:22:14 PM
	 * @throws no
	 *
	 */
	public void Initialize_Socket()
	{
		int port ;
		while(true)
		{
			if(datagramSocket!=null&&!datagramSocket.isClosed())
			{
				datagramSocket.isClosed();
			}
			port = Integer.parseInt(JOptionPane.showInputDialog(this,"Please enter the port : ","Port",JOptionPane.QUESTION_MESSAGE));
			if(port<1||port>65535)
			{
				JOptionPane.showMessageDialog(this, "Port number out of range ! (1-65535)", "Tip", JOptionPane.WARNING_MESSAGE);
				return;
				//throw new RuntimeException("Port number out of range !");
			}
			
			/*
			 * Start the 'DatagramSocket'
			 */
			try
			{
				datagramSocket = new DatagramSocket(port);
				/*
				 * Receive the message
				 */
				Function_StartListen();
				//Change the listening status.
				MonitoringStatu_JLabel.setText("Listening port : "+port);
				break;
				
			} catch (SocketException e)
			{
				JOptionPane.showMessageDialog(this, "The port is already occupied !", "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * @Title Function(Thread)
	 * @Description Receive the message from your friend.
	 * @param no
	 * @return void
	 * @date Jan 2, 2019-9:43:53 PM
	 * @throws no
	 *
	 */
	public void Function_StartListen()
	{
		/*----------------------------------------------------------------------
		 * Start a new Thread to deal with the function of receiving  message. |
		 *----------------------------------------------------------------------
		 */
		new Thread()
		{
			private DatagramPacket datagramPacket;
			@Override
			public void run()
			{
				byte[] message = new byte[1024];
				datagramPacket = new DatagramPacket(message, message.length);
				while(!datagramSocket.isClosed())
				{
					try
					{
						datagramSocket.receive(datagramPacket);
						//Add the message to the chat box.
						ChatInformation_TextArea.append(datagramPacket.getAddress().getHostAddress()+" send a message to you : \n"
								+new String(datagramPacket.getData(),0,datagramPacket.getLength())+"\n");
						//Play the prompt music.
						Function_ReceiveMessagePromptMusic();
						//Let the scroll bar to the bottom.
						ChatInformation_TextArea.setCaretPosition(ChatInformation_TextArea.getText().length());
					} catch (IOException e)
					{
						//JOptionPane.showMessageDialog(this, "Fail to receive the message !", "Error", JOptionPane.MESSAGE_PROPERTY);
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	
	/**
	 * 
	 * @Title Function
	 * @Description Clear the information in chat box.
	 * @param Performed action
	 * @return void
	 * @date Jan 2, 2019-9:16:01 PM
	 * @throws no
	 *
	 */
	protected void Function_ClearChatBoxInfo(ActionEvent e)
	{
		ChatInformation_TextArea.setText("");
	}

	/**
	 * 
	 * @Title Function
	 * @Description Send the message to your friend.
	 * @param Performed action
	 * @return void
	 * @date Jan 2, 2019-8:26:10 PM
	 * @throws no
	 *
	 */
	protected void Function_SendMessage(ActionEvent e)
	{
		String friend_IPAdress = FriendIP_TextField.getText();
		String friend_RemotePort = FriendPort_TextField.getText();
		//Friendly prompt.
		if(friend_IPAdress==null||friend_RemotePort==null||friend_IPAdress.trim().equals("")||friend_RemotePort.trim().equals(""))
		{
			JOptionPane.showMessageDialog(ChatBox_JFrame.this, "Please enter the IP address or port !");
			return;
		}
		if(datagramSocket==null||datagramSocket.isClosed())
		{
			JOptionPane.showMessageDialog(this, "Listening failed !", "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		//Get the data you want to send.
		String sendMessage = SendInformation_TextArea.getText().toString();
		//Store the data.
		byte data[] = sendMessage.getBytes();
		//Display the message to the chat box if you send it to your friend.
		ChatInformation_TextArea.append("I send the message to : "+friend_IPAdress+"\n"+new String(SendInformation_TextArea.getText())+"\n");
		//Let the scroll bar to the bottom.
		ChatInformation_TextArea.setCaretPosition(ChatInformation_TextArea.getText().length());
		//Send the message.
		try
		{
			datagramSocket.send(new DatagramPacket(data, data.length,InetAddress.getByName(friend_IPAdress),Integer.parseInt(friend_RemotePort)));
			SendInformation_TextArea.setText("");
		} catch (NumberFormatException | IOException e1)
		{
			JOptionPane.showMessageDialog(this, "Fail to send the message !", "Error", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}	
	}
}
