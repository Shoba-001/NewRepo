package class6;

public class ForwardWithCount {
	public static void main(String args[]) {
		float[] weights=new float[9];
		int count=0;
		weights[0]=12.5f;
		weights[1]=14.5f;
		weights[2]=16.5f;
		weights[3]=17.5f;
		weights[4]=18.5f;
		weights[5]=19.5f;
		weights[6]=20.5f;
		weights[7]=21.5f;
		weights[8]=22.5f;
		for(int i=0;i<weights.length;i++) {
	count++;
		
		System.out.println(weights[i]);
		}
		System.out.println("count="+count);
	}

}
