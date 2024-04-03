package com.March20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Menu{
	private int prise;
	private String menuItem;
	public String getMenuItem() {
		return menuItem;
	}
	public Menu(int prise, String menuItem) {
		super();
		this.prise = prise;
		this.menuItem = menuItem;
	}
	public Integer getPrise() {
		return prise;
	}
}
class M{
	
	 static int comparemenubyprise(Menu m1,Menu m2) {
		return m1.getPrise().compareTo(m2.getPrise());
	}
}
public class HotelM {

	public static void main(String[] args) {
		List<Menu>m=new ArrayList<>();
		m.add(new Menu(200,"veg cutlet"));
		m.add(new  Menu(400,"hara bhara kabab"));
		m.add(new Menu(100,"veg handi"));
		
	Collections.sort(m,M::comparemenubyprise);
	
	m.stream().map(x->x.getPrise()).forEach(System.out::println);

	}	
	}
