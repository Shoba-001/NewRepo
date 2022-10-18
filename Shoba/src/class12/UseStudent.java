package class12;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String [] args) {
		Student s1=new Student(5000,"Shoba","Female");
		Student s2=new Student(6000,"Kishore","Male");
		Student s3=new Student(7000,"Vijji mam","Female");
		Student s4=new Student(5000,"Bhavani","Female");
		Student s5=new Student(5000,"Sarvana","Male");
		Student s6=new Student(9000,"Arul","Male");
		Student s7=new Student(5000,"Udanya","Female");
		Student s8=new Student(4500,"Navya","Female");
		Student s9=new Student(7500,"Pooji","Female");
		Student s10=new Student(8000,"Nishanthi","Female");
		
		ArrayList<Student> s =new ArrayList<>();
		ArrayList<Student> females=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		s.add(s8);
		s.add(s9);
		s.add(s10);
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		s.forEach(a->System.out.println(a.getName().toUpperCase()));
		s.forEach(b->System.out.println(b.getFee()));
		s.forEach(c->System.out.println(c.getGender()));
		
		s.forEach(a-> {
			if(a.getName().equals("Shoba")) {
			System.out.println(a.getName());
		}
		});
		s.forEach(a-> {
			for(int i=0;i<s.size();i++) {
				System.out.println(s.get(i));
			}
		});
		for(Student z:s) {
			if(z.getGender().equals("Female")) {
				females.add(z);
			}
		}
		females.forEach(z->System.out.println(z));
		
	}

}
