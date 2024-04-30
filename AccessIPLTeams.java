package com.si.cse;
import iplpack.MITeam;
import iplpack.RCBTeam;
import iplpack.SRHTeam;

public class AccessIPLTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SRHTeam srh=new SRHTeam();
		MITeam mi=new MITeam();
		RCBTeam rcb=new RCBTeam();
		//Accessing SRH team members
		System.out.println("Accesing SRHTeam class members");
		srh.bowling();
		srh.batting();
		srh.allround();
		System.out.println("Accesing MITeam class members");
		//Accessing MI  team members
			mi.bowling();
			mi.batting();
			mi.allround();
			System.out.println("Accesing RCBTeam class members");
		//Accessing RCB team members
				rcb.bowling();
				rcb.batting();
				rcb.allround();
		
		
	}

}
