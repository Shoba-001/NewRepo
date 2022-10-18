package class6;

public class MinimumNumber {
	public static void main(String args[]) {
		int[] nums= {51,32,100,5,0,70,91};
		int mini=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<mini) {
				mini=nums[i];
				}
		}
		System.out.println(mini);
	}

}
