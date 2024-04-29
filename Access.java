package com.si.cse;
public class Access{
	int a=10;
	static String b="ram";
	void display() {
		System.out.println("Accessing instance method ");
		
	}
	static void show()
	{
		System.out.println("Accessing static method ");
		
	}
	

	public static void main(String[] args) {
		Access a1=new Access();
		System.out.println("Accessing instance variable:"+a1.a);
		System.out.println("Accessing static  variable:"+Access.b);
		a1.display();
		Access.show();
		
		
		
		// TODO Auto-generated method stub

	}

}
