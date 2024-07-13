package june13;

import java.util.Hashtable;

public class Test 
{
	public static void main(String[] args) {
		
	
	Hashtable<String, String> hash_table = new Hashtable();//creating a hash table
    hash_table.put("mon", "Monday");
    hash_table.put("2", "Tuesday");
    hash_table.put("3", "Wednesday");
    hash_table.put("4", "Thursday");
    hash_table.put("5", "Friday");
    hash_table.put("6", "Saturday");
    hash_table.put("7", "Sunday");
    hash_table.put("8", "Sunday");
    hash_table.put("7", "Saturday");

    hash_table.putIfAbsent("9", "day");
   // hash_table.put("10", null);
    System.out.println(hash_table);
    //key value pair-->key  should be unique
    Hashtable<Integer, String> ht = new Hashtable();
    ht.put(1, "pink");
    ht.put(2, "Green");
    ht.put(2, "Grey");
    
    ht.putIfAbsent(2, "black");
    System.out.println(ht);
    System.out.println("Get: "+ht.get(1));
}
}
