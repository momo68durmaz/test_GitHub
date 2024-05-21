package exception;

import java.time.LocalDateTime;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AktuellesDatum {
 
 
    public static void main(String[] args) throws Exception {
     
        String fileName = "aktuelles_datum_zeit.txt";
        try (PrintWriter writer = new PrintWriter(fileName)) {
        	LocalDateTime now = LocalDateTime.now();
        	writer.print(now);
        	
        } catch(FileNotFoundException e){
        	System.err.println("Datei konnte nicht geöffnet werden!");
        }
    }
}
