package class6;

public class EvenCountUsingForAndIf {
	public static void main(String args[]) {
		int[] nums= {10,11,12,13,14,15,16};
		int evencount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evencount++;
			System.out.println(nums[i]+"Even");	
			}
		}
		System.out.println(evencount);
	}

}
