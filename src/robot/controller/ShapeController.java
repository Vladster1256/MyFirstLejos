package robot.controller;

import robot.model.DrawingRobot;


public class ShapeController
{
	DrawingRobot myRobot;
	
	public ShapeController()
	{
		myRobot = new DrawingRobot();
	}

	public void start()
	{
		drawCircle();
		drawSquare();
		endProgram();
	}
	
	public void drawCircle()
	{
		myRobot.drawShape(1,0);
	}
	
	public void drawSquare()
	{
		myRobot.drawShape(4, 2);
	}
	public void endProgram()
	{
		System.out.println("I Haz Drawn Shapes, good day :)");
		
	}
}
