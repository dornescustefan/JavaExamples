package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileReadWrite {

	public static void fileReadWrite()  {
		FileWriter out = null;
		try {
			out = new FileWriter("text.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	    try {
	    	Random random = new Random();
	    	int r = random.nextInt(500);
	    	for(int i = 0; i < r; i++) {
			out.write("Id: " + i + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    FileReader in = null;
		try {
			in = new FileReader("text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    Scanner src = new Scanner(in);
	    while (src.hasNext()){
	    	System.out.println(src.next());
	    }
	    src.close();
	}
	
}
