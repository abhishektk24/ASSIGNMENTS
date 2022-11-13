

import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int guessNum() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" guesser kindly guess the number : ");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Player
{
	int guessNum1;
	int guessNum2;
	int guessNum3;
	
	int guessNum1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1 kindly guess the number : ");
		guessNum1=scan.nextInt();
		return guessNum1;		
	}	
	int guessNum2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 2 kindly guess the number : ");
		guessNum2=scan.nextInt();
		return guessNum2;
	}
	int guessNum3()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 3 kindly guess the number : ");
		guessNum3=scan.nextInt();
		return guessNum3;
	}
			
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void CollectNumFromGuesser() 
	{		
		Guesser g = new Guesser();
		numFromGuesser=g.guessNum();		
	}
	
	void CollectNumFromPlayers() 
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum1();
		numFromPlayer2 = p2.guessNum2();
		numFromPlayer3 = p3.guessNum3();	
	}
	
	void Compare()
	{
		if (numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) 
			{						
			System.out.println(" Game tied between all the players please play again");
			System.out.println();
			
			{
				int guessNumAgain;
				Scanner aa = new Scanner(System.in);
				System.out.println("Guesser kindly guess the number again : ");				
				guessNumAgain=aa.nextInt();
				
				int guessNumAgainP1;
				Scanner bb = new Scanner(System.in);
				System.out.println("Player 1 kindly guess the number again : ");
				guessNumAgainP1=bb.nextInt();	
				
				int guessNumAgainP2;
				Scanner cc = new Scanner(System.in);
				System.out.println("Player 2 kindly guess the number again : ");
				guessNumAgainP2=cc.nextInt();
				
				int guessNumAgainP3;
				Scanner dd = new Scanner(System.in);
				System.out.println("Player 3 kindly guess the number again : ");
				guessNumAgainP3=dd.nextInt();
				if(guessNumAgain == guessNumAgainP1) 
				{
					System.out.println("Player 1 won the game");
				}
				else if(guessNumAgain == guessNumAgainP2) 
				{
					System.out.println("Player 2 won the game");
				}
				else  if(guessNumAgain == guessNumAgainP3)
				{
					System.out.println("Player 3 won the game");
				}
			}
			}
			else if(numFromGuesser == numFromPlayer2) 
			{				
				System.out.println("Match Tied Between Player 1 && 2");
				System.out.println();
				{
					int guessNumAgain;
					Scanner aa = new Scanner(System.in);
					System.out.println("Guesser kindly guess the number again : ");
					guessNumAgain=aa.nextInt();
					
					int guessNumAgainP1;
					Scanner bb = new Scanner(System.in);
					System.out.println("Player 1 kindly guess the number again : ");
					guessNumAgainP1=bb.nextInt();	
					
					int guessNumAgainP2;
					Scanner cc = new Scanner(System.in);
					System.out.println("Player 2 kindly guess the number again : ");
					guessNumAgainP2=cc.nextInt();
					
					if(guessNumAgain == guessNumAgainP1) 
					{
						System.out.println("Player 1 won the game");
					}
					else if(guessNumAgain == guessNumAgainP2) 
					{
						System.out.println("Player 2 won the game");
					}
				}
			}	
		     else if(numFromGuesser==numFromPlayer3)
			{
		    	 System.out.println("Match Tied Between Player 3 && 1");
		    	 System.out.println();
		    	 {
						int guessNumAgain;
						Scanner aa = new Scanner(System.in);
						System.out.println("Guesser kindly guess the number again : ");
						guessNumAgain=aa.nextInt();
						
						int guessNumAgainP3;
						Scanner bb = new Scanner(System.in);
						System.out.println("Player 3 kindly guess the number again : ");
						guessNumAgainP3=bb.nextInt();	
						
						int guessNumAgainP1;
						Scanner cc = new Scanner(System.in);
						System.out.println("Player 1 kindly guess the number again : ");
						guessNumAgainP1=cc.nextInt();
						
						if(guessNumAgain == guessNumAgainP3) 
						{
							System.out.println("Player 3 won the game");
						}
						else if(guessNumAgain == guessNumAgainP1) 
						{
							System.out.println("Player 1 won the game");
						}
					}
		    	 
			}		
			else 
			{
				System.out.println("Player 1 won the game");
			}		
		}

		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{				
				System.out.println("Match Tied Between Player 2 && 3");
				System.out.println();
				{
					int guessNumAgain;
					Scanner aa = new Scanner(System.in);
					System.out.println("Guesser kindly guess the number again : ");
					guessNumAgain=aa.nextInt();
					
					int guessNumAgainP1;
					Scanner bb = new Scanner(System.in);
					System.out.println("Player 2 kindly guess the number again : ");
					guessNumAgainP1=bb.nextInt();	
					
					int guessNumAgainP2;
					Scanner cc = new Scanner(System.in);
					System.out.println("Player 3 kindly guess the number again : ");
					guessNumAgainP2=cc.nextInt();
					
					if(guessNumAgain == guessNumAgainP1) 
					{
						System.out.println("Player 2 won the game");
					}
					else if(guessNumAgain == guessNumAgainP2) 
					{
						System.out.println("Player 3 won the game");
					}	
				}
			}
			else 
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		    {
				System.out.println("Player 3 won the game");
			}
		else 
		{
			System.out.println("GAME OVER PLEASE TRY AGAIN!!!!!!!!!");
		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.CollectNumFromGuesser();
		u.CollectNumFromPlayers();
		u.Compare();
		
	}
}
