package test1;

public class Printgiven14 {
	public static void main(String args[]) {
		String name1 ="world wide wonder";
		String name2="programs";
		String a1="world";
		String a2="wide";
		String a3="wonder";
		int length1=a1.length();
		int length2=a2.length();
		int length3=a3.length();
		String convert1=a1.toUpperCase();
		String convert2=a2.toUpperCase();
		String convert3=a3.toUpperCase();
		String join=name2.concat(name1);
		System.out.println(length1+" "+length2+" "+length3+" "+convert1+" "+convert2+" "+convert3+" "+join);
		
	}

}
