package menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.jsfml.graphics.Color;

import game.Game;
import game.Point;
import menu.Window;

public class GameWindow extends Window {
	
	private Game mGame;
	
	public GameWindow()
	{
		Map<Point, Character> map = generateMap();
		mGame = new Game(map);
		Vector<ISprite> allSprites = mGame.GetAllSprites();
		for (ISprite sprite : allSprites) 
		{
			mWindowRenderer.addSprite(sprite);
		}
	}

	@Override
	public void Render() 
	{
		mWindow.clear(Color.BLACK);
		mWindowRenderer.Render();
		mWindow.display();
	}
	
	private Map<Point, Character> generateMap()
	{
		Map<Point, Character> map = new HashMap<Point, Character>();
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				map.put(new Point(i, j), 'x');
			}
		}

		return map;
	}

}
