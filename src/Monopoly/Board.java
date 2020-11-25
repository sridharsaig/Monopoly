package Monopoly;

import BoardTiles.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Board
{
	public ArrayList<Player> Players = new ArrayList<Player>();
	BoardTile[] boardTiles;
	PlayerInteracter PlayerInteracter = null;
	
	private int CurrentPlayer;
	private int Turn = 0;
	
	public Board(PlayerInteracter playerInteracter)
	{
		PlayerInteracter = playerInteracter;
	}
	
	public void nextTurn() 
	{
		
	}
	
	private void initBoard()
	{
		boardTiles = new BoardTile[]
				{
					new GlobalAwarenessTile("GO"),
					new AnimalHospitalTile("Animal Sanctuary"),
					new NaturalDisasterTile("Natural Disaster"),
					new EventsActionsTile("Events Action")
					//etc
				};
	}
	
	private int RollDice()
	{
		Random r = new Random();
		return r.nextInt((6-1)+1) + 1;
	}
	
	public void showPlayerInfo()
	{
		System.out.printf("{Starting turn %s} \n", Turn);
		
		for(Player player : Players)
		{
			if(player.OwnedProperties.size() == 0)
			{
				System.out.printf("{%s} does not own any properties.\n", player.getName());
				continue;
			}
			
			String props = String.join(",", player.OwnedProperties.stream().map(x-> x.name).collect(Collectors.toList()));
			
					
		}
	}
	
}
