package class8;

public class LowerCount {
	public int findLowerCount(String[] names) {
		int lcount=names[1].length();
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<lcount) {
				lcount=names[i].length();
			}
		}
		return lcount;
		
			
		}
	
	}


