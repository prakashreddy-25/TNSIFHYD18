package com.si.cse;

public class Overload {

	public static void main(String[] args) {
		InstStatMethod ism =new InstStatMethod();
		//instance methods
		System.out.println("instance  wish method without arguments :"+ism.wish());
		System.out.println("instance  wish method with\"Prakash Reddy\" argument :"+ism.wish("Prakash Reddy"));
		//static methods
		System.out.println("static sum  method with  2 arguments :"+InstStatMethod.sum(5, 10));
		System.out.println("static sum  method with  3 arguments :"+InstStatMethod.sum(5, 10,20));
	}

}
