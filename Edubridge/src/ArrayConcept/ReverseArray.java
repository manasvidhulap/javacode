package ArrayConcept;

public class ReverseArray {

	public static void main(String[] args)
	{
		int arr[]=new int[] {10,20,30,40,50};
		System.out.println("Original array:");
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("\nReverse Array");
		for(int i = arr.length-1; i>=0 ; i--)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
