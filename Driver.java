package hwassignment9csc250;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{ //20 minutes + 60
	static Player[] player  = new Player [10];
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		Driver.SetAllJerseys(player);
		int n = 1;
		char option;
		do
		{
			option = Driver.showMenu();
			
			//respond the option here
			if(option == 'u')
			{
				Driver.UpdateRating(player);
			}
			else if(option == 'a')
			{
				Driver.outputAbove(player);
			}
			else if(option == 'r')
			{
				Driver.replaceRating(player);
			}
			else if(option == 'o')
			{
				Driver.output(player);
			}
		}
		while(option != 'q');
		
		System.out.println("Get lost!");
	} //end of main method
	
	static void SetAllJerseys (Player[] a)
	{
		for(int i = 0; i < (a.length*(0.5)); i++)
		{
			Scanner input = new Scanner (System.in);
			System.out.print("Enter player " + (i + 1) + "'s jersey number:");
			int b = input.nextInt();
			System.out.println("");
			System.out.print("Enter player " + (i + 1) + "'s rating:");
			int c = input.nextInt();
			System.out.println("");
			Player p = new Player(b, c);
			player[i] = p;
		}

	}
	static void UpdateRating (Player[] a)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("What player would you like to update? ");
		for(int i = 0; i < (a.length*(0.5)); i++)
		{
			int b = input.nextInt();
			int d = (0 + player[i].getJersey_number());
			int c = 0;
			if(b == d)
			{
				System.out.print("What is the new rating? ");
				c = input.nextInt();
			}
			System.out.println("");
			Player p = new Player(b, c);
			player[i] = p;
		}

/*		int jersey_number = input.nextInt();
		for(int i = 0; i < a.length; i++)
		{
			if(jersey_number == a[i])
			{
				//I found the player they want to update
				System.out.print("What is the new rating? ");
				b[i] = input.nextInt();
				break;
			}
		}

			return b;*/
		return;
	}
	
	static char showMenu()
	{
		Scanner elephant = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("u - Update player rating");
		System.out.println("a - Output players above a rating");
		System.out.println("r - Replace player");
		System.out.println("o - Output roster");
		System.out.println("q - Quit");
		System.out.print("Choose an option: ");
		return elephant.next().charAt(0);
	}
	static void outputAbove(Player[] a)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("What is the minimum rating?");
		int b = input.nextInt();
		for(int i = b; i < a.length; i++)
		{
			System.out.println("Jersey Number: " + player[i].getJersey_number() + " (" + player[i].getRating() + " rating)");
		}
	}

	static void output(Player[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Jersey Number: " + player[i].getJersey_number() + " (" + player[i].getRating() + " rating)");
		}
	}
	static void replaceRating (Player[] a)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("What player would you like to update? ");
		for(int i = 0; i < (a.length*(0.5)); i++)
		{
			int b = input.nextInt();
			int d = (0 + player[i].getJersey_number());
			if(b == d)
			{
				System.out.print("What is the new Jersey number? ");
				b = input.nextInt();
				System.out.print("What is the new rating? ");
				int c = input.nextInt();
			}
			int c = input.nextInt();
			System.out.println("");
			Player p = new Player(b, c);
			player[i] = p;
		}
	}

}
