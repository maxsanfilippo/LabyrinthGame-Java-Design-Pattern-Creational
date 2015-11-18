package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

public class LabyrinthBuilder
{
	private int width;


	private int height;

	private Position exitPosition;

	private Set<Position> forbiddenCellsPositions;

	public LabyrinthBuilder()
	{
		this.width = 0;
		this.height = 0;
		this.exitPosition = null;
		this.forbiddenCellsPositions =new HashSet<Position>() ;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setexitPosition(Position exitposition)
	{
		this.exitPosition = exitposition;
	}
	
	public void setforbiddenCellPosition(Position position)
	{
		this.forbiddenCellsPositions.add(position);
	}

	public Labyrinth getLabyrinth()
	{
		return new Labyrinth(height, width, forbiddenCellsPositions, exitPosition);
	}
	
}