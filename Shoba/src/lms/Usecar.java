package lms;

public class Usecar {
	public static void main(String args[]) {
		Car name = new Car();
		name.brand = args[0];
		name.price = Integer.parseInt(args[1]);
		name.color = args[2];
		Car name1 = new Car();
		name1.brand = args[3];
		name1.price = Integer.parseInt(args[4]);
		name1.color = args[5];
		System.out.println("Brand="+name.brand+" "+"Price="+name.price+" "+"Color="+name.color+" "+"Brand="+name1.brand+" "+"Price="+name1.price+" "+"Color="+name1.color);
		
		
	}

}
 
class Car {
	
	String color;
	String brand;
	int price;
	
}
