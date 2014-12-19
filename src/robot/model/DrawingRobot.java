package robot.model;

import lejos.nxt.Motor;
import lejos.util.Delay;

public class DrawingRobot

{
	public DrawingRobot()
	{
		
	}

	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		int sidesDrawn = 0;

		for (int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				
				if (angle == 360)
				{
					// Draw Circle
					Motor.A.setSpeed(60);
					Motor.B.setSpeed(360);
					Motor.B.forward();
					Delay.msDelay(10000);				
				}
				
				if(angle == 90)
				{
					Motor.A.setSpeed(360);
					Motor.B.setSpeed(360);
					sidesDrawn = 0;
					// Draw Square
					for(drawCount = 0; sidesDrawn < 4; sidesDrawn++)
					{
						driveForward();
						Delay.msDelay(1000*length);
						turnRight();
						Delay.msDelay(1000*length);
					}
				}
				
				if(angle == 180)
				{
					Motor.A.setSpeed(360);
					Motor.B.setSpeed(360);
					sidesDrawn = 0;
					//Draw Triangle
					for(drawCount = 0; sidesDrawn < 3; sidesDrawn++)
					{
						driveForard();
						Delay.msDelay(1000*length);
						turnRight();
						Delay.msDelay(1500*length);
					}
				}
				
				if(angle == 60)
				{
					for(drawCount = 0; sidesDrawn < 6; sidesDrawn++)
					{
						driveForward();
						Delay.msDelay(1000*length);
						turnRight();
						Delay.msDelay(600*length);
					}
				}
				if(angle == 45)
				{
					for(drawCount = 0; sidesDrawn < 8; sidesDrawn++)
					{
						driveForward();
						Delay.msDelay(1000*length);
						turnRight();
						Delay.msDelay(500*length);
					}
				}
			
				else
				{
					Motor.A.stop();
					Motor.B.stop();
					Motor.C.stop();
					
					
				}
			} catch (Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}

	public int calculateAngle(int numberOfVertices)
	{
		int currentAngle = 0;

		if (numberOfVertices != 0)
		{
			currentAngle = (360 / numberOfVertices);
		}
		return currentAngle;
	}
	
	public void turnRight()
	{
		Motor.A.rotate(-angle);
		Motor.B.rotate(angle);
	}
	public void driveForward();
	{
		Motor.A.forward();
		Motor.B.forward();
	}
	public void driveBackward();
	{
		Motor.A.backward();
		Motor.B.backward();
	}
	public void turnLeft();
	{
		Motor.A.rotate(angle);
		Motor.B.rotate(-angle);
	}
	
	public void spinRightFast();
	{
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		Motor.A.foward();
		Motor.B.backward();
		Delay.msDelay(3000);
	}
}
