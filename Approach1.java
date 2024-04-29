package com.si.cse;

public class Approach1 {
String batsMan="virat";
static String bowlwer   ="Bomra" ;
void display()
{
	System.out.println("class about ipl mataches");
}

static String display1()
{
	return "IPL matches";
			
}

	public static void main(String[] args) {
		String allrounder="shami";
		
		Approach1 a=new Approach1();
		System.out.println(a.batsMan);
		//System.out.println("hello");
		a.display();
		System.out.println(Approach1.bowlwer);
		System.out.println(Approach1.display1());
		System.out.println(allrounder);
		System.out.println("also we can call without refering class name also"+bowlwer);
		
		
		
		// TODO Auto-generated method stub

	}

}
