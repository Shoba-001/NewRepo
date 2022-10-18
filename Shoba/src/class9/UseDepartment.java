package class9;

public class UseDepartment {
public static void main(String args[]) {
	Student s1=new Student();
	s1.setName("Shoba");
	s1.setRollno(73);
	s1.setIsmale(false);
	
	Department d=new Department();
	d.setName("CSE");
	d.setDeptcode(45);
	d.setIsmanual(false);
	d.setStudent(s1);
	
	System.out.println(d.getName()+d.getDeptcode()+d.getIsmanual());
	System.out.println(d.getStudent().getName()+d.getStudent().getRollno()+d.getStudent().getIsmale());
}

}
