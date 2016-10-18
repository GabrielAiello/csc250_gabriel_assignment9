package hwassignment9csc250;
import java.util.ArrayList;
import java.util.Scanner;

public class Examiner 
{
	static Player[] players = new Player[5];
	public static void main (String[] args)
	{
		Player p = new Player(15, 3);
		System.out.println(p.getJersey_number());
		p.setJersey_number(1);
		System.out.println(p.getJersey_number());
		Driver.players[0] = p;
	}
}
