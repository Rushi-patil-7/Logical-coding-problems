package stringprogramms;

public class Reverse {

	public static void main(String[] args) {
		
		// First way using String Buffer Class
		
		StringBuffer str= new StringBuffer("This is a String");
		System.out.println(str.reverse());
		
//		Second Way using Iterate
		
		String strings = "SampleString";
		char newStr[] =strings.toCharArray();
		for(int i = newStr.length -1 ; i >= 0 ; i--) {
			System.out.print(newStr[i]);
		}
		System.out.println(" ");
//		Third way using Recursive method
		System.out.println(recursiveMethod(strings));
		
	}
	static String recursiveMethod(String str)
	{
		if ((null == str) || (str.length() <= 1))
		{
			return str;
		}
		
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
