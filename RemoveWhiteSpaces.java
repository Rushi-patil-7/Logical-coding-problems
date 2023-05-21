package stringprogramms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "this is a new Stirng in a class";
		System.out.println(s.replace(" ", ""));
		String newstr=s.replaceAll("\s", "");
	
		System.out.println(newstr);
	}
}
