package dataType;

public class UseMarker {
	public static void main(String args[]) {
	Marker m1= new Marker();
		m1.color = "black";
		m1.size = 2.5f;
		m1.brand = "fabric";
		m1.isrefillable = true;
		
		Marker m2= new Marker();
		m2.color = "blue";
		m2.size = 1.5f;
		m2.brand = "camlin";
		m2.isrefillable = false;
		
		System.out.println("color="+m1.color+"size="+m1.size+"brand="+m1.brand+"refillable="+m1.isrefillable);
		System.out.println("color="+m2.color+"size="+m2.size+"brand="+m2.brand+"refillable="+m1.isrefillable);
		
	}

}
