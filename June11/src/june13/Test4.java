package june13;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Doc", "Grumpy", "Happy", 
                "Sleepy", "Dopey", "Bashful", "Sneezy");
        
        System.out.println("List to Array example in Java 8:");
        
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
        
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));

	}

}
