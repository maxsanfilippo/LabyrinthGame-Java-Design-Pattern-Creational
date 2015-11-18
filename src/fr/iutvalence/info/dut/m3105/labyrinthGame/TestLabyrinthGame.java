package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 */
	public static void main(String[] args)
	{
		
		
		LabyrinthBuilder builder = new LabyrinthBuilder();
		builder.setHeight(4);
		builder.setWidth(4);
		builder.setexitPosition(new Position(3,1));
		builder.setforbiddenCellPosition(new Position(2,0));
		builder.setforbiddenCellPosition(new Position(3,0));
		builder.setforbiddenCellPosition(new Position(0,1));
		builder.setforbiddenCellPosition(new Position(0,2));
		builder.setforbiddenCellPosition(new Position(1,2));
		builder.setforbiddenCellPosition(new Position(3,2));
		builder.setforbiddenCellPosition(new Position(3,3));
		
		new LabyrinthGame(builder.getLabyrinth(), RobotArtificialIntelligence.makeRAI(args[0]) ).play();
		
		
		//new LabyrinthGame(new Labyrinth(4, 4, blockPositions, new Position(3,1)), RobotArtificialIntelligence.makeRAI(args[0]) ).play();
	}
}
