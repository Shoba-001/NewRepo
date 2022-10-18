package lms;

public class Sample5 {
	public static void main(String args[]) {
		String[]words = args[0].split("-");
		String name = words[0];
		String name1 = words[1];
		String name2 = words[2];
		char char1 = name.charAt(0);
		char char2 = name.charAt(1);
		String word1=name2.substring(1,name.length()-1);
		char[] letter1=name.toCharArray();
		System.out.println(name1+" "+name2+" "+char1+" "+char2+" "+word1+" "+letter1[0]+" "+letter1[1]);
		
		
	}

}
