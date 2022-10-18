package class14;

public class Student {
	private String name;
	private int rollno;
	private String branch;
	private boolean isMale;
	 
	public Student(String name,int rollno,String branch,boolean isMale) {
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
		this.isMale=isMale;
	}
		
	
		public String toString() {
			return name+" "+rollno+" "+branch+" "+isMale;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setRollno(int rollno) {
			this.rollno=rollno;
		}
		public int getRollno() {
			return rollno;
		}
		public void setBranch(String branch) {
			this.branch=branch;
		}
		public String getBranch() {
			return branch;
		}
		public void setIsMale(boolean isMale) {
			this.isMale=isMale;
		}
		public boolean getIsMale() {
			return isMale;
		}
		
}
