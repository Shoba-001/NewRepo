package class10_oops2;

public class Student {
private	String name;
private	int age;
	
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;

	}
	public String toString() {
		return name+" "+age;
	}

}
