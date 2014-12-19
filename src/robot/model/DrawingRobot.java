package robot.model;

import lejos.nxt.Motor;
import lejos.util.Delay;

public class DrawingRobot

{
	int angle = 0;
	int sidesDrawn = 0;

	public DrawingRobot()
	{

	}

	public int calculateAngle(int numberOfVertices)
	{
		int currentAngle = 0;

		if (numberOfVertices != 0)
		{
			currentAngle = (360 / numberOfVertices);
			angle = currentAngle;
		}
		return currentAngle;
	}

	public void turnRight()
	{
		Motor.B.forward();
	}

	public void driveForward()
	{
		Motor.A.backward();
		Motor.B.forward();
	}

	public void driveBackward()
	{
		Motor.A.forward();
		Motor.B.backward();
	}

	public void turnLeft()
	{
		Motor.A.forward();
	}

	public void spinRightFast()
	{
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		Motor.A.forward();
		Motor.B.backward();
		Delay.msDelay(3000);
	}

	public void stop()
	{
		Motor.A.stop();
		Motor.B.stop();
		Motor.C.stop();
	}

	public void drawCircle()
	{
		System.out.println("Drawning Cirlce");
		sidesDrawn = 0;
		// Draw Circle
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(360);
		Motor.B.forward();
		Delay.msDelay(5000);
	}

	public void drawSquare()
	{
		System.out.println("Drawning Square");
		angle = 90;
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(60);
		sidesDrawn = 0;
		// Draw Square
		for (; sidesDrawn < 4; sidesDrawn++)
		{
			driveForward();
			Delay.msDelay(1000 * 2);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
			turnRight();
			Delay.msDelay(500);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
		}
	}

	public void drawTriangle()
	{
		System.out.println("Drawning Triangle");
		angle = 180;
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(60);
		sidesDrawn = 0;
		// Draw Triangle
		for (; sidesDrawn < 3; sidesDrawn++)
		{
			driveForward();
			Delay.msDelay(1000 * 2);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
			turnRight();
			Delay.msDelay(500);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
		}
	}

	public void drawHexagon()
	{
		System.out.println("Drawning Hexagon");
		angle = 60;
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(60);
		sidesDrawn = 0;
		for (; sidesDrawn < 6; sidesDrawn++)
		{
			driveForward();
			Delay.msDelay(1000 * 3 / 2);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
			turnRight();
			Delay.msDelay(600);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
		}
	}

	public void drawOctagon()
	{
		System.out.println("Drawning Octagon");
		angle = 45;
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(60);
		sidesDrawn = 0;
		for (; sidesDrawn < 8; sidesDrawn++)
		{
			driveForward();
			Delay.msDelay(1000 * 3 / 2);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
			turnRight();
			Delay.msDelay(500);
			Motor.A.stop();
			Motor.B.stop();
			Delay.msDelay(1000);
		}
	}
}
