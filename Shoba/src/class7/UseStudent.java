package class7;

public class UseStudent {
	public static void main(String args[]) {
		Student s1=new Student();
		s1.name="Shoba";
		s1.rollno=89;
		s1.ismale=false;
		
		Student s2=new Student();
		s2.name="Manu";
		s2.rollno=73;
		s2.ismale=true;
		
		Student s3=new Student();
		s3.name="Sabitha";
		s3.rollno=88;
		s3.ismale=false;
		
		Student s4=new Student();
		s4.name="Babbi";
		s4.rollno=90;
		s4.ismale=false;
		
		Student s5=new Student();
		s5.name="Sagar";
		s5.rollno=91;
		s5.ismale=true;
		
		Student[] students= {s1,s2,s3,s4,s5};
		Student[]f=new Student[students.length];
		for(int i=0;i<students.length;i++) {
			f[i]=students[i];
		System.out.println(f[i].name);
		}
		}
}
	