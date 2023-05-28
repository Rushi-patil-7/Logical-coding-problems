package stringprogramms;

public class reverser {
public static void main(String[] args) {
//	String Reverse
	String s = "   rushikesh ";
	
	s= s.trim(); // trim() method is used to remove leading and trainling white spaces; 
	
	String str = "";
	for(int i =s.length()-1; i>=0 ; i--) {
		str += s.charAt(i);
	}
	System.out.println(str);
	
	stringresult1("rushi is worse boy");
	
}
// Sentence reverse
	public static void stringresult1(String sc) {
		String[] Str = sc.split(" ");
		String newStr= "";
		for(int i=Str.length-1 ; i>=0;i--) {
			newStr += Str[i] +" ";
			
		}
		System.out.println(newStr);
	}

}
