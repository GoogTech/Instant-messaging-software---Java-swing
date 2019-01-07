package com.HuangYuhui.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.Utils
 * @Description Create a new Thread to open the 'ServerThread'.
 * @Author #YUbuntu
 * @Date 2019年1月7日下午12:01:21
 * @version 1.0
 */
public class ServerThread implements Runnable
{
	private Socket client;
	
	private InputStream readFile;
	private OutputStream writeFile;
	private OutputStream promptMessage;
	
	private File directory;
	private File file;
	

	public ServerThread(Socket socket)
	{
		this.client = socket;
	}
	
	@Override
	public void run()
	{	
		String IP = client.getInetAddress().getHostAddress();
		int count = 1;	
		try
		{	
			directory = new File("");
			if(!directory.exists())
			{
				directory.mkdirs();
			}
			file = new File(directory,IP+"["+count+"].jpg");
			while(file.exists())
			{
				file = new File(directory,IP+"["+(count++)+"].jpg");
			}
			
			readFile = client.getInputStream();
			
			writeFile = new FileOutputStream(file);
			byte[]data = new byte[1024];
			int len = 0;
			
			/*
			 * Read the file which come from 'Socket' and write it into the specified file.
			 */
			while((len=readFile.read(data))!=-1)
			{
				writeFile.write(data, 0, len);
			}
			
			promptMessage = client.getOutputStream();
			promptMessage.write("Hi ClientSocket ! I have received the file which you send !".getBytes());
			
			readFile.close();
			client.close();
	
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Test
	public static void main(String[] args)
	{
		System.out.println("ServerSocke is opening ...");
		try
		{
			ServerSocket serverSocket = new ServerSocket(6666);

			Socket socket = serverSocket.accept();
			new Thread(new ServerThread(socket)).start();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
