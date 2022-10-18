package class8;

public class UseCar {
	public static void main(String args[]) {
		Car c1=new Car();
		c1.brand="Audi";
		c1.price=50000;
		c1.color="Red";
		c1.taxamount=2500;
		c1.disamount=3000;
		
		Car c2=new Car();
		c2.brand="BMW";
		c2.price=60000;
		c2.color="Blue";
		c2.taxamount=4500;
		c2.disamount=2000;
		
		Car c3=new Car();
		c3.brand="Benz";
		c3.price=70000;
		c3.color="Green";
		c3.taxamount=3500;
		c3.disamount=4000;
		
		Car c4=new Car();
		c4.brand="Maruthi";
		c4.price=80000;
		c4.color="White";
		c4.taxamount=4500;
		c4.disamount=6000;
		
		Car[] cars= {c1,c2,c3,c4};
		c1.netPrice(cars);
		
	}

}
