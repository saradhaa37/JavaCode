package Practice;

import java.util.Arrays;

public class FindingMinMaxValues 
{
	static int maxVal;
	public static int findMin(Integer[] arrayEx)
	{
		int minVal = arrayEx[0];
		for(int i =1;i<arrayEx.length; i++)
		{
			if(!(minVal<arrayEx[i]))
				minVal=arrayEx[i];
		}
		return minVal;
	}
	
	public static int findMax(Integer[] arrayEx)
	{
		maxVal = arrayEx[0];
		for(int i =1;i<arrayEx.length; i++)
		{
			if(maxVal<arrayEx[i])
				maxVal=arrayEx[i];
		}
		return maxVal;
	}
	public static void main(String args[])
	{
		Integer[] intArray= {1,423,6,46,34,23,13,53,4};
		
		System.out.println(findMin(intArray));
		System.out.println(findMax(intArray));
		
		//Using in-built functions
		Arrays.sort(intArray);
		System.out.println("Minimun Value "+intArray[0]+"\nMaximum value "+intArray[intArray.length-1]);
		
	}	
	
	
}
