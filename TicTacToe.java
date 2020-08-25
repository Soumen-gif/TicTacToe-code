
	import java.util.Random;
	import java.util.Scanner;
	public class TicTacToe {
		static int random=0;
		static int randomCheck=0;
		static String letter="";
		static int checkToss=0;
		static int head=0;
		static int tail=1;
		static String wonToss="";
		static String lossToss="";
		static int i=0;
		static int j=0;
		static int randomI=0;
		static int randomJ=0;
		static int userCount=0;
		static int computerCount=0;
		static boolean checkWin=false;
		static boolean checkLoss=false;

		//Declaring 2D array for getting board.
		static char[][] arrayBoard=new char[3][3];

		//Using Random class to generate random numbers.
		static Random r=new Random();

		//Using scanner class to get desire input.
		static Scanner sc=new Scanner(System.in);

		//To generate random number.;
		private static int getRandomNumber() {
			random=r.nextInt(2);
			return random;	
		}

		//To know the letter X or O is assign to me.
		private static String getLetter() 
		{
			randomCheck=getRandomNumber();
			if(randomCheck==head)
				return "Your competitor ahead with 'O'";
			else	
				return "You will ahead with 'X'";

		}

		//To get the toss result.
		private static int getToss() 
		{
			randomCheck=getRandomNumber();
			if(randomCheck==head)
			{
				System.out.println("You won the toss congratulations go ahead now....");
				return 0;
			}
			else
			{
				System.out.println("You lost the toss wait for your turn.... ");
				return 1;
			}
		}	

		//To display array as board.
		private static void arrayDisplay()
		{
			for (int i = 0; i < arrayBoard.length; i++) 
			{
				for (int j = 0; j < arrayBoard.length; j++) 
				{	
					if(arrayBoard[i][j]=='X' || arrayBoard[i][j]=='O')
					{
						System.out.print(arrayBoard[i][j]+" ");

					}
					else
					{
						System.out.print("-"+" ");
					}
				}
				System.out.println();
			}
		}


		static void getCorner()
		{
			randomCheck=r.nextInt(5)+1;
			if(randomCheck==1)
			{
				arrayBoard[0][0]='O';
			}
			else if(randomCheck==2)
			{
				arrayBoard[0][2]='O';
			}
			else if(randomCheck==3)
			{
				arrayBoard[2][0]='O';
			}
			else if(randomCheck==4)
			{
				arrayBoard[2][2]='O';
			}
			else if(randomCheck==5)
			{
				arrayBoard[1][1]='O';
			}
		}

		//To play computer user.
		private static boolean computerUser()
		{
			randomI=r.nextInt(3);
			randomJ=r.nextInt(3);	
			i=randomI;
			j=randomJ;

			if(arrayBoard[0][0]=='-' || arrayBoard[0][2]=='-' || arrayBoard[2][0]=='-' || arrayBoard[2][2]=='-' || arrayBoard[1][1]=='-')
			{
				getCorner();

			}
			else if(arrayBoard[i][j]=='X' || arrayBoard[i][j]=='O')
			{
				computerUser();
			}
			else if(arrayBoard[0][0]=='O' && arrayBoard[0][1]=='O' && arrayBoard[0][2]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			else if(arrayBoard[1][0]=='O' && arrayBoard[1][1]=='O' && arrayBoard[1][2]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			else if(arrayBoard[2][0]=='O' && arrayBoard[2][1]=='O' && arrayBoard[2][2]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			else if(arrayBoard[0][0]=='O' && arrayBoard[1][0]=='O' && arrayBoard[2][0]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			else if(arrayBoard[0][1]=='O' && arrayBoard[1][1]=='O' && arrayBoard[2][1]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");

				checkLoss=true;
			}
			else if(arrayBoard[0][2]=='O' && arrayBoard[1][2]=='O' && arrayBoard[2][2]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			else if(arrayBoard[0][0]=='O' && arrayBoard[1][1]=='O' && arrayBoard[2][2]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			else if(arrayBoard[0][2]=='O' && arrayBoard[1][1]=='O' && arrayBoard[2][0]=='O')
			{
				System.out.println("Computer won");
				System.out.println("You lost");
				checkLoss=true;
			}
			// All posible way to block 
			else if((arrayBoard[0][0]=='O' && arrayBoard[2][2]=='O') || (arrayBoard[0][0]=='X' && arrayBoard[2][2]=='X')) 
			{
				arrayBoard[1][1]='O';
			}
			else if((arrayBoard[0][0]=='O' && arrayBoard[1][1]=='O') || (arrayBoard[0][0]=='X' && arrayBoard[1][1]=='X')) 
			{
				arrayBoard[2][2]='O';
			}
			else if((arrayBoard[1][1]=='O' && arrayBoard[2][2]=='O') || (arrayBoard[1][1]=='X' && arrayBoard[2][2]=='X')) 
			{
				arrayBoard[0][0]='O';
			}
			else if((arrayBoard[0][2]=='O' && arrayBoard[2][0]=='O') || (arrayBoard[0][2]=='X' && arrayBoard[2][0]=='X')) 
			{
				arrayBoard[1][1]='O'; 
			}
			else if((arrayBoard[0][2]=='O' && arrayBoard[1][1]=='O') || (arrayBoard[0][2]=='X' && arrayBoard[1][1]=='X')) 
			{
				arrayBoard[2][0]='O';
			}
			else if((arrayBoard[2][0]=='O' && arrayBoard[1][1]=='O') || (arrayBoard[2][0]=='X' && arrayBoard[1][1]=='X')) 
			{
				arrayBoard[0][2]='O';
			}
			else if((arrayBoard[0][0]=='O' && arrayBoard[2][0]=='O') || (arrayBoard[0][0]=='X' && arrayBoard[2][0]=='X')) 
			{
				arrayBoard[1][0]='O';
			}
			else if((arrayBoard[0][0]=='O' && arrayBoard[1][0]=='O') || (arrayBoard[0][0]=='X' && arrayBoard[1][0]=='X')) 
			{
				arrayBoard[2][0]='O';
			}
			else if((arrayBoard[1][0]=='O' && arrayBoard[2][0]=='O') || (arrayBoard[1][0]=='X' && arrayBoard[2][0]=='X')) 
			{
				arrayBoard[0][0]='O';
			}
			else if((arrayBoard[0][1]=='O' && arrayBoard[2][1]=='O') || (arrayBoard[0][1]=='X' && arrayBoard[2][1]=='X')) 
			{
				arrayBoard[1][1]='O';
			}
			else if((arrayBoard[1][1]=='O' && arrayBoard[2][1]=='O') || (arrayBoard[1][1]=='X' && arrayBoard[2][1]=='X')) 
			{
				arrayBoard[0][1]='O';
			}
			else if((arrayBoard[0][1]=='O' && arrayBoard[1][1]=='O') || (arrayBoard[0][1]=='X' && arrayBoard[1][1]=='X')) 
			{
				arrayBoard[2][1]='O';
			}
			else if((arrayBoard[0][2]=='O' && arrayBoard[2][2]=='O') || (arrayBoard[0][2]=='X' && arrayBoard[2][2]=='X')) 
			{
				arrayBoard[1][2]='O';
			}
			else if((arrayBoard[0][2]=='O' && arrayBoard[1][2]=='O') || (arrayBoard[0][2]=='X' && arrayBoard[1][2]=='X')) 
			{
				arrayBoard[2][2]='O';
			}
			else if((arrayBoard[1][2]=='O' && arrayBoard[2][2]=='O') || (arrayBoard[1][2]=='X' && arrayBoard[2][2]=='X')) 
			{
				arrayBoard[0][2]='O';
			}
			else if((arrayBoard[0][0]=='O' && arrayBoard[0][2]=='O') || (arrayBoard[0][0]=='X' && arrayBoard[0][2]=='X')) 
			{
				arrayBoard[0][1]='O';
			}
			else if((arrayBoard[0][0]=='O' && arrayBoard[0][1]=='O') || (arrayBoard[0][0]=='X' && arrayBoard[0][1]=='X')) 
			{
				arrayBoard[0][2]='O';
			}
			else if((arrayBoard[0][1]=='O' && arrayBoard[0][2]=='O') || (arrayBoard[0][1]=='X' && arrayBoard[0][2]=='X')) 
			{
				arrayBoard[0][0]='O';
			}
			else if((arrayBoard[1][0]=='O' && arrayBoard[1][1]=='O') || (arrayBoard[1][0]=='X' && arrayBoard[1][1]=='X')) 
			{
				arrayBoard[1][2]='O';
			}
			else if((arrayBoard[1][1]=='O' && arrayBoard[1][2]=='O') || (arrayBoard[1][1]=='X' && arrayBoard[1][2]=='X')) 
			{
				arrayBoard[1][0]='O';
			}
			else if((arrayBoard[1][0]=='O' && arrayBoard[1][2]=='O') || (arrayBoard[1][0]=='X' && arrayBoard[1][2]=='X')) 
			{
				arrayBoard[1][1]='O';
			}
			else if((arrayBoard[2][0]=='O' && arrayBoard[2][1]=='O') || (arrayBoard[2][0]=='X' && arrayBoard[2][1]=='X')) 
			{
				arrayBoard[2][2]='O';
			}
			else if((arrayBoard[2][0]=='O' && arrayBoard[2][2]=='O') || (arrayBoard[2][0]=='X' && arrayBoard[2][2]=='X')) 
			{
				arrayBoard[2][1]='O';
			}
			else if((arrayBoard[2][1]=='O' && arrayBoard[2][2]=='O') || (arrayBoard[2][1]=='X' && arrayBoard[2][2]=='X')) 
			{
				arrayBoard[2][0]='O';
			}
			else if(arrayBoard[0][0]!='-' || arrayBoard[0][2]!='-' || arrayBoard[2][0]!='-' || arrayBoard[2][2]!='-')
			{
				arrayBoard[i][j]='O';
			}	
			arrayDisplay();
			System.out.println();
			return checkLoss;
		}

		//To play user.
		private static boolean user()
		{
			System.out.println("Enter i and j values between (0 to 2 )to get cell postion");		
			i=sc.nextInt();
			j=sc.nextInt();
			if(arrayBoard[i][j]=='X' || arrayBoard[i][j]=='O')
			{
				System.out.println("Already occupied this place sorry...");
				user();
			}
			else if(arrayBoard[0][0]=='X' && arrayBoard[0][1]=='X' && arrayBoard[0][2]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[1][0]=='X' && arrayBoard[1][1]=='X' && arrayBoard[1][2]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[2][0]=='X' && arrayBoard[2][1]=='X' && arrayBoard[2][2]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[0][0]=='X' && arrayBoard[1][0]=='X' && arrayBoard[2][0]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[0][1]=='X' && arrayBoard[1][1]=='X' && arrayBoard[2][1]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[0][2]=='X' && arrayBoard[1][2]=='X' && arrayBoard[2][2]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[0][0]=='X' && arrayBoard[1][1]=='X' && arrayBoard[2][2]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else if(arrayBoard[0][2]=='X' && arrayBoard[1][1]=='X' && arrayBoard[2][0]=='X')
			{
				System.out.println("You won");
				System.out.println("Computer loss");
				checkWin=true;
			}
			else
			{
				arrayBoard[i][j]='X';
				arrayDisplay();
				System.out.println();
			}		
			return checkWin;
		}

		//Checking who won toss and begin.
		private static void  playGame(int checkToss)
		{
			if(checkToss==head)
			{
				user();
			}
			else if(checkToss==tail)
			{
				computerUser();
			}
		}

		//Main method.
		public static void main(String[] args)
		{	
			arrayDisplay();
			letter=getLetter();
			System.out.println(letter);
			checkToss=getToss();
			playGame(checkToss);
			System.out.println();
			int n=0;
			while( n < 8)	
			{
				if(checkToss==tail)
				{
					user();
					System.out.println();
					userCount++;
					checkToss=head;
					if(checkWin==true)
						break;
				}

				if(checkToss==head)
				{   
					computerUser();
					System.out.println();
					computerCount++;
					checkToss=tail;
					if(checkLoss==true)
						break;
				}
				else if(userCount==computerCount)
				{

					System.out.println("Game Tie!!!!!");
				}
				n++;	
			}					
		}
	}


