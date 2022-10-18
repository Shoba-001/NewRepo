package class8;

public class Mobile {
	String brand;
	int price;
	String color;
	int taxamount;
	
	public int findNetPrice(Mobile b) {
		return b.price+b.taxamount;
	}

}
