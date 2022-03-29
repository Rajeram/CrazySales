package org.test;

public class ArrayExample {

	public static void main(String[] args) {

		
//		String s[]=new String[5];
		
		//we can also declare as below
		String s[]={"India","Japan","France","England","Spain","Belgium"};
//		
//		s[0]="India";
//		s[1]="Japan";
//		s[2]="France";
//		s[3]="England";
//		s[4]="Spain";
		
		System.out.println(s[5]);
		
		
		System.out.println(s.length);
		
		System.out.println("***********************");
	
		//Normal For loop
	for (int i = 0; i < s.length; i++) {
		
		System.out.println(s[i]);
		
	}
	
	System.out.println("***********************");
	//Enhanced for Loop
	for (String x : s) {
		
		System.out.println(x);
	}
	

	
	}

}

