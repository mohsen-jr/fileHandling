/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_handling;
import java.util.List;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
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
        List<Pyramid> pyramids = pDAO.readPyramidFromCSV("E:\\Ai_pro\\java\\pyramids.csv");
        
        // sort pyramids list according to height
        Collections.sort(pyramids, new Sort());
        // printing all the pyramids read from CSV file
        int i=0;
        for(Pyramid p:pyramids)
        {
            System.out.println("pyramid# " + (i++) +" "+ p);
           
        }
        Map<String, Integer> numOfsites = new LinkedHashMap<>();
        for (Pyramid p : pyramids){
            String site = p.getSite();
            Integer count = numOfsites.get(site);
            if(count == null)
            {
                count = 1;
            }
            else{
                count++;
            }
            numOfsites.put(site, count);
        }
        System.out.println("\n"+ numOfsites);
        
    }
   
    
}
