package dataType;

public class UseWatch {
	public static void main(String args[]) {
	Watch watch1=new Watch();
	watch1.brand= "fasttrack";
	watch1.price=2000;
	watch1.color="blue";
	watch1.taxper = 5.30f;
	watch1.disper = 3.70f;
watch1.netprice = watch1.price+(watch1.price*watch1.taxper/100)-(watch1.price*watch1.disper/100);
	
	
	System.out.println("Netprice="+watch1.netprice+"taxamount="+watch1.taxamount+"Disamount="+watch1.disamount);
		
	}

}
