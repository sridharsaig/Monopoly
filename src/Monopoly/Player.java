package Monopoly;

import java.util.ArrayList;

import BoardTiles.BoardTile;

public class Player
{
	private final int STARTING_MONEY = 1500;
	private int funds = STARTING_MONEY;
	private Board board = null;

	public String Name = null;
	
	public boolean InJail = false;
	public boolean RolledDouble = false;
	public int playerPositionIndex = 0;
	public ArrayList<BoardTile> OwnedProperties = new ArrayList<BoardTile>();

	public Player(Board _board, String _name, int _startingFunds)
	{
		this.Name = _name;
		this.funds = _startingFunds;
		this.board = _board;
	}
	
	public int getPlayerPositionIndex()
	{
		return this.playerPositionIndex;
	}
	
	public String getName()
	{
		return this.Name;
	}
	

	public void playerBonus()
	{
	
	}

	public void playerCharge()
	{
	
	}
	
	
	public void setPlayerPosition(int newTile)
	{
		this.playerPositionIndex = newTile;
	}
	
	public void movePlayer()
	{
		
	}
	
	private void AddProperty(BoardTile tile)
	{
		
	}


}