package june13;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args)
	{
//		<String> hs=new TreeSet<>();
        //No duplicates
        //Treeset-->outcome-->sorting->A to Z
        //A=65,a=97
        //HashSet
        TreeSet<String> hs=new TreeSet<>();
        hs.add("Rutika");
        hs.add("Pragati");
        hs.add("ayenshawari");
        hs.add("Lekha");
        hs.add("Zeba");
        hs.add("Pragati");
        hs.add("Lekha");
        hs.add("Anand");
        hs.add("xy");
    //    hs.add(null);
        System.out.println("Tree hashcode:"+hs.hashCode());
        System.out.println("Tree set:"+hs);
        System.out.println("**Using Enhanced for loop***");
        for(String i:hs) {
            System.out.println(i);
        }
        System.out.println("**Using Iterator*****");
        Iterator<String> i = hs.iterator();
        while(i.hasNext()) 
            System.out.println(i.next());
        System.out.println("**Using decreding Iterator*****");
        Iterator<String> i1 = hs.descendingIterator();
        while(i1.hasNext()) 
            System.out.println(i1.next());
	}

}
