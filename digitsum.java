package stringprogramms;

public class digitsum {

	public static void main(String[] args) {
		String s= "dikha38mndyue838";
		int sum=0;
 		for(int i=0; i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
				int no= Character.getNumericValue(s.charAt(i));
				sum =no +sum;
			}
		}
		System.out.println(sum);
	}
}
