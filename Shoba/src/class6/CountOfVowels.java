package class6;

public class CountOfVowels {
	public static void main(String args[]) {
		String[] names= {"Shoba","Sky"};
		int vowelscount=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u"))  {
			vowelscount++;
			System.out.println(vowelscount);
			}
		}
	}

}
