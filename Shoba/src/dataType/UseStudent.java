package dataType;

public class UseStudent {
	public static void main(String args[]) {
		Student student1=new Student();
		student1.name = "shoba";
		student1.rollnumber=573;
		student1.mathsmark=90;
		student1.sciencemark=80;
		student1.socialmark=70;
		student1.englishmark=60;
		student1.telugumark=50;
		student1.averagemark=(student1.mathsmark+student1.sciencemark+student1.socialmark+student1.englishmark+student1.telugumark)/5;
		System.out.println("averagemark="+student1.averagemark);
		
	}

}
