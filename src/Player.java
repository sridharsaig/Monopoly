public class Player
{
	private final int STARTING_MONEY = 1500;
	private int funds = STARTING_MONEY;
	
	private String name = null;
	private int playerPositionIndex = 0;
	private Board board = null;
	
	public Player(Board _board, String _name, int _startingFunds)
	{
		this.name = _name;
		this.funds = _startingFunds;
		this.board = _board;
	}
	
	public int getPlayerPositionIndex()
	{
		return this.playerPositionIndex;
	}
	
	public String getName()
	{
		return this.name;
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
	
	


}