package com.eb.pojo;

public class students 
{
	private int sid;
	private String sname;
	private String sphone;
	private String scity;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public students( String sname, String sphone, String scity) {
		super();
		
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "students [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
	}
	
	
}
