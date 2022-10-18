package dataType;

public class UseCar {
	public static void main(String args[]) {
		Car car1 = new Car();
		car1.brand = "bmw";
		car1.price = 600000;
		car1.color = "red";
		car1.taxamount = 50000;
		car1.disamount = 10000;
		car1.netprice = car1.price+car1.taxamount-car1.disamount;
			Car car2 = new Car();
	car2.brand = "benz";
	car2.price = 800000;
	car2.color = "blue";
	car2.taxamount = 60000;
	car2.disamount = 100000;
	car2.netprice = car2.price+car2.taxamount-car2.disamount;
		System.out.println("brand="+car1.brand+"price="+car1.price+"color="+car1.color+"taxamount="+car1.taxamount+"disamount="+car1.disamount+"netprice="+car1.disamount);
		System.out.println("brand="+car2.brand+" "+"netprice="+car2.netprice);
	}
}