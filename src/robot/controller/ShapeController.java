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
		{
			drawCircle();
			drawSquare();
			drawTriangle();
			drawHexagon();
			drawOctagon();
			completedShapes();
			endProgram();
		}
	}

	public void drawCircle()
	{
		myRobot.drawCircle();
	}

	public void drawSquare()
	{
		myRobot.drawSquare();
	}

	public void drawTriangle()
	{
		myRobot.drawTriangle();
	}

	public void drawHexagon()
	{
		myRobot.drawHexagon();
	}

	public void drawOctagon()
	{
		myRobot.drawOctagon();
	}

	public void completedShapes()
	{
		myRobot.spinRightFast();
	}

	public void endProgram()
	{
		myRobot.stop();
		System.out.println("I Haz Drawn Shapes, good day :)");

	}
}
