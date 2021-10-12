package task5;

public class Task5 {
	private static int getMinCount(int[] A)
	{
		int count = 0;
		int base = A[0];
		
		for (int i = 1; i < A.length; ++i)
		{
			if (base >= A[i])
			{
				++count;
			}
			else
			{
				base = A[i];
			}
		}
		
		return count;
	}
	
	public static void test()
	{
		System.out.println(getMinCount(new int[] { 1, 2, 2, 2, 3, 2}));
	}
}
