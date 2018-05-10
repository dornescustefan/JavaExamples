
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
		
		//Getters and setters for the maze matrix
		public char[][] getMazeMatrix() {
			return mazeMatrix;
		}
		public void setMazeMatrix(char[][] mazeMatrix) {
			this.mazeMatrix = mazeMatrix;
		}
		

}
