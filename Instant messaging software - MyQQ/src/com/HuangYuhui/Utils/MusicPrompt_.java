package com.HuangYuhui.Utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * 
 * @Project Instant messaging software - MyQQ
 * @Package com.HuangYuhui.Utils
 * @Description Play the music. 
 * @Author HuangYuhui
 * @Date Jan 3, 2019-11:31:14 AM
 * @version 1.0
 * @Come from : https://www.oschina.net/code/snippet_937173_17692
 */
public class MusicPrompt_ extends Thread
{
	private String filename;
	private Player player;
	
	public MusicPrompt_(String filename_)
	{
		this.filename = filename_;
	}
	
	//Play the music(Need use thead ? !)
	public void play()
	{
		try
		{
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filename));
			player = new Player(bufferedInputStream);
			player.play();
			
			
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	//Thead
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
	
	//Get the source of music and return it.
	public static MusicPrompt_ getMusicPrompt_()
	{
		//MusicPrompt_ musicPrompt_ = new MusicPrompt_("src\\Music\\Love Yourself.mp3");
		MusicPrompt_ musicPrompt_ = new MusicPrompt_("src\\Music\\ReceiveMessagePromptMusic.mp3");
		
		return musicPrompt_;
	}
}
