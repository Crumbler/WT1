package task9;

import java.util.*;

public class Basket {
	ArrayList<Ball> balls;
	
	Basket()
	{
		balls = new ArrayList<Ball>();
	}
	
	public void addBall(Ball b)
	{
		balls.add(b);
	}
	
	public int getBlueCount()
	{
		int blueCount = 0;
		
		for (Ball b : balls)
		{
			if (b.getColor() == BallColor.Blue)
			{
				++blueCount;
			}
		}
		
		return blueCount;
	}
}
