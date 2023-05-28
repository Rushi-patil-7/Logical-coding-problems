package stringprogramms;

import java.util.LinkedHashSet;

//remove duplicates from the String
public class RemoveCha {
	
	public static void main(String[] args) {
		
		String s = "Rushikesh is my name";
		char str [] = s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(Character ch :str) {
			set.add(ch);
		}
		for(Character chc :set) {
			System.out.print(chc);
		}
	}

}
