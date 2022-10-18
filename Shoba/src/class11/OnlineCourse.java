package class11;

public class OnlineCourse {
	public void showCourseId(int id) {
		System.out.println(id);
	}
	public void showCourseName(String name) {
		System.out.println(name);
	}
	public void showCourseTrainer(String trainer) {
		System.out.println(trainer);
	}
	public void showCourseFees(String name) {
		if(name.equals("java")) {
			System.out.println("Course Fees is 10,000");
		}
		else if(name.equals("SQL")) {
			System.out.println("Course Fees is 15,000");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	public void showUrLink(String urlink) {
		System.out.println(urlink);
	}

}
