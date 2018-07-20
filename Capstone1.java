import java.util.Scanner;

public class Capstone1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		String userInput;
		
		System.out.println("Enter a phrase:");
		userInput = scnr.nextLine();
		
	
		if (userInput.charAt(0) == 'a') {
			System.out.println(userInput + "way");
		}
		else if (userInput.charAt(0) == 'e') {
			System.out.println(userInput + "way");
		}
		else if (userInput.charAt(0) == 'i') {
			System.out.println(userInput + "way");
		}
		else if (userInput.charAt(0) == 'o') {
			System.out.println(userInput + "way");
		}
		else if (userInput.charAt(0) == 'u') {
			System.out.println(userInput + "way");
		}
		else {
			continue;
		}		
	
}
		private static int weedVowel(String userInput) {
		
			int i;
			for (i = 0 ; i <= userInput.length() ; ++i ) {	 //indext 0 aeiou ++1
				if (userInput.charAt(i) == 'a') {
					break;
				}
				if (userInput.charAt(i) == 'e') {
					break;
				}
				if (userInput.charAt(i) == 'i') {
					break;
				}
				if (userInput.charAt(i) == 'o') {
					break;
				}
				if (userInput.charAt(i) == 'u') {
					break;
				}
			}
			return i;
			
		}
		private static String findVowel(String userInput) {
		
			int whereVowel;
			String partialWord;
			String constToBeMoved;
			String userOutput;
			
			whereVowel = userInput.indexOf(userInput);     //finds index of the first vowel
			partialWord = userInput.substring(whereVowel); // creates the partial word starting where the first vowel i	
			constToBeMoved = userInput.substring(0, whereVowel); //pulls out the letters to be moved to the end
			userOutput = (partialWord + constToBeMoved + "ay");
		
			return userOutput;
		}
		
		//private static String whichVowel(String vowel) 
			
			//if (vowel == a) {
				
			
}
	


