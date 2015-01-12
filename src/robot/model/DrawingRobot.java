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

		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		Motor.B.rotate(angle * 2);
		Motor.A.rotate(-angle * 2);
		System.out.println("Turning Right");
	}

	public void driveBackward()
	{
		Motor.A.backward();
		Motor.B.backward();
		System.out.println("Going Backwards");
	}

	public void stopRobot()
	{
		Motor.A.stop();
		Motor.B.stop();
		System.out.println("Stopping");
	}

	public void delayRobot(int multiplyer)
	{
		Delay.msDelay(1000 * multiplyer);
		System.out.println("Delaying");
	}

	public void driveForward()
	{
		Motor.A.forward();
		Motor.B.forward();
		System.out.println("Going Forward");
	}

	public void turnLeft()
	{
		Motor.A.rotate(angle * 2);
		Motor.B.rotate(-angle * 2);
		System.out.println("turning left");
	}

	public void spinRightFast()
	{
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		Motor.A.forward();
		Motor.B.backward();
	}

	public void stop()
	{
		Motor.A.stop();
		Motor.B.stop();
		Motor.C.stop();
	}

	public void setMotorSpeed(String whichMotor, int speed)
	{
		whichMotor = "";
		if (whichMotor.equals("A"))
		{
			Motor.A.setSpeed(speed);
		}
		else if (whichMotor.equals("B"))
		{
			Motor.B.setSpeed(speed);
		}
		else if (whichMotor.equals("C"))
		{
			Motor.C.setSpeed(speed);
		}
	}

	public void drawCircle()
	{
		System.out.println("Drawing Circle");
		sidesDrawn = 0;
		// Draw Circle
		setMotorSpeed("A", 360);
		setMotorSpeed("B", 10);
		driveForward();
		delayRobot(5);
		sidesDrawn ++;
		System.out.println("Drawn " + sidesDrawn + " side(s)");
	}

	public void drawSquare()
	{
		System.out.println("Drawing Square");
		angle = 90;
		setMotorSpeed("A", 360);
		setMotorSpeed("B", 360);
		sidesDrawn = 0;
		// Draw Square
		for (int sidesDrawn = 0; sidesDrawn < 4; sidesDrawn++)
		{

			driveForward();
			delayRobot(1);
			turnRight();
			delayRobot(1);
			System.out.println("Drawn " + sidesDrawn + " side(s)");

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
		for (int sidesDrawn = 0; sidesDrawn < 3; sidesDrawn++)
		{
			driveForward();
			delayRobot(1);
			turnRight();
			delayRobot(1);
			System.out.println("Drawn " + sidesDrawn + " side(s)");
		}
	}

	public void drawHexagon()
	{
		System.out.println("Drawning Hexagon");
		angle = 60;
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(60);
		sidesDrawn = 0;
		for (int sidesDrawn = 0; sidesDrawn < 6; sidesDrawn++)
		{
			driveForward();
			delayRobot(1);
			turnRight();
			delayRobot(1);
			System.out.println("Drawn " + sidesDrawn + " side(s)");
		}
	}

	public void drawOctagon()
	{
		System.out.println("Drawning Octagon");
		angle = 45;
		Motor.A.setSpeed(60);
		Motor.B.setSpeed(60);
		sidesDrawn = 0;
		for (int sidesDrawn = 0; sidesDrawn < 8; sidesDrawn++)
		{
			driveForward();
			delayRobot(1);
			turnRight();
			delayRobot(1);
			System.out.println("Drawn " + sidesDrawn + " side(s)");
		}
	}
}
