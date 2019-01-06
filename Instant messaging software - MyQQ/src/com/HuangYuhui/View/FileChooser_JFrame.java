package com.HuangYuhui.View;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import com.HuangYuhui.View.function.FileChoose_JFrame_function;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.View
 * @Description Choose the specified file to send.
 * @Author #YUbuntu
 * @Date 2019年1月6日下午9:29:55
 * @version 1.0
 */
public class FileChooser_JFrame extends JFrame implements FileChoose_JFrame_function
{
	private final File file;
	
	public FileChooser_JFrame()
	{	
		/*
		 * Default directory. 
		 */
		JFileChooser jfc = new JFileChooser();
				
		/*
		 * FILE_AND_DIRECTORIES : Show files or directorys.
		 * FILE_ONLY : Show only files.
		 * DIRECTORIES_ONLY : Show only directories.
		 */
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				
		/*
		 * jfc.showDialog(new JLabel(), "Choose");
		 */
		jfc.showOpenDialog(this);
				
		/*
		 * Get the path of file.
		 */
		file = jfc.getSelectedFile();
	}
	
	
	/**
	 * 
	 * @Title Function
	 * @Description Get the path of file.
	 * @param 
	 * @return void
	 * @date 2019年1月6日下午10:06:45
	 * @throws no
	 *
	 */
	public String getFilePath()
	{
		String FilePath = file.getAbsolutePath();	
		return FilePath;
	}
}