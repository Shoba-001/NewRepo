package class12;

import java.util.ArrayList;

public class UseHotel {
public static void main(String[] args) {
	Hotel h1=new Hotel("Thalapakkati","Kandanchavadi","5k");
	Hotel h2=new Hotel("SeaShell","Perungudi","6k");
	Hotel h3=new Hotel("Thala","Kandanchavadi","7k");
	Hotel h4=new Hotel("Pakkati","Kandanchavadi","8k");
	ArrayList<Hotel> h=new ArrayList<>();
	h.add(h1);
	h.add(h2);
	h.add(h3);
	h.add(h4);
	h.forEach(x->System.out.println(x));
	h.forEach(x->System.out.println(x.getHrent()));
}
}
