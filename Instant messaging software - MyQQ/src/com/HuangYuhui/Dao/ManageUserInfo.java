package com.HuangYuhui.Dao;

import java.io.FileNotFoundException;

import com.HuangYuhui.Model.User;


/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.Dao
 * @Description Extract the function into the interface.
 * @Author #YUbuntu
 * @Date Jan 2, 2019-12:44:44 PM
 * @version 1.0
 */
public interface ManageUserInfo
{
	/**
	 * 
	 * @Title Function
	 * @Description Use file reads to verify user identity information.
	 * @param User name and user password.
	 * @return boolean
	 * @date Jan 2, 2019-12:50:06 PM
	 * @throws no
	 *
	 */
	boolean IsLoginIn(String userName, String userPassword);
	
	/**
	 * 
	 * @Title Function
	 * @Description Use file writes to add user identity information.
	 * @param The user information
	 * @return void
	 * @date Jan 2, 2019-12:50:18 PM
	 * @throws //FileNotFoundException
	 *
	 */
	void UserRegist(User user) throws FileNotFoundException;
}
