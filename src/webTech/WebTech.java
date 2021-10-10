package webTech;

public class WebTech {

	private static float task1(float x, float y)
	{
		float sub1 = (float)(1.0f + Math.sin(x + y) * Math.sin(x + y));
		float sub2 = 2.0f + Math.abs(x - 2.0f * x / (1.0f + x * x * y * y));
		
		return x + sub1 / sub2;
	}
	
	private static boolean task2(int x, int y)
	{
		int xAbs = Math.abs(x);
		
		if (y <= 0 && y >= -3 && xAbs <= 6)
		{
			return true;
		}
		
		if (y >= 0 && y <= 5 && xAbs <= 4)
		{
			return true;
		}
			
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(task2(6, -4));
		
	}

}
