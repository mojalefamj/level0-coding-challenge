public class Task9 {
	static void getVowels (String word) {
		word = word.toLowerCase();

		System.out.print("Vowels: ");
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ) {
				System.out.print(word.charAt(i) + ", ");
			}
		}
	}

	public static void main (String[] args) {
		getVowels("PEARL the WARrIor");
	}
}
