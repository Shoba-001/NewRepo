package class11;

public class UseWorker {
	public static void main(String [] args) {
		DailyWorker day=new DailyWorker();
		day.getWork("java trainer");
		day.calculateSalaryPerDay(500, 6);
	}

}
