import java.util.Scanner;
import java.util.Random;
class TicTacToe{
static Random random=new Random();
public static void main(String [] args)
{
System.out.println("welcome to tic tac toe game");
System.out.println("see the board before your 1st turn");
  resettingBoard();
//  tossToBegin();
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
/*
    public static void tossToBegin()
     {
		int toss = random.nextInt(2);
		if(toss == 0)
		{
			System.out.println("Player won the toss.....");
         System.out.println("choose your option.....1)0 or 2)X");
         Scanner sc=new Scanner(System.in);
         String choice=sc.next();
         if(choice.equalsIgnoreCase("X"))
         System.out.println("You have decided to play with X");
         else
            System.out.println("You have decided to play with 0");
		}
		else
		{
			System.out.println("Computer won the toss...");
         System.out.println("computer got 0 here");
		}

	} */
}
