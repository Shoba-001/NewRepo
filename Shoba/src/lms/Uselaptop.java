package lms;

public class Uselaptop {
	public static void main(String args[]) {
		String[] a = args[0].split(",");
		
		String[] b = args[1].split(",");
		
		Laptop lap1=new Laptop();
		lap1.brand=a[0];
		lap1.price=Integer.parseInt(a[1]);
		lap1.color=a[2];
		lap1.istouchscreen =Boolean.parseBoolean(a[3]);
		Laptop lap2=new Laptop();
		lap2.brand = b[0];
		lap2.price=Integer.parseInt(b[1]);
		lap2.color=b[2];
		lap2.istouchscreen =Boolean.parseBoolean(b[3]);
		System.out.println("Brand="+lap1.brand+" "+"Price="+lap1.price+" "+"Brand="+lap2.brand+" "+"Price="+lap2.price);
	}

}

 class Laptop {
		String brand;
		int price;
		String color;
boolean istouchscreen;
	}
