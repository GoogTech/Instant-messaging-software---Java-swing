package com.HuangYuhui.DaoImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.HuangYuhui.Dao.ManageUserInfo;
import com.HuangYuhui.Model.User;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.DaoImpl
 * @Description Use file reads and writes to verify user identity information.
 * @Author #YUbuntu
 * @Date Jan 2, 2019-12:45:40 PM
 * @version 1.0
 */
public class ManageUserInfoImpl implements ManageUserInfo
{

	/*
	 * Create a file firstly before the user login in.
	 */
	private static File file = new File("Source\\UserInfo.txt");	
	static
	{
		try
		{
			file.createNewFile();
		} catch (IOException e)
		{
			System.err.println("ERROR : FAIL TO CREATE THE SPECIFIED FILE !");
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.HuangYuhui.Dao.LoginIn_IO#IsLoginIn(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean IsLoginIn(String userName, String userPassword)
	{
		String line;
		boolean IsLoginIn_Flag = false;
		BufferedReader bufferedReader = null;

		try
		{
			//Read the user information from the specified file.
			bufferedReader = new BufferedReader(new FileReader(file)); 

			while ((line = bufferedReader.readLine()) != null)
			{
				// 调用split()方法,将读取的内容分割为二,再通过自定义数组分别存储
				String[] UserInfo = line.split("=");
				if (UserInfo[0].equals(userName) && UserInfo[1].equals(userPassword))
				{
					IsLoginIn_Flag = true;
					break;
				}
			}

		} catch (FileNotFoundException e)
		{
			System.err.println("ERROR : NOT FOUND THE SPECIFIED FILE !");
			e.printStackTrace();
		}catch(IOException e)
		{	
			System.out.println("ERROR : FAIL TO WRITE THE USER INFORMATION INTO THE SPECIFIED FILE !");
			e.printStackTrace();
		}finally
		{
			if (bufferedReader != null)
				try
				{
					bufferedReader.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
		}
		return IsLoginIn_Flag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.HuangYuhui.Dao.LoginIn_IO#UserRegist(com.HuangYuhui.Model.User)
	 */
	@Override
	public void UserRegist(User user) throws FileNotFoundException
	{
		BufferedWriter bufferedWriter = null;
		try
		{
			//append if true, then bytes will be writtento the end of the file rather than the beginning.
			bufferedWriter = new BufferedWriter(new FileWriter(file, true)); 
			//Write user registration information to the specified file according to custom storage rules.
			bufferedWriter.write(user.getUserName() + "=" + user.getUserPassword()); 
			bufferedWriter.newLine(); // Line feed write
			bufferedWriter.flush(); // flush the file

		} catch (IOException e)
		{
			System.err.println("ERROR : FAIL TO REGISTER !");
			e.printStackTrace();
		}finally
		{
			try
			{
				bufferedWriter.close(); 
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
