import java.util.ArrayList;

public class Task9 {
	static void getVowels (String word) {
		word = word.toLowerCase();
		ArrayList<Character> vowels = new ArrayList<>();

		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ) {
				vowels.add(word.charAt(i));
			}
		}

		System.out.print("Vowels: ");
		if (vowels.size() == 1) {
			System.out.print(vowels.get(0));
		}
		else if (vowels.size() > 1) {
			for (int i = 0; i < vowels.size(); i++) {
				System.out.print(vowels.get(i));
				if (i != vowels.size() - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	}

	public static void main (String[] args) {
		getVowels("PEARL the WARrIor");
	}
}
