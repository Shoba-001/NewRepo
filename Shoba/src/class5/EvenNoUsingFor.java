package class5;

public class EvenNoUsingFor {
	public static void main(String args[]) {
		int evenCount=0;
		for(int i=200;i<=400;i++) {
			if(i%2==0) {
			evenCount=evenCount+1;
			}
		}
		System.out.println(evenCount);
	}

}
