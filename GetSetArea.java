package com.si.cse;

public class GetSetArea {
	private int len=20;
	private int wid=4;
	private  String description="default description before using setters";
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int Area(int len,int wid)
	{
		return len*wid;
	}

}
