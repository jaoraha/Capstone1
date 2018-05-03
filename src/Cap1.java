//Title: 		Capstone 1
//Author: 		John Aoraha & Julie Xu
//Date: 		04/27/2018

import java.util.Scanner;

public class Cap1 {

	public static void main(String[] args) {

		String word;
		String cont = "y";

		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		while (cont.equalsIgnoreCase("y")) {

			// Prompt user for input.
			System.out.println("Enter a line to be translated:");
			Scanner scan = new Scanner(System.in);
			word = scan.nextLine();


			// Determine if word starts with vowel using isVowel method, concatenate "way" to end of word.
			if (isVowel(word) == true) {
				System.out.println(word.concat("way"));

			}

			else {

				//If word doesn't start with vowel, determine position of vowel user FindVowel method and assign to index.
				int index = FindVowel(word);

				//Use substring to determine letters after vowel.
				String removeVowel = word.substring(index);
				
				//Use substring to determine letters before vowel.
				String start = word.substring(0, index);

				//Output letters after vowel plus letters before vowel plus "ay".
				System.out.println(removeVowel + start + "ay");

			}
			// Prompt user if they want to continue and obtain "y/n' input.
			System.out.println();
			System.out.print("Continue? (y/n): ");
			cont = scan.next();
			System.out.println();

		}
		
		System.out.println("Bye!");

	}

	// Method to determine whether word starts with vowel.
	public static boolean isVowel(String word) {

		if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
				|| word.startsWith("u") || word.startsWith("A") || word.startsWith("E") || word.startsWith("I")
				|| word.startsWith("O") || word.startsWith("U")) {
			return true;
		} else {
			return false;
		}
	}

	// Method to determine index position of vowel in a string.
	public static int FindVowel(String word) {

		int i;
		char c;
		String vowels = "aeiouAEIOU";

		for (i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			if (vowels.indexOf(c) != -1)
				return word.indexOf(c);
		}

		return 0;
	}

}