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
		drawTriangle();
		drawHexagon();
		drawOctagon();
		completedShapes();
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
	
	public void drawTriangle()
	{
		myRobot.drawShape(3, 2);
	}
	
	public void drawHexagon()
	{
		myRobot.drawShape(6,3/2);
	}
	
	public void drawOctagon()
	{
		myRobot.drawShape(8,3/2);
	}
	
	public void completedShapes()
	{
		myRobot.spinRightFast();
	}
	public void endProgram()
	{
		System.out.println("I Haz Drawn Shapes, good day :)");
		
	}
}
