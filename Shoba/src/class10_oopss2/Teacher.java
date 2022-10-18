package class10_oopss2;

public class Teacher extends Human {
	 int salary;
	 int id;
	 String experience;
	
public 	Teacher(String name,int age,int salary,int id,String experience) {
	super(name,age);	
	this.salary=salary;
		this.id=id;
		this.experience=experience;
	}
	public String toString() {
		return super.toString()+salary+id+experience;
	}

}
