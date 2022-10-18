package class8;

public class UseMobile {
	public static void main(String [] args) {
		Mobile m1=new Mobile();
		m1.brand="Samsung";
		m1.price=50000;
		m1.color="Red";
		m1.taxamount=3500;
		
		Mobile m2=new Mobile();
		m2.brand="Redmi";
		m2.price=70000;
		m2.color="Red";
		m2.taxamount=4500;
		
		Mobile m3=new Mobile();
		m3.brand="Apple";
		m3.price=60000;
		m3.color="White";
		m3.taxamount=3000;
		
		System.out.println(m3.findNetPrice(m1));
		System.out.println(m2.findNetPrice(m2));
		System.out.println(m3.findNetPrice(m3));
		
	}

}
