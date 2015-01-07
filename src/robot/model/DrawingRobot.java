package robot.model;

import robot.controller.DrivingController;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class DrawingRobot

{
	int angle = 0;
	int sidesDrawn = 0;
	DrivingController myDriving;

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
		
		Motor.A.setSpeed(10);
		Motor.B.setSpeed(360);
		Motor.B.rotate(angle*2);
		Motor.A.rotate(-angle*2);
		System.out.println("Turning Right");
		Delay.msDelay(1000);
		Motor.A.stop();
		Motor.B.stop();
		System.out.println("Stopping");
	}
	
	public void driveBackward()
	{
		Motor.A.backward();
		Motor.B.backward();
		Delay.msDelay(1000);
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void stopRobot()
	{
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void delayRobot()
	{
		Delay.msDelay(1000);
	}
	
	public void driveForward()
	{
		Motor.A.forward();
		Motor.B.forward();
		System.out.println("Going Forward");
		Delay.msDelay(1000);
		Motor.A.stop();
		Motor.B.stop();
		System.out.println("Stopping");
	}

	public void turnLeft()
	{
		Motor.A.rotate(angle*2);
		Motor.B.rotate(-angle*2);
		Delay.msDelay(1000);
		Motor.A.stop();
		Motor.B.stop();
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
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		Motor.B.forward();
		Delay.msDelay(5000);
	}

	public void drawSquare()
	{
		System.out.println("Drawing Square");
		angle = 90;
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		sidesDrawn = 0;
		// Draw Square
		for (int sidesDrawn = 0 ; sidesDrawn < 4; sidesDrawn++)
		{
			
			driveForward();
			turnRight();
			Motor.A.stop();
			Motor.B.stop();
			
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
	public void setAngle(int angle)
	{
		this.angle = angle;
	}
	public int getAngle()
	{
		return angle;
	}
}
