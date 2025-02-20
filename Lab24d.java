//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));


		int x =(file.nextInt());
		file.nextLine();

		TicTacToe game = new TicTacToe(file.nextLine());
		System.out.println(game);
		//read how many times you need to read

		//tic tac toe only wants file.nextLine()

		//make a tictactoe object for each game in the file

		//print the game(tictactoe object)
	
		//print the winner




	}
}



