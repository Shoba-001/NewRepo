package class7;

public class UseWatch {
	public static void main(String args[]) {
		Watch w1=new Watch();
		w1.brand="Shoba";
		w1.color="white";
		w1.price=20;
		w1.iswaterproof =true;
		
		Watch w2=new Watch();
		w2.brand="Revault";
		w2.color="Black";
		w2.price=30;
		w2.iswaterproof =false;
		
		Watch w3=new Watch();
		w3.brand="Cello";
		w3.color="Red";
		w3.price=40;
		w3.iswaterproof =true;
		
		Watch w4=new Watch();
		w4.brand="Faster";
		w4.color="Blue";
		w4.price=50;
		w4.iswaterproof =true;
		
		Watch w5=new Watch();
		w5.brand="Fasttrack";
		w5.color="Green";
		w5.price=25;
		w5.iswaterproof =true;
		
		Watch w6=new Watch();
		w6.brand="Timex";
		w6.color="Violet";
		w6.price=45;
		w6.iswaterproof =false;
		
		Watch[] watches= {w1,w2,w3,w4,w5,w6};
		String b=" ";
		
		for(Watch w: watches) {
			if(w.color=="Green") {
				w.color=b;
			}
				System.out.println(w.color);
			}
}
}
