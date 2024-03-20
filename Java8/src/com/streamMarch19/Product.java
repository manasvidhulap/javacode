package com.streamMarch19;
public class Product 
{
	private int pid;
	private String pname;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprize=" + pprize + ", qty=" + qty + "]";
	}
	public Product(int pid, String pname, int pprize, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprize = pprize;
		this.qty = qty;
	}
	private int pprize;
	private int qty;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprize() {
		return pprize;
	}
	public void setPprize(int pprize) {
		this.pprize = pprize;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
