package class11;

public class DailyWorker extends Worker {
	public void getWork(String job) {
		System.out.println(job);
	}
	public void calculateSalaryPerDay(int salaryPerHour,int workingHours) {
		System.out.println(salaryPerHour+" "+workingHours);
	}

}
