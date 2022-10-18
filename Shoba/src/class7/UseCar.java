package class7;

public class UseCar {
	public static void main(String args[]) {
		
	Car car1=new Car();
	car1.brand="Audi";
	car1.color="blue";
	car1.price=50000;
	
	Car car2=new Car();
	car2.brand="Honda";
	car2.color="white";
	car2.price=60000;
	
	Car car3=new Car();
	car3.brand="BMW";
	car3.color="Black";
	car3.price=700000;
	
	Car[] cars=new Car[3];
	cars[0]=car1;
	cars[1]=car2;
	cars[2]=car3;
	int max=cars[0].price;
	int index=0;
	for(int i=0;i<cars.length;i++) {
		if(cars[i].price>=max) {
max=cars[i].price;
index=i;
		}
	}
	System.out.println(cars[index].brand+cars[index].color+cars[index].price);
	}
}
