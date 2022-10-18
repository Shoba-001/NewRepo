package class9;

public class Laptop {
private String brand;
private int price;
private boolean istouchscreen;
private Processor processor;

public Laptop(String brand,int price,boolean istouchscreen,Processor processor) {
	this.brand=brand;
	this.price=price;
	this.istouchscreen=istouchscreen;
	this.processor=processor;
}
public String toString() {
	return brand+price+istouchscreen+processor;
}
}
