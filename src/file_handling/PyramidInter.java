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
public interface PyramidInter {
    public List<Pyramid> readPyramidFromCSV(String fileName);
    public Pyramid createPyramid(String[] metadata);
}
