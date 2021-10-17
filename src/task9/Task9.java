package task9;

public class Task9 {
	public static void main(String[] args) {
		Basket basket = new Basket();
		
		basket.addBall(new Ball(BallColor.Red));
		basket.addBall(new Ball(BallColor.Green));
		basket.addBall(new Ball(BallColor.Blue));
		basket.addBall(new Ball(BallColor.Blue));
		
		int blueCount = basket.getBlueCount();
		
		System.out.println(blueCount);
	}

}
