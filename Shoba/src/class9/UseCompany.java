package class9;

public class UseCompany {
	public static void main(String args[]) {
		Employee e1=new Employee();
		e1.setName("Shoba");
	    e1.setSalary(50000);
	    e1.setId(889);
	    e1.setDepartment("Cse");
	    
		Company c1=new Company();
	    c1.setName("TCS");
	    c1.setLocation("Chennai");
	    c1.setFloorcount(5);
	    c1.setEmployee(e1);
	    
	    System.out.println(c1.getName()+c1.getLocation()+c1.getFloorcount()+c1.getEmployee());
	    System.out.println(c1.getEmployee().getName()+c1.getEmployee().getSalary()+c1.getEmployee().getId()+c1.getEmployee().getDepartment());
	
	
	}

}
