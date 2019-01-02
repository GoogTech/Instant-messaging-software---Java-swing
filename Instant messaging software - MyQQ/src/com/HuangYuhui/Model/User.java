package com.HuangYuhui.Model;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.Model
 * @Description The information of user.
 * @Author #YUbuntu
 * @Date Jan 2, 2019-12:52:19 PM
 * @version 1.0
 */
public class User
{
	private String UserName;
	private String UserPassword;
	
	public String getUserName()
	{
		return UserName;
	}
	public void setUserName(String userName)
	{
		UserName = userName;
	}
	public String getUserPassword()
	{
		return UserPassword;
	}
	public void setUserPassword(String userPassword)
	{
		UserPassword = userPassword;
	}	
}
