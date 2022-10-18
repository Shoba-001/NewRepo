package class7;

public class UseLaptop {
	public static void main(String args[]) {
		Laptop l1=new Laptop();
		l1.brand="DELL";
		l1.price=500000;
		l1.istouchscreen=true;
		
		Laptop l2=new Laptop();
		l2.brand="lenovo";
		l2.price=500000;
		l2.istouchscreen=false;

		Laptop l3=new Laptop();
		l3.brand="APPLE";
		l3.price=500000;
		l3.istouchscreen=true;
		
		Laptop l4=new Laptop();
		l4.brand="DELLI";
		l4.price=500000;
		l4.istouchscreen=false;
		
		
		Laptop[] laptops= {l1,l2,l3,l4};
		for(int i=0;i<laptops.length;i++) {
		if(laptops[i].brand.equals(laptops[i].brand.toUpperCase())) {
			System.out.println(laptops[i].brand+laptops[i].price+laptops[i].istouchscreen);
		}
	}

}
}