package main;

import menu.GameWindow;
import menu.Window;

public class System 
{
	private Window mCurrentWindow;
	
	
	public System()
	{
		mCurrentWindow = new GameWindow();		
	}
	
	public void Run()
	{
		while (mCurrentWindow.IsOpen())
		{
			executeFrame();
		}
	}
	
	private void executeFrame()
	{
		mCurrentWindow.Render();
		mCurrentWindow.HandleInput();
	}
	
	
}
