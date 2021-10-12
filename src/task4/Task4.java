package task4;

import java.util.*;

public class Task4 {
	private static boolean isPrime(int x)
	{
		if (x <= 1)
		{
			return false;
		}
		
		int root = (int)Math.floor(Math.sqrt(x));
		
		for (int i = root; i >= 2; --i)
		{
			if (x % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static List<Integer> getPrimeIndices(int[] arr)
	{
		List<Integer> indices = new ArrayList<>();
		
		for (int i = 0; i < arr.length; ++i)
		{
			if (isPrime(arr[i]))
			{
				indices.add(i);
			}
		}
		
		return indices;
	}
	
	public static void test()
	{
		List<Integer> indices = getPrimeIndices(new int[]{ 1, 2, 3, 4, 5});
		
		for (int x : indices)
		{
			System.out.println(x);
		}
	}
}
