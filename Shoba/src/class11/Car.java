package class11;

public abstract class Car implements Vehicle {
	String brand;
	String color;
	int cc;
    public void showSpeed(int speed) {
    	System.out.println(speed);
    }
    public void getMileage(int mileage) {
    	System.out.println(mileage);
    }
    public abstract void showEngine(int cc);
}
