package lms;

public class Sample1 {
	public static void main(String args[]) {
		String[] words = args[0].split(",");
		String name = words[0];
		int age = Integer.parseInt(words[1]);
		long number = Long.parseLong(words[2]);
		String mail = words[3];
		boolean check = Boolean.parseBoolean(words[4]);
		System.out.println("Name="+name+"Age="+age+"Number="+number+"Mail="+mail+"is true"+check);
		
	}

}
