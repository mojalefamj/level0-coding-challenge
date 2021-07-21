public class Task7 {
	public static double temp (double celsius) {
		return celsius * 9 / 5 + 32;
	}

	public static double temp2 (double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static void main (String[] args) {
		System.out.printf("%.2f", temp2(87));
	}
}
