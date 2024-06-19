package BookShope;

import java.util.ArrayList;

public class BookApplication
{
   public static void main(String[] args) 
   {
	   ArrayList<Book> alist=new ArrayList<>();
	   Book b= new Book();
	   b.setBid(101);
	   b.setBname("Java");
	   b.setBprice(100);
	   alist.add(b);
	   System.out.println("My ArrayList is:"+alist);
	   
	   
	   Book b1= new Book(102 , "Python",200);
	   alist.add(b1);
	   System.out.println("My ArrayList is:"+alist);
	   
	   alist.remove(0);
	   System.out.println("My ArrayList is:"+alist);
	   
	   
	   
	   System.out.println("length of my arraylist:"+alist.size());
   }
}
