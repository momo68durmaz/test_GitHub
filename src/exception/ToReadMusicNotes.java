package exception;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ToReadMusicNotes {

	public static void main(String[] args) {
		
		String filePath = "file.txt";

        try {
        		Scanner scanner = new Scanner(Paths.get(filePath));
            while (scanner.hasNextLine()) {

            } 	
        }catch(IOException e) {
        	System.out.println("");
        }

	}
}