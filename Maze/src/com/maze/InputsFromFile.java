package com.maze;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputsFromFile {
	//This two dimension array will be the input for the findTheWay method in the FindTheWay class
private  int[][] mazeMatrix;
    /*This function takes in a filename and 
     * reads the size of the matrix and start/end coordinates 
     * from the input file and returns them in an array as it follows:
     * result[0]=columnNumber;result[1]=columnNumber
     * result[2]=startColumn; result[3]=startRow
     * result[4]=endColumn; result[5]=endRow  
     * */	
    public  int[] readCoordinates(String fileName) {
		int[] result = new int[6];
		FileReader in = null;
		try {
			in = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Could not find input file with the name: " + fileName);
		}

	    Scanner src = new Scanner(in);
	    
	    for(int i=0; i<6; i++) {
	    	result[i] = src.nextInt();
	    }
	    int columnNumber = result[0];
	    int rowNumber = result[1];
	    
	    mazeMatrix = new int[rowNumber][columnNumber];
	    
	    //Load up Maze Matrix with 0's and 1's from file
	    	for(int i=0; i<rowNumber; i++) {
	    		for(int j=0; j<columnNumber; j++) {
	    			if(src.hasNextInt()) {
	    				mazeMatrix[i][j]=src.nextInt(); 
	    			}
	    		}
	    	}
	    src.close();
	    return result;
	}
	//This function converts the the the 2D array full with 0s and 1s into a maze
	public char[][] convertMatrixToMaze(String fileName){
				
		int[] mazeCoordinates=readCoordinates(fileName);
		int columnNumber = mazeCoordinates[0];
		int rowNumber = mazeCoordinates[1];
		char[][] maze = new char[rowNumber][columnNumber];
		
		for(int i=0; i<rowNumber; i++) {
    		for(int j=0; j<columnNumber; j++) {
    			if(mazeMatrix[i][j]==1) {
    				maze[i][j]='#';	
    			}
    			else {
    				maze[i][j]=' ';
    			}
    			 
    		}
    	}
		
		return maze;
	} 
}
