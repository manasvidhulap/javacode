import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestJunitDemo6 
{
	@ParameterizedTest
		 //int[] org.junit.jupiter.params.provider.ValueSource.ints() : {}
	@ValueSource(strings = {"Atul","chetan","yukta","swati"})
	void display(String word) 
	{
		System.out.println(word);
	}
	@ParameterizedTest
		//int[] org.junit.jupiter.params.provider.ValueSource.ints() : {}
	@ValueSource(ints= {100,200,300,400})
	
	void display(int word) 
	{
		System.out.println(word);
	}
}
