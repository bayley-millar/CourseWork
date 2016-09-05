/*
 * Box support class
 * Lab 7 COMP160 2014
 * Calculates the volume and surface area of a box given its height, length and width.
 * Bayley Millar
 */

public class Box{
  
  //data field declarations
  private int height;
  private int length;
  private int width;
  
  /**sets the value of the data field height to input parameter value*/
  public void setHeight(int h){
    height = h;
  }
  
  /**sets the value of the data field length to input parameter value*/
  public void setLength(int l){
    length = l;
  }
  
  /**sets the value of the data field width to input parameter value*/
  public void setWidth(int w){
    width = w;
  }
  
  /**returns the value of the surface area */
  public int getSurfaceArea(){
    return ((length * height * 2)+(length * width * 2)+(width * height * 2));
  }
  
  /**returns the value of the volume */
  public int getVolume(){
    return (width * height * length);
  }
  
  /**returns a string describing height, length, width, surface area and volume  */
  public String toString(){
    return ("Height is:" + height + " , length is:" + length+ " , Width is:" + width + " , Volume is:" + getVolume() + " , Surface Area:" + getSurfaceArea());
  }
  
    /**Construtor class for height, width and length.*/
  public Box(int h, int w, int l){
    height = h;
    length = l;
    width = w;
    
  }
  
  public Box(){}
  
  public Box(int n){
    height = n;
    length = n;
    width = n;
  }
  
  

}
      
   
     
  
  
      