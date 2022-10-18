package sundayFor;

public class Large {
	public int word(String[] citys) {
		int max=0;
		for(int i=0;i<citys.length;i++) {
			if(citys[i].length()>max) {
				max=citys[i].length();
				
			}
		}
		return max;
	}

}
