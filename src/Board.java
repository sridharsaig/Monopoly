import BoardTiles.*;
import java.util.ArrayList;

public class Board
{
	ArrayList<Player> Players = new ArrayList<Player>();
	BoardTile[] boardTiles;
	PlayerInteracter PlayerInteracter = null;								  
	
	public Board(PlayerInteracter playerInteracter)
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
	
}
