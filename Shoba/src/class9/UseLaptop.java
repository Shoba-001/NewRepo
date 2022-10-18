package class9;

public class UseLaptop {
public static void main(String [] args) {
	Processor p=new Processor("Intel",8,"i7");
	Laptop lap=new Laptop("Lenovo",80000,true,p);
	
	System.out.println(lap);
}
}
