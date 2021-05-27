/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_handling;
import java.util.List;
/**
 *
 * @author mahmoud_mohsen
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidFromCSV("D:\\Ai_pro\\java\\pyramids.csv");
        
        // printing all the pyramids read from CSV file
        int i=0;
        for(Pyramid p:pyramids)
        {
            System.out.println("#"+(i++)+p);
        }    
    }
    
}
