package sundayFor;

public class PrintStringInOrder {
	public static void main(String args[]) {
		String word="Shoba";
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)==0) {
				continue;
			}
			else {
				System.out.println(word.charAt(i));
			}
		}
	}

}
