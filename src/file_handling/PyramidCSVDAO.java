/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList; 
import java.util.List;
/**
 *
 * @author mahmoud_mohsen
 */
public class PyramidCSVDAO implements PyramidInter {
    
    @Override
    public List<Pyramid> readPyramidFromCSV(String filePath){
        List<Pyramid> pyramids = new ArrayList<>();

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                pyramids.add(createPyramid(line.split(";")));
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return pyramids;
    }

    @Override
    public  Pyramid createPyramid(String[] metadata) {
        String pharaoh  = metadata[0];
        String modern_name = metadata[2];
        String site = metadata[4];
        double height = Double.parseDouble(metadata[7]);
        

        return new Pyramid(pharaoh, modern_name, site, height);
    }
    
    
}
