package stringprogramms;

import java.util.HashMap;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) {
		sentence("i am a boy");
		sentence("She is a girl");
		sentence("java is Object Orient programming language");
	}	
	public static void sentence(String s) {
		char c[] = s.toCharArray();
		
		HashMap<Character, Integer> ch = new HashMap<Character, Integer>();
		
		for(char charc : c) {
			if(ch.containsKey(charc)) {
				ch.put(charc, ch.get(charc)+1);
			}
			else {
				ch.put(charc, 1);
			}
		}
				
		System.out.println(s + " : " + ch);
	}
	
}
