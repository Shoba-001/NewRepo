package class6;

public class FindCountOfUpperAndLower {
	public static void main(String args[]) {
		String[] words= {"SHOBA","MANU","shoba","manu"};
		int ucount=0;
		String temp="";
		for(int i=0;i<words.length;i++) {
			temp=words[i].toUpperCase();
			if(words[i].equals(temp)) {
		//	if(words[i].contains(words[i].toUpperCase())) {
				ucount++;
			}
			
			
		}
				System.out.println("Upper count="+ucount);
		
	}
		
	}


