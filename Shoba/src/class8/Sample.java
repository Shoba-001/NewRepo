package class8;

public class Sample {
public String findPrime(int num) {
	boolean isprime=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
		 isprime=false;
		}
		
	}
	if(isprime==true) {
		return "Is prime";
	}
	else {
	return "is not prime";
	}
}
}
