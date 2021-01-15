public class Task8
{
	public static void converter (int x)
	{
		int hours = x / 60;
		int mins = x % 60;
		
		if (hours > 1)
		{
			if (mins > 1)
			{
				System.out.print(hours + " hours, " + mins + " minutes");
			}
			else
				System.out.print(hours + " hours, " + mins + " minute");
		}
		else if (mins > 1)
		{
			System.out.print(hours + " hour, " + mins + " minutes");
		}
		else
		{
			System.out.print(hours + " hour, " + mins + " minute");
		}
	}

	public static void main (String[] args)
	{
		converter(71);
	}
}
