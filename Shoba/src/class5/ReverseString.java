package class5;

public class ReverseString {
	public static void main(String args[]) {
		String name="Shoba";
		String temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		if(name.equalsIgnoreCase(temp)) {
			System.out.println("Given input is a palindrome");
		}
		else {
			System.out.println("Given input is not a palindrome");
		}
	}

}
