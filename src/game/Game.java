package game;

import java.util.Map;
import java.util.Vector;

import menu.ISprite;
import game.Level;

public class Game 
{
	private Level mLevel;
	
	public Game(Map<Point, Character> map)
	{
		mLevel = new Level(map);
	}
	
	public void Update()
	{
		
	}
	
	public Vector<ISprite> GetAllSprites()
	{
		Vector<ISprite> allSprites = new Vector<ISprite>();
		for (Tile tile : mLevel.GetAllTiles()) 
		{			
			allSprites.add(tile);
		}
		
		return allSprites;
	}
}
