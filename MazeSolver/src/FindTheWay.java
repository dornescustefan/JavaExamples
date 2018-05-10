
public class FindTheWay {
	
	  //The Input two dimension array	
	  private char[][] mazeMatrix;
	    
		//The move function, defines what are the rules for the movements 
		public boolean move(int rowNumber, int columnNumber) {
			//Define  position move in the matrix
			//First we assume we don have a way to the end E 
			int goSouth = rowNumber+1;
			int goEast = columnNumber-1;
			int goWest = columnNumber+1;
			int goNorth = rowNumber-1;
			int axisEastWest= rowNumber;
			int axisNorthSouh= columnNumber;
			boolean way=false;	
			//Step 1->If we found E the we reached the end and the Recall ends
			if (mazeMatrix[rowNumber][columnNumber] == 'E')
				return true;
			//Step 2->Other wise In case we hit the wall=# or our way=x go back
			if (mazeMatrix[rowNumber][columnNumber] == '#' || mazeMatrix[rowNumber][columnNumber] == 'x')
				return false;
			//Step 3->The way where it goes is marked with x 
			mazeMatrix[rowNumber][columnNumber] = 'x';
			//Step 4->Try to Go to South
			way = move(goSouth, axisNorthSouh);
			if (way==true)return true;	
			//Step 5->Try to Go to East
			way = move(axisEastWest, goEast);
			if (way==true)return true;
			//Step 6->Try to Go to West
			way = move(axisEastWest, goWest);
			if (way==true)return true;
			//Step 7->Try to Go to North
			way = move(goNorth, axisNorthSouh);
			if (way==true) return true;
			//Step 8->No where to go, turn back, do not leave marked  way behind
			//Can make mazeMatrix[rowNumber][columnNumber] = 'D'; to see where it went
			mazeMatrix[rowNumber][columnNumber] = ' ';
			//Step 9->From here go back and try another way
			return false;
		}
		//The find way function, If there is no solution write out this
		public void findWayFrom(int startRowNumber, int startColumnNumber) {
			if (move(startRowNumber,startColumnNumber)==true) {
				mazeMatrix[startRowNumber][startColumnNumber] = 'S';
			}else {
				System.out.println("There is no solution!");
			}
		}
		//Write out the result to the console
		public void writeToConsole() {
			for (int i=0; i<mazeMatrix.length; i++) {
				for (int j=0; j<mazeMatrix[0].length; j++) {
					 System.out.print(mazeMatrix[i][j]);
				}
				System.out.println();
				
			}
		}
		
/*
 * Shortest way 
 * 
 * 
 * */		
				//Return position in one integer, One dimensional indexing
				public int convert2Dto1D(int r, int c, int columnNumber) {
						return r*columnNumber + c;
				}
				//Turn a number into two positions in an array 
				public int[] convert1Dto2D(int x, int columnNumber) {
					int[] result = new int[2];
					//will be the column index
					result[1] = x%columnNumber;
					//will be the row index
					result[0] = x/columnNumber;
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
						if(mazeMatrix[iColumnNumber][iRowNumber] == wall || iColumnNumber<0 || iRowNumber<0 || iColumnNumber >= mazeColumnNumber) {					
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
		
		//Getters and setters for the maze matrix
		public char[][] getMazeMatrix() {
			return mazeMatrix;
		}
		public void setMazeMatrix(char[][] mazeMatrix) {
			this.mazeMatrix = mazeMatrix;
		}
		

}
