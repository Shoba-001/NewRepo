package class8;

public class Plural {
	public void checkPlural(String[] names) {
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("s")) {
				System.out.println(names[i]);
			}
		}
	}
}
