package com.June25;

import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpertionsDemo {
	 public static void main(String[] args) {
		 // Simulate a shopping cart with items
		 List<Item> shoppingCart = List.of(
		 new Item("Laptop", 1000.0),
		 new Item("Phone", 500.0),
		 new Item("Headphones", 100.0),
		 new Item("Tablet", 800.0),
		 new Item("Keyboard", 50.0),
		 new Item("Headphones", 100.0),
		 new Item("Tablet", 800.0),
		 new Item("Mouse",400)
		 );
		 System.out.println("Original Shopping Cart:");
		 shoppingCart.forEach(item -> System.out.println(item.getName() + " - $" +
		item.getPrice())); 
		 
		 List<Item> selectedItems = shoppingCart.stream()
				 .filter(item -> item.getPrice() > 100.0).collect(Collectors.toList());
		 
		 System.out.println("\nIntermediate Operations Result:");
		 selectedItems.forEach(System.out::println); 
		 System.out.println("******");
		 selectedItems.forEach(item -> System.out.println(item.getName() + " - $" +
					item.getPrice())); 
		 System.out.println("***Distinct Name***");
		   List<String> selectedItems1 = shoppingCart.stream() 
	                .filter(item -> item.getPrice() > 100.0)          // Filter expensive items 
	                .map(Item::getName)                                 // Get names of items 
	                .distinct(). collect(Collectors.toList());  
		   selectedItems1.forEach(System.out::println);
		   System.out.println("***Sorted  Name***");
		   List<String> selectedItems2 = shoppingCart.stream() 
	                .filter(item -> item.getPrice() > 100.0)          // Filter expensive items 
					.map(Item::getName)                          // Get names of items 
	                .distinct().sorted(). collect(Collectors.toList());  
		   selectedItems2.forEach(System.out::println);
		   System.out.println("***Limit***");
		   List<String> selectedItems3 = shoppingCart.stream() 
	                .filter(item -> item.getPrice() > 100.0)          // Filter expensive items 
	                .map(Item::getName)                                 // Get names of items 
	                .distinct().skip(1). collect(Collectors.toList());  
		   selectedItems3.forEach(System.out::println);


}
}