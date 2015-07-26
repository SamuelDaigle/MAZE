package menu;

import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public abstract class Window 
{
	protected WindowRenderer mWindowRenderer;
	protected RenderWindow mWindow;
	
	public Window()
	{
		//Create the window
		mWindow = new RenderWindow();
		mWindow.create(new VideoMode(640, 480), "Maze");

		//Limit the framerate
		mWindow.setFramerateLimit(60);
		
		// Create the window renderer to draw sprites.
		mWindowRenderer = new WindowRenderer(mWindow);
	}
	
	public abstract void Render();
	
	public void HandleInput()
	{
		for(Event event : mWindow.pollEvents()) {
	        if(event.type == Event.Type.CLOSED) {
	        	mWindow.close();
	        }
	    }
	}
	
	public boolean IsOpen()
	{
		return mWindow.isOpen();
	}

}
