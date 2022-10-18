package class9;

public class UseCar {
	public static void main(String args[]) {
		Engine e1 =new Engine();
             e1.setBrand("Honda");
             e1.setPrice(75000);
		     e1.setPistoncount(5);
		
		Car car1=new Car();
		car1.setBrand("Honda");
		car1.setPrice(86000);
		car1.setColor("Black");
		car1.setEngine(e1);
		
		
		System.out.println(car1.getBrand()+car1.getPrice()+car1.getColor()+car1.getEngine().getBrand()+car1.getEngine().getPrice());
		
	}

}
