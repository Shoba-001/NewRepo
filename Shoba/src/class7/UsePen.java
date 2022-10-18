package class7;

public class UsePen {
	public static void main(String args[]) {
		Pen p1=new Pen();
		p1.brand="Renaulce";
		p1.color="Blue";
		p1.price=10;
		p1.isballpen=true;
		
		Pen p2=new Pen();
		p2.brand="celloo";
		p2.color="Black";
		p2.price=20;
		p2.isballpen=false;
		
		Pen p3=new Pen();
		p3.brand="natraj";
		p3.color="Blue";
		p3.price=30;
		p3.isballpen=true;
		
		Pen p4=new Pen();
		p4.brand="cello";
		p4.color="Red";
		p4.price=25;
		p4.isballpen=true;
		
		Pen[] pens= {p1,p2,p3,p4};
		
		for(Pen p:pens) {
			if(p.brand.length()>4) {
			
			System.out.println(p.brand.substring(1,p.brand.length()-1));
		}
			else {
		System.out.println(p.brand.charAt(0)+p.brand.length()-1);
		}	
		}
}
}