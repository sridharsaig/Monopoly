import java.util.Scanner;

public class PlayerInteracter
{
	Board Board = null;
	static Scanner in = new Scanner(System.in);
	
	public PlayerInteracter()
	{
		
	}
	
	public void initSetup(Board _board)
	{
		this.Board = _board;
		int players = promptForInteger("Enter number of players");
		
		for(int i = 0; i < players; i++)
		{
			this.Board.Players.add(createPlayerPrompt());
		}
	}
	
	public static int promptForInteger(String promptMessage)
	{
		int result = 0;
		
		String line;
		boolean isValid = true;
		
		do
		{
			if(!isValid)
				System.out.println("Expecting an integer!");
			
			isValid = false;
			
			System.out.print("{%s}: ");
			line = in.nextLine();
			
			try
			{
				result = Integer.parseInt(line);
			}
			catch(Exception e)
			{
				isValid = false;
			}
			
		} while(!isValid);
		
		return result;
	}
	
	public static String promptForString(String promptMessage)
	{
		String result = "";
		System.out.printf("{%s}: ", promptMessage);
		result = in.nextLine();
		
		return result;
	}
	
	public static boolean promptForBool(String promptMessage)
	{
		String line = "";
		
		do
		{
			System.out.printf("{%s} (y/n): ", promptMessage);
			line = in.nextLine().toLowerCase();
			
		} while(!line.startsWith("y") && !line.startsWith("n"));
		
		return line.startsWith("y");
	}
	
	public Player createPlayerPrompt()
	{
		String name = promptForString("Enter a player name for character");
		return new Player(this.Board, name, 1500);
	}
}
