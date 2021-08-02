public class Task8 {
	public static void converter (int x) {
		int hours = x / 60;
		int mins = x % 60;
		
		if (hours == 1) {
			if (mins == 1) {
				System.out.println(hours + " hour, " + mins + " minute");
			}
			else
				System.out.println(hours + " hour, " + mins + " minutes");
		}
		else {
			System.out.println(hours + " hours, " + mins + " minutes");
		}
	}

	public static void main (String[] args) {
		converter(51);
	}
}
