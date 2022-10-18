package class14;

public class Mobile {
	private int price;
	private String brand;
	private boolean isWarranty;
	private String color;
	private String model;
	
	public Mobile(int price,String brand,boolean isWarranty,String color,String model) {
	this.price=price;
	this.brand=brand;
	this.isWarranty=isWarranty;
	this.color=color;
	this.model=model;
	}
	public String toString() {
		return price+" "+brand+" "+isWarranty+" "+color+" "+model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
	this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty=isWarranty;
	}
	public boolean getIsWarranty() {
		return isWarranty;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
}
