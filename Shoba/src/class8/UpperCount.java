package class8;

public class UpperCount {
	public void findUpperCount(String name) {
		int ucount=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='A'&&name.charAt(i)<='Z') {
				ucount++;
			}
			
		}
		System.out.println(ucount);
	}

}
