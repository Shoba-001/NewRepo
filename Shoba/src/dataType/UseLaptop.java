package dataType;

public class UseLaptop {
	public static void main(String args[]) {
		Laptop l1 = new Laptop();
		l1.brand = "dell";
		l1.processor = "intel";
		l1.color = "Grey";
		l1.istouchscreen = true;
		
		Laptop l2 = new Laptop();
		l2.brand = "lenovo";
		l2.processor = "icore";
		l2.color = "white";
		l2.istouchscreen = false;
		
		Laptop l3 = new Laptop();
		l3.brand = "hp";
		l3.processor = "intelicore";
		l3.color = "black";
		l3.istouchscreen = true;
		
		System.out.println("brand="+l1.brand+"processor="+l1.processor+"color="+l1.color+"touchscreen="+l1.istouchscreen);
		System.out.println("brand="+l2.brand+"processor="+l2.processor+"color="+l2.color+"touchscreen="+l2.istouchscreen);
		System.out.println("brand="+l3.brand+"processor="+l3.processor+"color="+l3.color+"touchscreen="+l3.istouchscreen);
		
	}

}
