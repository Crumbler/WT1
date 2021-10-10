package task3;

public class Task3 {
	private static float[][] doTask(float a, float b, float h)
	{
		int rowCount = (int)Math.floor((b - a) / h);
		
		float[][] M = new float[rowCount][];
		
		for (int i = 0; i < rowCount; ++i)
		{
			M[i] = new float[2];
			
			float x = a + h * (i + 1);
			
			M[i][0] = x;
			M[i][1] = (float)Math.tan(x);
		}
		
		return M;
	}
	
	public static void test()
	{
		float[][] M = doTask(1.0f, 3.0f, 0.5f);
		
		for (int i = 0; i < M.length; ++i)
		{
			System.out.printf("%.2f %.2f\n", M[i][0], M[i][1]);
		}
	}
}
