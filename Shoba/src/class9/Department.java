package class9;

public class Department {
	private String name;
	private int deptcode;
	private boolean ismanual;
	private Student student;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDeptcode(int deptcode) {
		this.deptcode=deptcode;
	}
	public int getDeptcode() {
		return deptcode;
	}
	public void setIsmanual(boolean ismanual) {
		this.ismanual=ismanual;
	}
	public boolean getIsmanual() {
		return ismanual;
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	public Student getStudent() {
		return student;
	}

}
 