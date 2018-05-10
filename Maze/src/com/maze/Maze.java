package com.maze;

public class Maze {
	
	/* public char[][] mazeMatrix = {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
			    {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', '#'},
				{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
				{'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
				{'#', ' ', ' ', ' ', '#', '#', ' ', ' ', ' ', '#'},
				{'#', '#', '#', ' ', '#', '#', ' ', ' ', ' ', '#'},
				{'#', ' ', ' ', ' ', '#', '#', ' ', '#', '#', '#'},
				{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
				{'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
				{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},};
*/
	 //The Input two dimension array	
	private char[][] mazeMatrix;
		
		//Return position in one integer, One dimensional indexing
		public int convert2Dto1D(int row, int column, int columnNumber) {
				return row*columnNumber + column;
		}
		
		public int[] convert1Dto2D(int row, int columnNumber) {
			int[] result = new int[2];
			//will be the column index
			result[1] = row%columnNumber;
			//will be the row index
			result[0] = row/columnNumber;
			return result;
		}
		
		
		public int[] step (int startRow, int startColumn, int[] history, int pathsLength) {
			int mazeColumnNumber = mazeMatrix[0].length;
			
			//Move directions
			int[] horziontalMove = {0, 0, -1, 1};
			int[] verticalMove = {-1, 1, 0, 0};
			//
			char wall = '#';
			char end = 'E';
			//First the result is an Array with one element
			int[] finalResult = new int[1];
			//If result[0]=0 there is no path to the End
			//If result[1]=1 that is a path
			finalResult[0]=0;
			
			for (int i=0; i<4; i++) {
				//Set up the first moves from the starting position
				int iColumnNumber = startRow+horziontalMove[i];
				int iRowNumber = startColumn+verticalMove[i];
				//If we hit the wall
				if(mazeMatrix[iColumnNumber][iRowNumber] == wall || iColumnNumber<0 || iRowNumber<0 || iColumnNumber >= mazeColumnNumber ) {					
				//Do Nothing
				}
				//If we reached the End
				else if (mazeMatrix[iColumnNumber][iRowNumber] == end) {
					finalResult = null;
					finalResult = new int[pathsLength+4];
					//Tells us We found the End
					finalResult[0] = 1;
					//Tells us the length of the found path
					finalResult[1] = pathsLength+2;
					//The found path
					for(int j=0; j<pathsLength; j++) {
						finalResult[j+2]=history[j];
					}
					finalResult[pathsLength+2] = convert2Dto1D(startRow, startColumn, mazeColumnNumber);
					finalResult[pathsLength+3] = convert2Dto1D(iColumnNumber, iRowNumber, mazeColumnNumber);}
			
				else {
					int[] partialHistory= new int[pathsLength+1];
					boolean isInHistory = false;
					for(int j=0; j<pathsLength; j++) {
						
						if(convert2Dto1D(iColumnNumber, iRowNumber, mazeColumnNumber)==history[j] ) {
							isInHistory = true;
						}
						partialHistory[j]=history[j];
					}
					partialHistory[pathsLength] = convert2Dto1D(startRow, startColumn, mazeColumnNumber);
					//If the path is not int the history
					if(!isInHistory) {
						int[] partialResult = step(iColumnNumber, iRowNumber, partialHistory, pathsLength+1);	
						//If partial result is a path 
						if(partialResult[0]==1) {
							//If is a path
							if(finalResult[0]==1) {
								//If the partial result path is shorter then the final result then it will be the final result
								if(partialResult[1]<finalResult[1]) {
									finalResult = null;
									finalResult = partialResult;
								}
							}
							else {
								finalResult = null;
								finalResult = partialResult;
							}
						}
					}
				}
				
			}
			
		return finalResult;	
			
		}
		
	public void printToConsole() {
		for(int i=0; i< mazeMatrix.length; i++) {
				for(int j=0; j<mazeMatrix[0].length; j++) {
					System.out.print(mazeMatrix[i][j]);
				}
				System.out.println();
			}
		}
	
	//Getters and setters for the maze matrix
			public char[][] getMazeMatrix() {
				return mazeMatrix;
			}
			public void setMazeMatrix(char[][] mazeMatrix) {
				this.mazeMatrix = mazeMatrix;
			}
			

}		
	
	 
	    





