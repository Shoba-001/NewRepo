package class14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Shoba",573,"CSE",false);
		Student s2=new Student("Manu",545,"Civil",true);
		Student s3=new Student("Srujju",589,"CSE",false);
		Student s4=new Student("Manju",564,"ECE",false);
		Student s5=new Student("Sagar",590,"Mech",true);
	
		 ArrayList<Student> v=new ArrayList<>();
		 v.add(s1);
		 v.add(s2);
		 v.add(s3);
		 v.add(s4);
		 v.add(s5);
		List<Integer> vi=v.stream().map(ss->ss.getRollno()).collect(Collectors.toList());
		vi.forEach(x->System.out.println(x));
		System.out.println("-----branch------");
		 
		v.stream().filter(a->a.getBranch().startsWith("C")).forEach(b->System.out.println(b));
		System.out.println("-------different----");
		
		List<String> vin=v.stream().map(z->z.getBranch()).collect(Collectors.toList());
		vin.forEach(z->System.out.println(z));
		System.out.println("-----only branches------");
		
		Long l=v.stream().count();
		System.out.println(l);
		System.out.println("-----count------");
		
		Map<String,Student> vinay=v.stream().filter(x->x.getName().equals("Manu")).collect(Collectors.toMap(Student:: getName,Function.identity()));
		vinay.forEach((s,m)->System.out.println(s+" "+m));
		System.out.println("-----Key&Value------");
		Map<String,String> vina=v.stream().filter(x->x.getName().equals("Manu")).collect(Collectors.toMap(Student:: getName,Student:: getBranch));
		vina.forEach((s,m)->System.out.println(s+" "+m));
		System.out.println("-----Key&Single Branch Value------");
		Map<String,Boolean> vinay1=v.stream().filter(x->x.getName().equals("Manu")).collect(Collectors.toMap(Student:: getName,Student::getIsMale));
	    vinay1.forEach((s,m)->System.out.println(s+" "+m));
	    System.out.println("-----Key&Value------");
	    
	    
	}

}
