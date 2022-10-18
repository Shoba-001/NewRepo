package lms;

public class Sample2 {
	public static void main(String args[]) {
		String[]words=args[0].split(",");
		int numa1=Integer.parseInt(words[0]);
		int numa2=Integer.parseInt(words[1]);
		String[]words1=args[1].split(",");
		int numb1=Integer.parseInt(words1[0]);
		int numb2=Integer.parseInt(words1[1]);
		int oup1=numa1+numb2;
		int oup2=numa2+numb1;
		int multiply=oup1*oup2;
		System.out.println("Add1="+oup1+"Add2="+oup2+"multiply="+multiply);
		
	}

}
