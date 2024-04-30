package com.si.cse;

public class GetSetMain {

	public static void main(String[] args) {
		GetSetArea gsa=new GetSetArea();
		System.out.println("getting the values before using setters");
		System.out.println("Description  :"+gsa.getDescription());
		System.out.println("length :"+gsa.getWid());
		System.out.println("width :"+gsa.getLen());
		System.out.println("Area of rectangle is: "+gsa.Area(gsa.getLen(), gsa.getWid()));
		System.out.println("---------------------------------------------------");
        System.out.println("setting the values for variables");
        System.out.println("---------------------------------------------------");
		gsa.setLen(25);
		gsa.setWid(4);
		gsa.setDescription("Accessing private members len ,wid and description with the help of setters and Getters");
		System.out.println("getting the values after  using setters");
		System.out.println("Description  :"+gsa.getDescription());
		System.out.println("length :"+gsa.getWid());
		System.out.println("width :"+gsa.getLen());
		System.out.println("Area of rectangle is: "+gsa.Area(gsa.getLen(), gsa.getWid()));

		// TODO Auto-generated method stub

	}

}
