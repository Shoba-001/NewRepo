package lms;

public class Usesaree {
public static void main(String args[]) {
	String[] words = args[0].split(",");
	String[] split = args[1].split(",");
	Saree a1 = new Saree();
	a1.material = words[0];
	a1.price = Integer.parseInt(words[1]);
	a1.color = words[2];
	a1.disper = Integer.parseInt(words[3]);
	a1.netprice = a1.price-(a1.price*a1.disper/100);
	Saree a2 = new Saree();
	a2.material = split[0];
	a2.price = Integer.parseInt(split[1]);
	a2.color = split[2];
	a2.disper = Integer.parseInt(split[3]);
	a2.netprice = a2.price-(a2.price*a2.disper/100);
	String convert1 = a1.material.toUpperCase();
	String convert2=a2.material.toUpperCase();
	System.out.println("Brand="+convert1+"Color="+a1.color+"Netprice="+a1.netprice+"Netprice="+a2.netprice+"Brand="+convert2+" "+"color="+a2.color);
	
	  
}
}
class Saree {
	String material;
	int price;
	String color;
	int disper;
	int netprice;
	int taxper;
}