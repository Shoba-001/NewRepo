package class10_oops2;


	public class EngStudent extends CollegeStudent {
	private	String EngClgName;
	private	String EngClgLocation;
		
		public EngStudent(String name,int age,String clgName,String clgLocation,String EngClgName,String EngClgLocation) {
		super (name, age, clgName, clgLocation);
		this.EngClgName=EngClgName;
		this.EngClgLocation=EngClgLocation;
		}
		public String toString() {
			return super.toString()+" "+EngClgName+" "+EngClgLocation;
		}

	}



