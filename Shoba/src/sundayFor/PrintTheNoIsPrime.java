package sundayFor;

public class PrintTheNoIsPrime {
	public static void main(String args[]) {
		int num=4;
		boolean isprime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				isprime=false;
			}
			if(isprime==true){
				System.out.println("Given no is Prime");
			}
			else {
				System.out.println("Given no is not prime");
		}
	}

}
