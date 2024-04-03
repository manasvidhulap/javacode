package com.factory;
class BOI implements plan{

	@Override
	public void getroi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Intreset for BOI :"+rate+"%");
	}
	
}
class SBI implements plan{

	@Override
	public void getroi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Intreset for SBI :"+rate+"%");
	}
	
}
class BOB implements plan{

	@Override
	public void getroi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of Intreset for BOB :"+rate+"%");	
		}
}
public class Test1 {

	public static void main(String[] args) {
		BOI b1=new BOI();
		
		b1.getroi(8.2);
		
		SBI s1=new SBI();
		
		s1.getroi(7.2);
		
		BOB b2=new BOB();
		
		b2.getroi(6.2);

	}

}

