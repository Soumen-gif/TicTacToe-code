import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe
{
	static Random random=new Random();
	static Scanner scanner=new Scanner(System.in);
	static String arr[][]=new String[3][3];
	//refreshing board and printing board


	public static void tossForChance()
	{
		int result=random.nextInt(1);
		if(result == 0)

			System.out.println("Player won the toss ");

		else
			System.out.println("Computer won the toss");
	}


	public static void chooseOfMark()
	{
		System.out.println("Press 1 for choosing X  or  press 2 for choosing  O");
		int mark=scanner.nextInt();
		if(mark == 1)
			System.out.println("you have choosen X");
		else
			System.out.println("you have choosen O");	
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
		System.out.println("BOARD IS REFRESHED");
		return arr;
	}
	public static void displayRefreshedBoard()
	{
		String arr[][]=resetBoard();

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
				System.out.println("-----------");
		}


	}

	public static void PlayGame()
	{

		int alternate=0;// for alternative playing(even for player odd for computer)

		if(alternate%2 == 0)
		{
			alternate++;

			System.out.println("ENTER POSITION TO PLACE MARK");

			int temp = 0;//for entering invalid position temp will be 0.
			while(temp != 1)

			{
				int mark=scanner.nextInt();
				if(mark == 1 && arr[0][0].equals(" ") )
				{
					arr[0][0] =  "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}

				else if(mark == 2 && arr[0][1].equals(" "))
				{
					arr[0][1] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}

				else if(mark == 3 && arr[0][2].equals(" ") )
				{
					arr[0][2] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else if(mark == 4 && arr[1][0].equals(" "))
				{
					arr[1][0] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else if(mark == 5 && arr[1][1].equals(" ") )
				{
					arr[1][1] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else if(mark == 6 && arr[1][2].equals(" ") )
				{
					arr[1][2] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else if(mark == 7 && arr[2][0].equals(" "))
				{  
					arr[2][0] =  "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else if(mark == 8 && arr[2][1].equals(" "))
				{
					arr[2][1] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else if(mark == 9 && arr[2][2].equals(" "))
				{
					arr[2][2] = "X";
					temp = 1;
					System.out.println("you have placed your  mark on "+mark);

				}
				else
				{
					System.out.println("ENTER VALID POSITION");
				}
			}//while loop end(for repeting dublicate temp is 1 now)


		}// if loop ending(alternate$2)

		else// computer is playing
		{

			alternate++;
			int temp = 0;// for entering invalid position temp will be 0.
			while(temp != 1)
			{

				if( arr[0][0].equals(" "))//for position 1
				{
					arr[0][0] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 1");

				}
				else if( arr[0][2].equals(" "))//for position 3
				{
					arr[0][2] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 3");

				}

				else if( arr[2][0].equals(" "))//for position 7
				{
					arr[2][0] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 7");

				}



				else if( arr[2][2].equals(" "))//for position 9
				{
					arr[2][2] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 9");

				}

				else if(arr[1][1].equals(" "))//for position 5
				{
					arr[1][1] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 5");

				}


				else if( arr[0][1].equals(" "))//for position 2
				{
					arr[0][1] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 2 ");

				}


				else if(arr[1][0].equals(" "))//for position 4
				{
					arr[1][0] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 4");

				}

				else if( arr[1][2].equals(" "))//for position 6
				{
					arr[1][2] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 6");

				}


				else if(arr[2][1].equals(" "))//for position 8
				{
					arr[2][1] = "O";
					temp = 1;
					System.out.println("computer has placed his mark on 8");

				}
			}
		}
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
				System.out.println("----------");
		}// else ending(alternate%2)

	}



	public static void main(String[] args)
	{
		tossForChance();
		chooseOfMark();
		displayRefreshedBoard();
		PlayGame();
	}

}



