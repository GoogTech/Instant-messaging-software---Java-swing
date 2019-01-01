package com.YUbuntu.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.YUbuntu.view.function.Login_JFrame_function;

/**
 * 
 * @Project Instant messaging software - QQ
 * @Package com.YUbuntu.view
 * @Description User login interface.
 * @Author #YUbuntu
 * @Date Dec 30, 2018-1:10:22 PM
 * @version 1.0
 */
public class Login_JFrame extends JFrame implements Login_JFrame_function
{

	private JPanel contentPane;
	private JTextField UserName_TextField;
	private JPasswordField UserPassword_PasswordField;
	private JButton Login_JButton;
	private JButton Register_JButton;
	
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
					Login_JFrame frame = new Login_JFrame();
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
	public Login_JFrame()
	{
		setTitle("Instant messaging software");
		setAlwaysOnTop(true);//Set the JFrame always on the top.
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEmail = new JLabel("User name");
		lblEmail.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		UserName_TextField = new JTextField();
		UserName_TextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		Login_JButton = new JButton("Login");
		Login_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		Register_JButton = new JButton("Register");
		Register_JButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Interface_UserRegisterInterface(e);
			}
		});
		Register_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		UserPassword_PasswordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail)
								.addComponent(lblPassword)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(Login_JButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(UserName_TextField, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
								.addComponent(UserPassword_PasswordField)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(61)
							.addComponent(Register_JButton)))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(UserName_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(UserPassword_PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Login_JButton)
						.addComponent(Register_JButton))
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	/**
	 * 
	 * @Title Function
	 * @Description Open the User register interface.
	 * @param Performed aciton
	 * @return void
	 * @date Dec 30, 2018-2:21:41 PM
	 * @throws no
	 *
	 */
	public void Interface_UserRegisterInterface(ActionEvent e)
	{
		Register_JFrame register_JFrame = new Register_JFrame();
		//Open the User register interface.
		register_JFrame.setVisible(true);	
		//Close the User login interface.
		Login_JFrame.this.setVisible(false);
	}
}
