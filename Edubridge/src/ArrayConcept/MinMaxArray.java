package ArrayConcept;

public class MinMaxArray 
{
	public static void main(String[] args) 
	{
		int[] array= {5,12,9,18,3,21,45,87,36,90,76,35,27,57,384,644};
		int max=array[0];
		int min=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Maximum valur of array:"+max);
		System.out.println("Minimum valur of array:"+min);
	}

}
