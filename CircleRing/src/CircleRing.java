
import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot circle = new Robot();

		// 2. Set your robot’s position to x=150 and y=200
		circle.setX(150);
		circle.setY(200);

		// 3. Put the robot's pen down
		circle.penDown();
		// 4. Set the robot’s speed to 10
		circle.setSpeed(10);
		// 5. Do everything below here 360 times (use i as the counter)
		for (int i = 0; i < 360; i++) {
			// 6. Move the robot 3 pixels
			circle.move(3);
			// 7. Turn the robot 1 degree
			circle.turn(1);
			// 8. If the counter i is divisible by 20 (hint: use mod operator %)
			if (i % 20 == 0) {
				for (int j = 0; j < args.length; j++) {
					// 9. Do steps 10 thru 12, 360 times (use j as the counter)

					// 10. Move the robot 1 pixel
					circle.move(1);
					// 11. Turn the robot 1 degree
					circle.turn(1);
				}
			}
		}
	}
}
