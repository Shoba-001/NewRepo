package class13;

public class CustomerDetails {
	private String name;
	private int age;
	private String email;
	private int accBal;
	private long adharNo;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setAccBal(int accBal ) {
		this.accBal=accBal;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo=adharNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public CustomerDetails(String name,int age,String email,int accBal,long adharNo) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.accBal=accBal;
		this.adharNo=adharNo;
	}
	public String toString() {
		return name+age+email+accBal+adharNo;
	}
	}


