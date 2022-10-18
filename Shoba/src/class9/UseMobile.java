package class9;

public class UseMobile {
public static void main(String args[]) {
	
	Battery b1=new Battery();
	b1.brand="S";
	b1.price=9000;
	b1.backup=5000;
	
	Battery b2=new Battery();
	b2.brand="M";
	b2.price=85000;
	b2.backup=6000;
	
	
	Mobile m1=new Mobile();
	m1.brand="S";
	m1.price=50000;
	m1.iswaterproof=true;
	m1.battery=b1;
	
	Mobile m2=new Mobile();
	m2.brand="S";
	m2.price=70000;
	m2.iswaterproof=false;
	m2.battery=b2;
	
	System.out.println(b1.brand+b1.price+b1.backup);
	System.out.println(b2.brand+b2.price+b2.backup);
	System.out.println(m1.battery.price+m1.battery.brand+m1.battery.backup);
	
	
}
}
 