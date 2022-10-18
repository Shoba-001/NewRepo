package sundayFor;

public class PrintOddPlacedString {
public static void main(String args[]) {
	String word="Shoba";
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)%2!=0) {
			System.out.println(word.charAt(i));
		}
	}
}
}
