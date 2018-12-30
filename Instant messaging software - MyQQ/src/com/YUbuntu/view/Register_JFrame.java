package com.YUbuntu.view;

import java.awt.EventQueue;
import java.awt.Font;

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

import com.YUbuntu.view.function.Register_JFrame_function;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @Project Instant messaging software - QQ
 * @Package com.YUbuntu.view
 * @Description User register interface.
 * @Author #YUbuntu
 * @Date Dec 30, 2018-2:08:10 PM
 * @version 1.0
 */
public class Register_JFrame extends JFrame implements Register_JFrame_function
{

	private JPanel contentPane;
	private JTextField TelephoneOrEmail_TextField;
	private JTextField Verification_TextField;
	private JPasswordField Password_PasswordField;
	private JPasswordField ConfirmPassword_PasswordField;

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
					Register_JFrame frame = new Register_JFrame();
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
	public Register_JFrame()
	{
		setResizable(false);
		setAlwaysOnTop(true);//Set the User register interface always on the top.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTelephoneemail = new JLabel("Telephone/Email");
		lblTelephoneemail.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JLabel lblFffff = new JLabel("Verification code");
		lblFffff.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setFont(new Font("Consolas", Font.PLAIN, 13));
		
		TelephoneOrEmail_TextField = new JTextField();
		TelephoneOrEmail_TextField.setFont(new Font("SimSun", Font.BOLD, 12));
		TelephoneOrEmail_TextField.setColumns(10);
		
		Verification_TextField = new JTextField();
		Verification_TextField.setFont(new Font("SimSun", Font.BOLD, 12));
		Verification_TextField.setColumns(10);
		
		Password_PasswordField = new JPasswordField();
		
		ConfirmPassword_PasswordField = new JPasswordField();
		
		JButton ConfirmRegister_JButton = new JButton("Confirm");
		ConfirmRegister_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		
		JButton GoLoginInterface_JButton = new JButton("Back");
		GoLoginInterface_JButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Interface_GoBackUserLoginInterface(e);
			}
		});
		GoLoginInterface_JButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTelephoneemail)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(TelephoneOrEmail_TextField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFffff)
								.addComponent(lblPassword)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(ConfirmRegister_JButton)
									.addComponent(lblConfirmPassword)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(ConfirmPassword_PasswordField)
									.addComponent(Password_PasswordField, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
									.addComponent(Verification_TextField))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(GoLoginInterface_JButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(45)))))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelephoneemail)
						.addComponent(TelephoneOrEmail_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFffff)
						.addComponent(Verification_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(Password_PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConfirmPassword)
						.addComponent(ConfirmPassword_PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(ConfirmRegister_JButton)
						.addComponent(GoLoginInterface_JButton))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * 
	 * @Title Function
	 * @Description Go back the User login interface.
	 * @param Performed action
	 * @return void
	 * @date Dec 30, 2018-2:31:02 PM
	 * @throws no
	 *
	 */
	public void Interface_GoBackUserLoginInterface(ActionEvent e)
	{
		Login_JFrame login_JFrame = new Login_JFrame();
		
		//Open the User login interface.
		login_JFrame.setVisible(true);
		//Close the User register interface.
		Register_JFrame.this.setVisible(false);
	}
}