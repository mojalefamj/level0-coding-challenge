public class Task6
{
	public static int maximum (int num1, int num2, int num3)
	{
		int max = num3;

		if (num1 > num2)
		{
			if (num1 > num3)
			{
				max = num1;
			}
		}
		else if (num2 > num3)
		{
			max = num2;
		}
		return max;
	}

	public static void main (String[] args)
	{
		System.out.print(maximum(10,0,10));
	}
}
