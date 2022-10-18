package class6;

public class ReverseCount {
	public static void main(String args[]) {
	boolean[] names= {true,false,false,true,true};
	int count=0;
	for(int i=names.length;i>0;i--) {
		count++;
	}
	System.out.println(count);

}
}
