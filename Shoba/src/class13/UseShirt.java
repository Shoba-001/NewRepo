package class13;

import java.util.HashMap;

import class12.Shirt;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt("Uspolo",2000,true);
		Shirt s2=new Shirt("PeterEngland",5500,true);
		Shirt s3=new Shirt("Vanhusein",2500,true);
		HashMap<String,Integer> sh=new HashMap<>();
		sh.put("Uspolo",s1.getPrice());
		sh.put("PeterEngland",s2.getPrice());
		sh.put("Vanhusein",s3.getPrice());
		System.out.println(sh.keySet());
		System.out.println(sh.values());
		
}
}
