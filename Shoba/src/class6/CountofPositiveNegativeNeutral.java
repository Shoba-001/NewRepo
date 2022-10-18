package class6;

public class CountofPositiveNegativeNeutral {
	public static void main(String args[]) {
		int[] nums= {-25,60,-54,30,80,-91,0,-5,-6};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2>=0) {
				System.out.println(nums[i]+"Posivite");
			}
			else if(nums[i]==0) {
				System.out.println(nums[i]+"Neutral");
			}
			else {
				System.out.println(nums[i]+"Negative");
			}
			
		}
	}

}
