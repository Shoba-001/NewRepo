package class12;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
public static void main(String[] args) {
	ArrayList <Integer> ages = new ArrayList <> (Arrays.asList(10,20,30,40));
	ages.add(28);
	ages.add(26);
	ages.add(27);
	ages.add(25);
	ages.add(26);
	ages.add(24);
	ages.add(27);
	ages.add(27);
	ages.add(26);
	
	for(int i=0;i<ages.size();i++) {
		System.out.println(ages.get(i));
	}
}

}
