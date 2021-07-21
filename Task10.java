public class Task10 {
	public static void strCmp (String x, String y) {
		for (int i = 0; i < x.length(); i++) {
			for (int k = 0; k < y.length(); k++) {
				if (x.charAt(i) == y.charAt(k)) {
					System.out.print(x.charAt(i) + ", ");
				}
			}
		}
	}


	public static void main (String[] args) {
		System.out.print("Common letter/s: ");
		strCmp("house","computers");
	}
}
