package class12;

import java.util.ArrayList;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt("Uspolo",2000,true);
		Shirt s2=new Shirt("PeterEngland",5500,true);
		Shirt s3=new Shirt("Vanhusein",2500,true);
		Shirt s4=new Shirt("PeterEngland",3000,false);
		Shirt s5=new Shirt("b",4000,false);
		Shirt s6=new Shirt("c",5000,true);
		ArrayList<Shirt> s=new ArrayList<>();
		ArrayList<Shirt>checkedShirt=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.forEach(a-> {
			if(a.getBrand().equals("PeterEngland")) {
			System.out.println(a.getBrand());
		}
		});
		for(Shirt n :s) {
			if(n.getIsChecked()==true) {
				checkedShirt.add(n);
			}
		}
		checkedShirt.forEach(n-> System.out.println(n));
		
	}
}
