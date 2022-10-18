package sundayFor;

public class PrintOddNosCount {
	public static void main(String args[]) {
		int ocount=0;
		for(int i=1;i<=11;i++) {
			if(i%2!=0) {
				ocount++;
			}
		}
		System.out.println(ocount);
	}

}
