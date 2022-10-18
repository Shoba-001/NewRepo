package class13;

import java.util.HashMap;
import java.util.Iterator;

public class Hashh {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(10, "shoba");
		hm.put(2, "S");
		hm.put(3, "H");
		hm.put(4, "O");
		hm.put(5, "Sh");
		for(Integer i : hm.keySet()) {
			if(i>4) {
				System.out.println(i);
			}
		}
		for(String st:hm.values()) {
			if(st.equals("Shoba")) {
				System.out.println(st);
			}
		}
		for(Integer i:hm.keySet()) {
			String st=hm.get(i);
			System.out.println(i+" "+st);
		}
		hm.forEach((s,m)-> {
			System.out.println(s+" "+m);
		});
		hm.keySet().forEach((s)-> {
			System.out.println(s);
		});
		hm.values().forEach((m)-> {
			System.out.println(m);
		});
		Iterator<Integer>it=hm.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<String> sh=hm.values().iterator();
		while(sh.hasNext()) {
			if(sh.next().startsWith("s")) {
				sh.remove();
			}
		}
		
	}
}
