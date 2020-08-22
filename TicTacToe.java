import java.util.Scanner;
import java.util.Random;
class TicTacToe{
static Random random=new Random();
public static void main(String [] args)
{
System.out.println("welcome to tic tac toe game");
  resettingBoard();
  tossToBegin();
}
public static void resettingBoard()
	{
		int arr[][]=new int[3][3];
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]);
				if(j == 0 || j == 1)
					System.out.print(" | ");
			}	
			System.out.println();
			if(i == 0 || i == 1)
				System.out.println("---------");
		}
	}
    public static void tossToBegin()
     {
		int toss = random.nextInt(2);
		if(toss == 0)
		{
			System.out.println("Player won the toss.....");
		}
		else
		{
			System.out.println("Computer won the toss...");
		}
	}
}
