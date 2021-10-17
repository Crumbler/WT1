package task9;

enum BallColor { Red, Blue, Green };

public class Ball {
	private BallColor color;
	
	Ball(BallColor c)
	{
		this.color = c;
	}
	
	public BallColor getColor()
	{
		return this.color;
	}
}
