package com.inheritence;
class WildAnimal{
    public void Animal(String a) {
        System.out.println("One of the Wild Animal is:"+a);
    }
}
class Domestic extends WildAnimal{
    public void DocAnimal(String b) {
        System.out.println("One of the Domestic animal is:"+b);
    }
}
class HousePets extends Domestic{
    public void Pets(String c,String d) {
        System.out.println("Two pet animals are:"+ (c +" "+"and"+" " + d));
    }
}
public class Animals {

	public static void main(String[] args)
	{	
		 HousePets hs=new HousePets();
	        hs.Animal("Tiger");
	        hs.DocAnimal("Donkey");
	        hs.Pets("Dog", "cat");
	}

}
