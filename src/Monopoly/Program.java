package Monopoly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program
{

	public static void main(String[] args) throws IOException
	{
		PlayerInteracter playerInteracter = new PlayerInteracter();
		Board board = new Board(playerInteracter);
		playerInteracter.initSetup(board);
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));   
		board.showPlayerInfo();
		while(true)
		{
			board.nextTurn();
			obj.readLine();
		}
	}

}
