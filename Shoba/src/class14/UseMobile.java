package class14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UseMobile {
	public static void main(String[] args) {
		Mobile m1=new Mobile(30000,"Samsung",true,"Red","A70s");
		Mobile m2=new Mobile(40000,"OnePlus",true,"Blue","O8+");
		Mobile m3=new Mobile(8000,"Motorola",false,"GreenMint","Note3");
		Mobile m4=new Mobile(90000,"Samsungg",true,"White","Flip1");
		Mobile m5=new Mobile(9500,"Apple",false,"Maroon","ap05");
		ArrayList<Mobile> s=new ArrayList<>();
		s.add(m1);
		s.add(m2);
		s.add(m3);
		s.add(m4);
		s.add(m5);
		List<Mobile> sh=s.stream().filter(a->a.getPrice()>=30000).collect(Collectors.toList());
		sh.forEach(x->System.out.println(x));
		System.out.println("-----------");
		
		List<Mobile> sho=s.stream().filter(a->a.getIsWarranty()==true).collect(Collectors.toList());
		sho.forEach(xi->System.out.println(xi));
		System.out.println("-----------");
		
		List<Mobile> shob=s.stream().filter(a->a.getBrand().contains("S")).collect(Collectors.toList());
		shob.forEach(xiv->System.out.println(xiv));
		System.out.println("-----------");
		
		List<Mobile> shoba=s.stream().filter(a->a.getIsWarranty()==true).collect(Collectors.toList());
		for(Mobile m:shoba) {
			System.out.println(m.getPrice()-999);
		}
		System.out.println("-----------");
		
		s.stream().filter(a->a.getBrand().startsWith("S")).forEach(a->System.out.println(a));
		System.out.println("-----------");
		
		s.stream().filter(a->a.getColor().equals("White")).forEach(b->System.out.println(b));
		System.out.println("-----------");
		
		ArrayList<Mobile>manu=s.stream().filter(a->a.getModel().equals("A70s")).collect(Collectors.toCollection(ArrayList::new));
	    manu.forEach(a->System.out.println(a));
	    System.out.println("-----------");
	    
	}

}
