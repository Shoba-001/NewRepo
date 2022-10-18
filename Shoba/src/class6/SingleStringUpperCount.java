package class6;

public class SingleStringUpperCount {
	public static void main(String args[]) {
		String a="ViJaYaLaKsHmI";
		String convert=a.toUpperCase();
		int ucount=0;
		//char[] b=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==convert.charAt(i)) {
				ucount++;
			
			}
		}
				System.out.println(ucount);
			
		
		
	}

}
