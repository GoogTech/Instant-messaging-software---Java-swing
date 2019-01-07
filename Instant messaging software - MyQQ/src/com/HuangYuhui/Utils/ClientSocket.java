package com.HuangYuhui.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.Utils
 * @Description Send the specified file to ServerSocket.
 * @Author #YUbuntu
 * @Date 2019年1月7日下午1:55:19
 * @version 1.0
 */
public class ClientSocket
{
	private Socket client;
	private File sendFile;
	private FileInputStream readFile;
	private InputStream readMessage;
	private OutputStream writeFile;
	
	/**
	 * 
	 * @Title 
	 * @Description TODO
	 * @param 
	 * @return void
	 * @date 2019年1月7日下午2:01:29
	 * @throws
	 *
	 */
	public void SendFile(InetAddress inetAddress,int port)
	{
		sendFile = new File("");
		try
		{
			System.out.println("Sending the file ...... ");
			
			client = new Socket(inetAddress.getHostAddress(),port);
						
			readFile = new FileInputStream(sendFile);			
			writeFile = client.getOutputStream();
			
			byte[]data = new byte[1024];
			int len;
			while((len=readFile.read(data))!=-1)
			{
				writeFile.write(data,0,len);
			}
			
			/*
			 * Disables the output stream for this socket.For a TCP socket, 
			 * any previously written data will be sentfollowed by TCP's normal connection termination sequence.
			 * If you write to a socket output stream after invokingshutdownOutput() on the socket, the stream will throwan IOException.
			 */
			client.shutdownOutput();
			
			readMessage = client.getInputStream();
			
			byte[]message = new byte[1024];
			int length = readMessage.read(message);
			System.out.println(new String(message,0,length));
			
			readFile.close();
			client.close();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//Test
	public static void main(String[] args)
	{
		try
		{
			new ClientSocket().SendFile(InetAddress.getLocalHost(),6666);
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
	}
}
