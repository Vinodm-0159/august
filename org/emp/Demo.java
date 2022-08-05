package org.emp;

public class Demo {
	
	public Demo() {
   System.out.println("test");
	
	}


	public Demo(String s) {
		this();
		   System.out.println("string"+ s);
			
	}
	public static void main(String[] args) {
		Demo d = new Demo("test");
	}
}
