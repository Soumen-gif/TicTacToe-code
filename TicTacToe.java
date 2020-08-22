class TicTacToe{
public static void main(String [] args)
{
System.out.println("welcome to tic tac toe game");
  resettingBoard();
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
}
