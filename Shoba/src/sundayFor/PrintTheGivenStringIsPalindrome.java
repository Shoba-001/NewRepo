package sundayFor;

public class PrintTheGivenStringIsPalindrome {
	public static void main(String args[]) {
		String word="Shoba";
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		}
			if(word.equalsIgnoreCase(temp)) {
				System.out.println("Given input is a Palindrome");
			}
			else {
				System.out.println("Given input is not a Palindrome");
			}
		
	}
	

}
