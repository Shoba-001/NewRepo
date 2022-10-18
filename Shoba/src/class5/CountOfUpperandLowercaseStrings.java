package class5;

public class CountOfUpperandLowercaseStrings {
	public static void main(String args[]) {
		String name="LeNoVO";
		String temp=name.toUpperCase();
		int ucount=0;
		int lcount=0;
		for(int i=0;i<=name.length()-1;i++) {
			if(name.charAt(i)==temp.charAt(i)) {
				ucount++;
			}
			else {
				lcount++;
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);
	}

}
