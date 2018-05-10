/* * Change the String inputFileName according the input file name* */
public class Main {

	public static void main(String[] args) {
		String inputFileName = "medium_input.txt";
		//String inputFileName = args[0];
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
		
	    //Give the End Coordinates
		mazeSolver.getMazeMatrix()[endRow][endColumn] = 'E';
		//Give The Start Coordinates
		mazeSolver.findWayFrom(startRow, startColumn);
		
		//Write Out the result to The Console
		mazeSolver.writeToConsole();
		
		

	}

}
