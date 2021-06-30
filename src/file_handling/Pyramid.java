/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_handling;

/**
 *
 * @author mahmoud_mohsen
 */
public class Pyramid {
    private String pharaoh;
    private String modern_name;
    private String site;
    private double height;
    
    public Pyramid(String pharaoh, String modern_name, String site, double height){
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }
    public String getPharaoh(){
        return this.pharaoh;
    }
    public String getModern_name(){
        return this.modern_name;
    }
    public String getSite(){
        return this.site;
    }
    public double getHeight(){
        return this.height;
    }
    public void setPharaoh(String pharaoh){
        this.pharaoh = pharaoh;
    }
    public void setModern_name(String modern_name){
        this.modern_name = modern_name;
    }
    public void setSite(String site){
        this.site = site;
    }
    public void setPharaoh(double height){
        this.height = height;
    }
    @Override
    public String toString(){
        String info = "pharaoh's name: " + this.pharaoh +", modern name: "+ this.modern_name +", site: "+ this.site +", height: "+ Double.toString(height);
        return info;
    }
    
}
