package game;

import game.Tile;

import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import org.jsfml.graphics.Texture;

public class Level 
{
	
	private ArrayList<ArrayList<Tile>> mTiles = new ArrayList<ArrayList<Tile>>(5);
	
	public Level(Map<Point, Character> map)
	{
		Texture newTexture = new Texture();
		try 
		{
			newTexture.loadFromFile(Paths.get("Assets/Tile2.png"));
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		for (int y = 0; y < 5; y++) 
		{
			ArrayList<Tile> newArray = new ArrayList<Tile>(5);
			mTiles.add(newArray);
			for (int x = 0; x < 5; x++) 
			{
				newArray.add(new Tile(newTexture));
			}
		}
		
		for (Map.Entry<Point, Character> entry : map.entrySet()) 
		{
			Tile newTile = new Tile(newTexture);
			int tabX = entry.getKey().x;
			int tabY = entry.getKey().y;
			int x = ((tabX - tabY) * 26) + 250;
			int y = ((tabY + tabX) * 14) + 150;
			newTile.setPosition(x , y);
			
			mTiles.get(tabY).set(tabX, newTile);
		}
	}

	public ArrayDeque<Tile> GetAllTiles()
	{
		ArrayDeque<Tile> tiles = new ArrayDeque<Tile>();
		for (ArrayList<Tile> vector : mTiles) 
		{
			for (Tile tile : vector) 
			{
				tiles.add(tile);
			}
		}
		return tiles;
	}
}
