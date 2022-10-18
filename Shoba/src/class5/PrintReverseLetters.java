package class5;

public class PrintReverseLetters {
public static void main(String args[]) {
	String name="shoba;";
	for(int i=name.length()-1;i>=0;i=i-1) {
		System.out.println(name.charAt(i));
	}
}
}
