package hwassignment9csc250;

public class Player
{
	//fields - variables associated with an instance of an object
	public int jersey_number;
	public int rating;
		
	//constructor
	Player(int jersey_number, int rating)
	{
		this.jersey_number = jersey_number;
		this.rating = rating;
	}
		
	public int getRating() 
	{
		return rating;
	}

	public void setRating(int rating) 
	{
		if(rating >= 0)
		{
			this.rating = rating;
		}
	}

	public int getJersey_number() 
	{
		return jersey_number;
	}
	
	public void setJersey_number(int jersey_number) 
	{
		if(jersey_number >= 0)
		{
			this.jersey_number = jersey_number;
		}
	}
	
}
