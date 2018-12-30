package com.YUbuntu.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.YUbuntu.view
 * @Description The interface of personal information.
 * @Author #YUbuntu
 * @Date Dec 30, 2018-10:04:41 PM
 * @version 1.0
 */
public class UserPersonalInformation_JFrame extends JFrame
{

	private JPanel UserPersonalInformation_ContentPane;
	private JTextField UserName_TextField;
	private JTextField PersonalSignature_TextField;
	private JTextField RealName_TextField;
	private JTextField UserTelephone_TextField;
	private JTextField UserAge_TextField;
	private JTextField UserAddress_TextField;

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
					UserPersonalInformation_JFrame frame = new UserPersonalInformation_JFrame();
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
	public UserPersonalInformation_JFrame()
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 372);
		UserPersonalInformation_ContentPane = new JPanel();
		UserPersonalInformation_ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(UserPersonalInformation_ContentPane);
		UserPersonalInformation_ContentPane.setLayout(null);
		
		JLabel UserPortrait_JLabel = new JLabel("");
		UserPortrait_JLabel.setIcon(new ImageIcon(UserPersonalInformation_JFrame.class.getResource("/Icon/The portrait.png")));
		UserPortrait_JLabel.setBounds(10, 10, 71, 79);
		UserPersonalInformation_ContentPane.add(UserPortrait_JLabel);
		
		UserName_TextField = new JTextField();
		UserName_TextField.setBounds(263, 20, 246, 21);
		UserPersonalInformation_ContentPane.add(UserName_TextField);
		UserName_TextField.setColumns(10);
		
		PersonalSignature_TextField = new JTextField();
		PersonalSignature_TextField.setBounds(263, 68, 246, 21);
		UserPersonalInformation_ContentPane.add(PersonalSignature_TextField);
		PersonalSignature_TextField.setColumns(10);
		
		JLabel lblName = new JLabel("User name");
		lblName.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblName.setBounds(108, 25, 111, 15);
		UserPersonalInformation_ContentPane.add(lblName);
		
		JLabel lblPersonalSignure = new JLabel("Personal signature");
		lblPersonalSignure.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblPersonalSignure.setBounds(108, 74, 145, 15);
		UserPersonalInformation_ContentPane.add(lblPersonalSignure);
		
		JPanel UserInformation_Panel = new JPanel();
		UserInformation_Panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modify the information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		UserInformation_Panel.setBounds(10, 126, 580, 202);
		UserPersonalInformation_ContentPane.add(UserInformation_Panel);
		
		JLabel lblName_1 = new JLabel("name");
		lblName_1.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		RealName_TextField = new JTextField();
		RealName_TextField.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JRadioButton Male_JReadioButton = new JRadioButton("Male");
		Male_JReadioButton.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JRadioButton Female_JRadioButton = new JRadioButton("Female");
		Female_JRadioButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		UserTelephone_TextField = new JTextField();
		UserTelephone_TextField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Age");
		lblAddress.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		UserAge_TextField = new JTextField();
		UserAge_TextField.setColumns(10);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		UserAddress_TextField = new JTextField();
		UserAddress_TextField.setColumns(10);
		
		JScrollPane UserRemarks_ScrollPane = new JScrollPane();
		GroupLayout gl_UserInformation_Panel = new GroupLayout(UserInformation_Panel);
		gl_UserInformation_Panel.setHorizontalGroup(
			gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_UserInformation_Panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTelephone)
						.addComponent(lblName_1)
						.addComponent(lblRemarks))
					.addGap(18)
					.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_UserInformation_Panel.createSequentialGroup()
							.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(RealName_TextField, Alignment.TRAILING)
								.addComponent(UserTelephone_TextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
							.addGap(28)
							.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_UserInformation_Panel.createSequentialGroup()
									.addComponent(lblSex)
									.addGap(16)
									.addComponent(Male_JReadioButton)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(Female_JRadioButton)
									.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
									.addComponent(lblAddress)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(UserAge_TextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_UserInformation_Panel.createSequentialGroup()
									.addComponent(lblAddress_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(UserAddress_TextField, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
						.addComponent(UserRemarks_ScrollPane, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
					.addGap(25))
		);
		gl_UserInformation_Panel.setVerticalGroup(
			gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_UserInformation_Panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName_1)
						.addComponent(RealName_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSex)
						.addComponent(Female_JRadioButton)
						.addComponent(Male_JReadioButton)
						.addComponent(UserAge_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddress))
					.addGap(18)
					.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelephone)
						.addComponent(UserTelephone_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddress_1)
						.addComponent(UserAddress_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_UserInformation_Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_UserInformation_Panel.createSequentialGroup()
							.addGap(37)
							.addComponent(lblRemarks))
						.addGroup(gl_UserInformation_Panel.createSequentialGroup()
							.addGap(39)
							.addComponent(UserRemarks_ScrollPane, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		JTextArea UserRemarks_TextArea = new JTextArea();
		UserRemarks_TextArea.setLineWrap(true);
		UserRemarks_ScrollPane.setViewportView(UserRemarks_TextArea);
		UserInformation_Panel.setLayout(gl_UserInformation_Panel);
	}
}
