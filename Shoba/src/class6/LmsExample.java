package class6;

public class LmsExample {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		int[] nums= {a,b,c,d,e};
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
