package class8;

public class Car {
	String brand;
	int price;
	String color;
	int taxamount;
	int disamount;
	
	public void netPrice(Car[] cars) {
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].price+cars[i].taxamount-cars[i].disamount);
		}
	}

	public int MinPrice(Car[] cars) {
			int min=cars[0].price;
			for(int i=0;i<cars.length;i++) {
				if(cars[i].price<min) {
					min=cars[i].price;
				}
			}
				return min;
			
		}
	}


