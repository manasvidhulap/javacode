package com.eb.pojo;

public class bank 
{
	private long accno;
	private  String accholdername;
	private  String address;
	private long contactno;
	private long balance;
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bank(long accno, String accholdername, String address, long contactno, long balance) {
		super();
		this.accno = accno;
		this.accholdername = accholdername;
		this.address = address;
		this.contactno = contactno;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "bank [accno=" + accno + ", accholdername=" + accholdername + ", address=" + address + ", contactno="
				+ contactno + ", balance=" + balance + "]";
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
