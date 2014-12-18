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
					Motor.A.setSpeed(2);
					Motor.B.setSpeed(9);
					Motor.B.forward();
					Delay.msDelay(10000);				
				}
				
				if(angle == 90)
				{
					// Draw Square]
					
						Motor.A.setSpeed(9);
						Motor.B.setSpeed(9);
						Motor.A.forward();
						Motor.B.forward();
						Delay.msDelay(3000);
						Motor.A.backward();
						Motor.B.forward();
						Delay.msDelay(1000);
						sidesDrawn++;
						Motor.A.setSpeed(9);
						Motor.B.setSpeed(9);
						Motor.A.forward();
						Motor.B.forward();
						Delay.msDelay(3000);
						Motor.A.backward();
						Motor.B.forward();
						Delay.msDelay(1000);
						sidesDrawn++;Motor.A.setSpeed(9);
						Motor.B.setSpeed(9);
						Motor.A.forward();
						Motor.B.forward();
						Delay.msDelay(3000);
						Motor.A.backward();
						Motor.B.forward();
						Delay.msDelay(1000);
						sidesDrawn++;Motor.A.setSpeed(9);
						Motor.B.setSpeed(9);
						Motor.A.forward();
						Motor.B.forward();
						Delay.msDelay(3000);
						Motor.A.backward();
						Motor.B.forward();
						Delay.msDelay(1000);
						sidesDrawn++;
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
}
