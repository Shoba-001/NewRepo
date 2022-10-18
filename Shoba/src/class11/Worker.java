package class11;

public abstract class Worker {
	public void name(String name) {
		System.out.println("Shoba");
	}
	int id;
	int salaryPerHour;
	int workingHours;
	String job;
	
	public  abstract void getWork(String job);
	public abstract void calculateSalaryPerDay(int salaryPerHour,int workingHours);

}
