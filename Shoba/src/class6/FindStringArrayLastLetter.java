package class6;

public class FindStringArrayLastLetter {
	public static void main(String args[]) {
		String[] words={"Shoba","Manu","Mummy","Daddy"};
		for(int i=0;i<words.length/2;i++) {
         System.out.println(words[i].charAt(words[i].length()-1));
		}
	}

}
