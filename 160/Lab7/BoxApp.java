/*
 * BoxApp
 * Lab 7 COMP160 2014
 * Create instances of Box using the constructor methods of Box
 * Bayley Millar
 */

public class BoxApp{
  
  /**BoxApp main class*/
  public static void main(String [] args){
    Box box1 = new Box();
    box1.setHeight(4);
    box1.setWidth(6);
    box1.setLength(4);
    System.out.println(box1.toString());
    
    Box box2 = new Box(3, 4, 5);
    System.out.println(box2.toString());
    
    Box box3 = new Box(5);
    System.out.println(box3.toString());
    
    
    
  }
  
  

  
}
    

    
    
  
  
  

  
  
  
  