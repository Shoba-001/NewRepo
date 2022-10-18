package class11;

public abstract class Laptop implements Electronics {
	public void name(String name) {
		System.out.println(name);
	}
	public void processor(String processor) {
		System.out.println(processor);
	}
	public void isWarranty(boolean isWarranty) {
         System.out.println(isWarranty);
	}
public abstract void isTouchscreen(boolean isTouchscreen);
}

