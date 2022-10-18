package sundayFor;

public class PrintStringInReverseOrder {
	
	public static void main(String args[]) {
		String word="Shoba";
		for(int i=word.length()-1;i>=0;i--) {
	if(word.charAt(i)>word.length()) {
				System.out.println(word.charAt(i));
			}
		}
	}
}


