package stringprogramms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordFromString {

	public static void main(String[] args) {
		
		findDuplicate("java have java frameworks");
		findDuplicate("mobile is userful as well as is harmful as as");
		

		
	}

	private static void findDuplicate(String string) {
		String str[] =string.split(" " );
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String strings : str) {
			if(wordCount.containsKey(strings)) {
				wordCount.put(strings.toLowerCase(),wordCount.get(strings.toLowerCase())+1);
				
			}
			else {
				wordCount.put(strings.toLowerCase() ,1);
			}
		}
		
		Set<String> words = wordCount.keySet();
		
		for(String word : words) {
			if(wordCount.get(word) >1 ) {
				System.out.println( word + " : " + wordCount.get(word));
			}
		}
		
	}
}
