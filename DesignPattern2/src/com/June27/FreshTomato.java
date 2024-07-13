package com.June27;
class FreshTomato extends ToppingDecorator
{
	Pizza pizza;
	public FreshTomato(Pizza pizza)
	{
		this.pizza=pizza;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+", Fresh Tomato ";
	}
	public int getCost() {
		return 40+pizza.getCost();
	}
	
}
