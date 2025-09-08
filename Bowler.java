abstract class Player
{
	public abstract void fitness();
	public void getCountry()
	{
		System.out.println("India");
	}
}
class Bowler extends Player
{
	public void fitness()
	{
		System.out.println("Fitness of bowler");
	}
	public static void main(String args[])
	{
		Bowler b = new Bowler();
		b.getCountry();
		b.fitness();
	}
}
