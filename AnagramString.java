package stringprogramms;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		anagram("keep is", "peeK is");
		anagram("ASTRONOMERS", "NO MORE STARS");
	}
//	public static void anagram(String s1, String s2) {
//		
//		String copyOfs1=  s1.replaceAll(" " ,"");
//		String copyOfs2=  s2.replaceAll(" " ,"");
//		
//		boolean status =true;
//		
//		if(s1.length() != s2.length()) {
//			status=false;
//		}
//		else {
//			char[] s1Arr = s1.toLowerCase().toCharArray();
//			char[] s2Arr = s2.toLowerCase().toCharArray();
//			
//			Arrays.sort(s1Arr);
//			Arrays.sort(s2Arr);
//			
//			status = Arrays.equals(s1Arr, s2Arr);
//		}
//			
//			if(status) {
//				System.out.println("Anagram String");
//			}
//			else System.out.println("not Anagram String");
//		
//	}


	public static void anagram(String s1, String s2) {
		

		String s1copy = s1.replaceAll(" ", "");
		String s2copy = s2.replaceAll(" ", "");
		
		boolean status = true;
		if(s1copy.length() != s2.length()) {
			status =false;
		}
		else {
			char[] ch1str= s1copy.toLowerCase().toCharArray();
			char[] ch2str= s2copy.toLowerCase().toCharArray();
		
			Arrays.sort(ch1str);
			Arrays.sort(ch2str);
		
			status = Arrays.equals(ch1str, ch2str);
		}
		if(status) {
			System.out.println("Anagram String");
		}
		else System.out.println("not Anagram");

		
	}
}
