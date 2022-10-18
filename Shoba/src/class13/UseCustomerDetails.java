package class13;

import java.util.HashMap;


public class UseCustomerDetails {
	public static void main(String[] args) {
		
				CustomerDetails s1=new CustomerDetails("Shoba",25,"jakkulashoba@gmail.com",5000,59966896);
				CustomerDetails s2=new CustomerDetails("S",26,"jakkula@gmail.com",59000,59966226);
				CustomerDetails s3=new CustomerDetails("Sh",24,"shoba@gmail.com",53000,59966811);
				CustomerDetails s4=new CustomerDetails("Sho",26,"jakklasa@gmail.com",4000,59956896);
				CustomerDetails s5=new CustomerDetails("Shob",25,"ooba@gmail.com",55000,59966236);
	
HashMap<Integer,CustomerDetails> hm=new HashMap<>();    
				
	hm.put(25,s1);
	hm.put(26,s2);
	hm.put(24,s3);
	hm.put(26,s4);
	hm.put(25,s5);
	for(CustomerDetails i : hm.values()) {
				System.out.println(i);
		}
	for(Integer i:hm.keySet()) {
		System.out.println(i);
	}
	}
	
	}

