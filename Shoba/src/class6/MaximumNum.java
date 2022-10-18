package class6;

public class MaximumNum {
	public static void main(String args[]) {
		int[] nums= {51,32,100,5,0,70,91};
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>temp) {
				temp=nums[i];
			}
		}
		System.out.println(temp);
	}

}

