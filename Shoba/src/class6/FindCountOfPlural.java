package class6;

public class FindCountOfPlural {
	public static void main(String args[]) {
		String[] words= {"chocolate","Biscuits","bag","names"};
		int count=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].endsWith("s")) {
				count++;
			
		
				System.out.println(words[i]+count);
				
			}
		}	
		
	}

}
