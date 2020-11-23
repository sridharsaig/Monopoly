package BoardTiles;

public class EventsActionsTile extends BoardTile
{

	public EventsActionsTile(String _name)
	{
		super(_name);
	}
	
	public void PlayerLandedOnTile(Player player)
	{
		super.PlayerLandedOnTile(player);
		
		//give the player a random card 
	}
	
}
