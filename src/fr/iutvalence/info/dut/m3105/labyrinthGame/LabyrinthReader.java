package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LabyrinthReader
{
	
	
	public static Labyrinth readLabyrinth(Reader reader)
	{

		
		BufferedReader boeufer = new BufferedReader(reader);
		
		
		LabyrinthBuilder builder = new LabyrinthBuilder();
		
		
		return builder.getLabyrinth();
	}
}
