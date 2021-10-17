package task7;

public class Task7 {
	public static void shellSort(int[] A)
	{
		int gap = A.length / 2;
		
		while (gap >= 1)
		{
			for (int i = gap; i < A.length; ++i)
			{
				int value = A[i];
				
				int j = i;
				while (j >= gap && A[j - gap] > value)
				{
					A[j] = A[j - gap];
					j -= gap;
				}
				
				A[j] = value;
			}
			
			gap /= 2;
		}
	}
	
	public static void test()
	{
		int[] A = { 5, 6, 7, 8, 3, 5 };
		
		for (int num : A)
		{
			System.out.printf("%d ", num);
		}
		
		System.out.println();
		
		shellSort(A);
		
		for (int num : A)
		{
			System.out.printf("%d ", num);
		}
		
		System.out.println();
	}
}
