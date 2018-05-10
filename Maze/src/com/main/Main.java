package com.main;

import com.maze.InputsFromFile;
import com.maze.Maze;

public class Main {

	public static void main(String[] args) {
		String inputFileName = "test_input.txt";
		//String inputFileName = args[0];
		InputsFromFile inputsFromFile = new InputsFromFile();
		Maze maze = new Maze();
		//Set up the matrix input from the input file 
		char[][] mazeToSolve = inputsFromFile.convertMatrixToMaze(inputFileName);
		maze.setMazeMatrix(mazeToSolve);
		
		//Get The coordinates from the input file
		int[] coordinates = inputsFromFile.readCoordinates(inputFileName);
		int startColumn=coordinates[2];
	    int startRow=coordinates[3];
	    int endColumn=coordinates[4];
	    int endRow=coordinates[5];
		//Give The Start Coordinates
		maze.getMazeMatrix()[endRow][endColumn] = 'E';
		maze.getMazeMatrix()[startRow][startColumn] = 'S';
			
		int[] history=null;
		int pathLength=0;
		int[] returnedPath = 	maze.step(startRow, startColumn, history, pathLength);
		if (returnedPath[0] == 1) {
			for(int i=1; i<returnedPath[1]-1; i++) {
				int[] rowColumn = 	maze.convert1Dto2D(returnedPath[i+2], maze.getMazeMatrix()[0].length);
				maze.getMazeMatrix()[rowColumn[0]][rowColumn[1]]='x';
			}
			maze.printToConsole();
		} 
		else if(returnedPath[0]==0) {
			System.out.println("There is no solution!");
		}
		
			
	}

}
