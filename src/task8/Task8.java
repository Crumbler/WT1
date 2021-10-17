package task8;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
	private static List<Integer> doTask(int[] A, int[] B)
	{
		List<Integer> indices = new ArrayList<>();
		
		for (int i = 1; i < A.length; ++i)
		{
			if (A[i - 1] == A[i])
			{
				indices.add(i);
			}
		}
		
		return indices;
	}
	
	public static void test()
	{
		int[] A = { 0, 0, 2, 2, 4}, B = { 1, 3 };
		
		List<Integer> indices = doTask(A, B);
		
		for (int num : indices)
		{
			System.out.printf("%d ", num);
		}
		
		System.out.println();
	}
}
