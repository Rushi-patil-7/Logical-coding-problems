package stringprogramms;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
	
		String[] words = sentence.trim().split(" " );
		
		System.out.println("Words are : " + words.length);
	}
	
}
