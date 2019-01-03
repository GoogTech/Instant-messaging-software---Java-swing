package com.HuangYuhui.Utils;

import java.io.BufferedInputStream;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.Utils
 * @Description TODO
 * @Author #YUbuntu
 * @Date Jan 3, 2019-9:53:21 AM
 * @version 1.0
 * @Come from : https://blog.csdn.net/Giving_bestself/article/details/51843239
 */
public class MusicPrompt extends Thread
{
	Player player;
	InputStream inputStream;
	
	public MusicPrompt(InputStream inputStream_)
	{
		this.inputStream = inputStream_;
	}
	
	@Override
	public void run()
	{
		super.run();
		try
		{
			play();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Play the music
	public void play() throws JavaLayerException
	{
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		player = new Player(bufferedInputStream);
		player.play();	
	}
	
	public static void main(String[] args)
	{
		InputStream inputStream = MusicPrompt.class.getResourceAsStream("\\Music\\Love Yourself.mp3");
		
		MusicPrompt musicPrompt = new MusicPrompt(inputStream);
		musicPrompt.start();
	}
}
