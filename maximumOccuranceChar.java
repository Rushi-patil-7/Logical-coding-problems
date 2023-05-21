package stringprogramms;

public class maximumOccuranceChar {

	public static void main(String[] args) {
		
		String str= "Hey Hii Rushi what are you doing ?";
		char s='i';
		
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == s) {
				count++;
			}
			
		}
		System.out.println(str);
		System.out.println("first way by place char of : " + s + " "+count);
	
//SECOND WAY USING FOREACH LOOP
	int charCount = 0; //resetting character count
	char c = 'a';
    for(char ch: str.toCharArray()){
        if(ch == c){
            charCount++;
        }
    }    
    System.out.println("Second way by place char of : " + c + " "+charCount);

//THIRD WAY USING REPLACE METHOD
    String d = "d";
    int count3 = str.length() - str.replace(d, "").length();
    
		System.out.println("Third ways : by place char of : " + d + " "+ count3 );
	}

}