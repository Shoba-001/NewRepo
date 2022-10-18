package class8;

public class Max {
	public String findMax(String[] nums) {
		String temp=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i].length()>temp.length()) {
				temp=nums[i];
				
			}
		}
		return temp;
		
	}
	public int findMax(int[] nums) {
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		return max;
	}

}
