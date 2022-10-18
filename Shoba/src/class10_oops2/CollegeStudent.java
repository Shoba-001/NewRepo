package class10_oops2;

public class CollegeStudent extends Student {
private	String clgName;
private	String clgLocation;
	
	public CollegeStudent(String name, int age, String clgName, String clgLocation) {
		super(name,age);
		this.clgName=clgName;
		this.clgLocation=clgLocation;
	}
	public String toString() {
		return super.toString()+" "+clgName+" "+clgLocation;
	}

}
