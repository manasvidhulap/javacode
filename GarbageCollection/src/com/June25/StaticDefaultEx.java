package com.June25;

interface ProductInterface
{
	void productDisplay();
	default String ProductName()
	{
		return "Speaker";
	}
	static int ProductPrice()
	{
		return 2000;
	}
}
class Product implements ProductInterface{

	@Override
	public void productDisplay() {
		System.out.println("Product Display");
	}
	
}

public class StaticDefaultEx {

	public static void main(String[] args) {
		Product p = new Product();
		p.productDisplay();
		System.out.println(p.ProductName());
		Product p1 = new Product();
		p1.productDisplay();
		System.out.println(ProductInterface.ProductPrice());
	}

}
