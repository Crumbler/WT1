package task1;

public class Task1 {
	private static float doTask(float x, float y)
	{
		float sub1 = (float)(1.0f + Math.sin(x + y) * Math.sin(x + y));
		float sub2 = 2.0f + Math.abs(x - 2.0f * x / (1.0f + x * x * y * y));
		
		return x + sub1 / sub2;
	}
	
	public static void test()
	{
		System.out.println(doTask(1.0f, 3.0f));
		System.out.println(doTask(2.1f, -3.3f));
	}
}
