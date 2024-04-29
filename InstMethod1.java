package com.si.cse;

public class InstMethod1 {
	void method() {
		System.out.println("method implementation in parent class");
	}

}
 class InstMethod2 extends InstMethod1{
	 void method()
	 {
		 System.out.println("method implementation in child class");
	 }
 }
