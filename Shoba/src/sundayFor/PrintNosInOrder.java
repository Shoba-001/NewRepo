package sundayFor;

public class PrintNosInOrder {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
			if(i==11) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
