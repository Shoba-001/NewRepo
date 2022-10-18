package class9;

public class Processor {
	private String brand;
	private int core;
	private String generation;
	
	public Processor(String brand,int core,String generation) {
    this.brand=brand;
    this.core=core;
    this.generation=generation;
	}
	public String toString() {
		return brand+core+generation;
	}
}
