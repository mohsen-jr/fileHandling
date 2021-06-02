/****************
    @author mahmoud_mohsen
****************/
package file_handling;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File_handling {

    public static void main(String[] args) {
        
        try {
            
        FileWriter file = new FileWriter("D:\\Ai_pro\\java\\test.txt");
            try (BufferedWriter buffer = new BufferedWriter(file)) {
                InputStreamReader r = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(r);
                System.out.println("enter some text");
                String text = br.readLine();
                while(!text.equalsIgnoreCase("stop")){
                    buffer.write(text);
                    System.out.println("enter some text");
                    text = br.readLine();
                }   }
        } catch (IOException ex) {
            Logger.getLogger(File_handling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
