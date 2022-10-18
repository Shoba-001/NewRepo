package class6;

public class FindTheInBetweenletters {
	public static void main(String args[]) {
		String[] names= {"Shoba","Manu","Mummy","Daddy"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].substring(1,names.length-1));
		}
	}

}
