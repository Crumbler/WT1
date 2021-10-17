package task6;

public class Task6 {
	private static int[][] generateMatrix(int[] A)
	{
		int N = A.length;
		
		int[][] M = new int[N][];
		
		for (int i = 0; i < N; ++i)
		{
			M[i] = new int[N];
			
			for (int j = 0; j < N; ++j)
			{
				M[i][j] = A[(i + j) % N];
			}
		}
		
		return M;
	}
	
	public static void test()
	{
		int[][] M = generateMatrix(new int[] {1, 2, 3, 4});
		
		for (int i = 0; i < M.length; ++i)
		{
			for (int j = 0; j < M[i].length; ++j)
			{
				System.out.printf("%d ", M[i][j]);
			}
			
			System.out.println();
		}
	}
}
