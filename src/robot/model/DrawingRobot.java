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

	public void turnRight(int angle)
	{

		Motor.B.forward();
		Motor.A.backward();
		Delay.msDelay(angle/2);
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
		Motor.C.stop();
		System.out.println("Stopping");
	}

	public void delayRobot(double multiplyer)
	{
		Delay.msDelay((long) (1000 * multiplyer));
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
		delayRobot(5);
	}

	public void stop()
	{
		Motor.A.stop();
		Motor.B.stop();
		Motor.C.stop();
		System.out.println("Stopping");
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
		setMotorSpeed("A", 900);
		setMotorSpeed("B", 0);
		Motor.A.forward();
		delayRobot(5);
		sidesDrawn ++;
		System.out.println("Drawn " + sidesDrawn + " side(s)");
	}

	public void drawSquare()
	{
		System.out.println("Drawing Square");
		angle = 90;
		setMotorSpeed("A", 900);
		setMotorSpeed("B", 900);
		sidesDrawn = 0;
		// Draw Square
		for (int sidesDrawn = 0; sidesDrawn < 4; sidesDrawn++)
		{

			driveForward();
			delayRobot(2);
			turnRight(angle);
			delayRobot(0.55);
			System.out.println("Drawn " + sidesDrawn + " side(s)");

		}
	}

	public void drawTriangle()
	{
		System.out.println("Drawning Triangle");
		angle = 180;
		setMotorSpeed("A", 900);
		setMotorSpeed("B", 900);
		sidesDrawn = 0;
		// Draw Triangle
		for (int sidesDrawn = 0; sidesDrawn < 3; sidesDrawn++)
		{
			driveForward();
			delayRobot(2);
			turnRight(angle);
			delayRobot(0.70);
			System.out.println("Drawn " + sidesDrawn + " side(s)");
		}
	}

	public void drawHexagon()
	{
		System.out.println("Drawning Hexagon");
		angle = 60;
		setMotorSpeed("A", 900);
		setMotorSpeed("B", 900);
		sidesDrawn = 0;
		for (int sidesDrawn = 0; sidesDrawn < 6; sidesDrawn++)
		{
			driveForward();
			delayRobot(2);
			turnRight(angle);
			delayRobot(0.45);
			System.out.println("Drawn " + sidesDrawn + " side(s)");
		}
	}

	public void drawOctagon()
	{
		System.out.println("Drawning Octagon");
		angle = 45;
		setMotorSpeed("A", 900);
		setMotorSpeed("B", 900);
		sidesDrawn = 0;
		for (int sidesDrawn = 0; sidesDrawn < 8; sidesDrawn++)
		{
			driveForward();
			delayRobot(2);
			turnRight(angle);
			delayRobot(0.25);
			System.out.println("Drawn " + sidesDrawn + " side(s)");
		}
	}
	
}
