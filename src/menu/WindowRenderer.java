package menu;

import java.util.Vector;

import org.jsfml.graphics.RenderWindow;

public class WindowRenderer 
{
	private RenderWindow mWindow;
	private Vector<ISprite> mSprites = new Vector<ISprite>();
	
	public WindowRenderer(RenderWindow window)
	{
		mWindow = window;
	}
	
	public void addSprite(ISprite sprite)
	{
		mSprites.add(sprite);
	}
	
	public void Render()
	{
		for (ISprite sprite : mSprites) 
		{
			mWindow.draw(sprite);
		}
	}
}
