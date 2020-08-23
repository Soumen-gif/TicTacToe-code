import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class TicTacToe{
static Random random=new Random();
static Scanner scanner=new Scanner(System.in);
	static String arr[][]=new String[3][3];
public static void main(String [] args)
{
System.out.println("welcome to tic tac toe game");
//System.out.println("see the board before your 1st turn");
  //resettingBoard();
 //tossToBegin();
    displayRefreshedBoard();
		playerPlayGame();
}
public static int chooseOfMark()
	{
		int choose = tossForChance();

		if (choose == 0)
		{   
			System.out.println("press 1 for choosing X  or  press 2 for choosing  O");
			int mark=scanner.nextInt();
			if(mark == 1)
			{
				System.out.println("you have chosen X......");
				return 1;
			}
			else
			{
				System.out.println("you have chosen O......");
				return 2;
			}
		}

		else
			System.out.println("computer has won the toss and choose O...");
		return 0;
	}
public static int tossForChance()
	{
		int result=random.nextInt(2);
		if(result == 0)
		{
			System.out.println("Player won the toss..... ");
			return 0;
		}

		else
			System.out.println("computer won the toss......");
		return 1;
	}

	public static String[][] resetBoard()
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				arr[i][j]=" ";
			}	
		}
		System.out.println("new refreshed board here");
		return arr;
	}
	public static void displayRefreshedBoard()
	{
		String arr[][]=resetBoard();

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]+" | ");	
			}	System.out.println();
			System.out.println();
		}

	}

	public static void playerPlayGame()
	{
		int mark1=chooseOfMark();
		System.out.println("select your position where you want to place the mark....");
		int mark=scanner.nextInt();
		if(mark == 1 )
		{
			if(arr[0][0].equals(" ") && mark1 == 2)
				arr[0][0]= "O";

			else if(arr[0][0].equals(" ") )
				arr[0][0]= "X";
		}

		else if(mark == 2 )
		{
			if(arr[0][1].equals(" ") && mark1 == 2)
				arr[0][1]="O";
			else if(arr[0][1].equals(" "))
				arr[0][1]="X";
		}

		else if(mark == 3 )
		{
			if(arr[0][2].equals(" ") && mark1 == 2)
				arr[0][2]="O";

			else if(arr[0][2].equals(" "))
				arr[0][2]="X";
		}
		else if(mark == 4 )
		{
			if(arr[1][0].equals(" ") && mark1 == 2)
				arr[1][0]="O";

			else if(arr[1][0].equals(" "))
				arr[1][0]="X";
		}
		else if(mark == 5 )
		{
			if(arr[1][1].equals(" ") && mark1 == 2)
				arr[1][1]="O";
			else if(arr[1][1].equals(" "))
				arr[1][1]="X";
		}
		else if(mark == 6 )
		{
			if(arr[1][2].equals(" ") && mark1 == 2)
				arr[1][2]="O";
			else if(arr[1][2].equals(" "))
				arr[1][2]="X";
		}
		else if(mark == 7 )
		{  
			if(arr[2][0].equals(" ") && mark1 == 2)
				arr[2][0]="O";
			else if(arr[2][0].equals(" "))
				arr[2][0]="X";
		}
		else if(mark == 8 )
		{
			if(arr[2][1].equals(" ") && mark1 == 2)
				arr[2][1]="O";
			else if(arr[2][1].equals(" "))
				arr[2][1]="X";
		}
		else if(mark == 9 )
		{
			if(arr[2][2].equals(" ") && mark1 == 2)
				arr[2][2]="O";
			else if(arr[2][2].equals(" "))
				arr[2][2]="X";
		}
       else
               System.out.println("Its not a valid position....");



		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]+" | ");	
			}	System.out.println();
			System.out.println();
		}
	}
}
