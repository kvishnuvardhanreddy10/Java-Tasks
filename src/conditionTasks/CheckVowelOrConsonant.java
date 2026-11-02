package conditionTasks;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		String character = sc.next();
		
		if(character.equals("A") || character.equals("E") || character.equals("I") || character.equals("O") || character.equals("U") || 
				character.equals("a") || character.equals("e")|| character.equals("i") || character.equals("o") || character.equals("u")) {
			System.out.println("Given character is a vowel ");
		}else {
			System.out.println("Given character is a consonant ");
		}
	}

}
