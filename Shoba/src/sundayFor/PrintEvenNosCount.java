package sundayFor;

public class PrintEvenNosCount {
	public static void main(String args[]) {
		int ecount=0;
		for(int i=2;i<=10;i++) {
			if(i%2==0) {
				ecount++;
			}
		}
			System.out.println(ecount);
		
	}
}
