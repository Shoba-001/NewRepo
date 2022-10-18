package class10_oops2;

public class Bank {
	public int loanAvailability(String name) {
		return 50000;
	}
	public int loanAvailablity(String name,int salary) {
		return 50000+salary;
	}
	public int loanAvailability(String name,int salary,int properties) {
		return 50000+salary*properties;
	}

}
