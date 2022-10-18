package class12;

import java.util.ArrayList;

public class Stringg {
public static void main(String [] args) {
	ArrayList <String> names = new ArrayList <> ();
	names.add("Vijji mam");
	names.add("Shoba");
	names.add("Kishore");
	names.add("Saravana"); names.remove(3);
	names.add("Revanth");  names.set(0,"viji");
	names.add("Arul");
	names.add("Naveen");
	names.add("rajaram");
	names.add("Vignesh");
	names.add("VenkataPrasadan");
		names.forEach(s->System.out.println(s));
	
}
}
