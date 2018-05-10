/* * Change the String inputFileName according the input file name* */
public class Main {

	public static void main(String[] args) {
		String inputFileName = "test_input.txt";
		//String inputFileName = args[0];
		
		boolean showShortestPath = true;
		boolean showOnePath = false;
				
		InputsFromFile inputsFromFile = new InputsFromFile();
		FindTheWay mazeSolver = new FindTheWay();
		//Set up the matrix input from the input file 
		char[][] mazeToSolve = inputsFromFile.convertMatrixToMaze(inputFileName);
		mazeSolver.setMazeMatrix(mazeToSolve);
		
		//Get The coordinates from the input file
		int[] coordinates = inputsFromFile.readCoordinates(inputFileName);
		int startColumn=coordinates[2];
	    int startRow=coordinates[3];
	    int endColumn=coordinates[4];
	    int endRow=coordinates[5];
		//This is one Route
	    if(showOnePath == true) {
	    //Give the End Coordinates
		mazeSolver.getMazeMatrix()[endRow][endColumn] = 'E';
		//Give The Start Coordinates
		mazeSolver.findWayFrom(startRow, startColumn);
		//Write Out the result to The Console
		System.out.println("One route:");
		mazeSolver.writeToConsole();
		System.out.println();
		}
	    
		//This is the shortest route
		if(showShortestPath == true) {
		mazeSolver.getMazeMatrix()[endRow][endColumn] = 'E';
		mazeSolver.getMazeMatrix()[startRow][startColumn] = 'S';
			
		int[] history=null;
		int pathLength=0;
		int[] returnedPath = mazeSolver.step(startRow, startColumn, history, pathLength);
		if (returnedPath[0] == 1) {
			for(int i=1; i<returnedPath[1]-1; i++) {
				int[] rowColumn = 	mazeSolver.convert1Dto2D(returnedPath[i+2], mazeSolver.getMazeMatrix()[0].length);
				mazeSolver.getMazeMatrix()[rowColumn[0]][rowColumn[1]]='x';
			}
			 System.out.println("The shortest route:");
			mazeSolver.writeToConsole();
		} 
		else if(returnedPath[0]==0) {
			System.out.println("There is no solution!");
		}
	 }
	}

}
