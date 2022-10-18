package class13;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student(889,"Shoba","CSE",75);
		Student s2=new Student(887,"Manu","CIVIL",80);
		Student s3=new Student(886,"Sagar","Mech",86);
		Student s4=new Student(885,"Momm","ECE",90);
		Student s5=new Student(884,"Dadd","Mech",95);
		HashMap<Integer,Student> students=new HashMap<>();
		students.put(s1.getId(),s1);
		students.put(s2.getId(),s2);
		students.put(s3.getId(),s3);
		students.put(s4.getId(),s4);
		students.put(s5.getId(),s5);
		for(Integer i : students.keySet()) {
			if(i>884) {
				System.out.println(i);
			}
	}
		Iterator<Integer> s=students.keySet().iterator();
		while(s.hasNext()) {
			if(s.next().equals(887)) {
				s.remove();
			}
		}
		for(Integer i:students.keySet()) {
			Student sh=students.get(i);
			System.out.println(students.get(i)+" "+sh);
		
		
	}
		students.forEach((a,h)->System.out.println(a));
	}
}

