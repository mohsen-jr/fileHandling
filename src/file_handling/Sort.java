/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_handling;
import java.util.Comparator;

/**
 *
 * @author mahmo
 */
public class Sort implements Comparator<Pyramid> {

    @Override
    public int compare(Pyramid p1, Pyramid p2) {
        return (int)(p2.getHeight() - p1.getHeight());
    }
    
    
}
