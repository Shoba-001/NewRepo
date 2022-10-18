package test1;

public class Printgiven7 {
	public static void main(String args[]) {
		String word = "java,PYTHON,C++";
		String a1="java";
		String a2="PYTHON";
		String a3="C++";
		String[] splits =word.split(",");
		int length1=a1.length();
		int length2=a2.length();
		int length3=a3.length();
		String convert1 = a1.toLowerCase();
		String convert2 = a2.toLowerCase();
		String convert3 = a3.toLowerCase();
		System.out.println(splits+" "+length1+" "+length2+" "+length3+""+convert1+" "+convert2+" "+convert3);
		
		
		
		
	}

}
