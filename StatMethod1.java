package com.si.cse;

public class StatMethod1 {
	static void method()
	{
		System.out.println("static method implementation in parent class");
	}

}
class StatMethod2 extends StatMethod1 {
	
	static void method()
	{
		System.out.println("static method implementation in child  class");
	}

}
