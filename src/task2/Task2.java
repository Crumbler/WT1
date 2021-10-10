package task2;

public class Task2 {
	private static boolean doTask(int x, int y)
	{
		int xAbs = Math.abs(x);
		
		if ((y <= 0) && (y >= -3) && (xAbs <= 6))
		{
			return true;
		}
		
		if ((y >= 0) && (y <= 5) && (xAbs <= 4))
		{
			return true;
		}
			
		return false;
	}
	
	public static void test()
	{
		System.out.println(doTask(3, 5));
		System.out.println(doTask(-1, 0));
		System.out.println(doTask(6, -3));
	}
}
