/*
 * TriangleApp
 * Lab 8 COMP160 2014
 * Calculates the the perimeter of a Triangle
 * Bayley Millar
 */
import java.text.DecimalFormat;
import java.lang.Math;

public class TriangleApp{
  
  /**TriangleApp main class*/
  public static void main(String [] args){
    
    
    Triangle a = new Triangle(0, 3, 3, 4, 1, 9, "A");
    DecimalFormat f1 = new DecimalFormat();
    f1.setMaximumFractionDigits(2);
    System.out.println ("Triange "+ a.getName() + " Perimeter is " + f1.format(a.getPerimeter()) + " Units");
    
    Triangle b = new Triangle(1, 1, 1, 1, 2, 1, "B");
    DecimalFormat f2 = new DecimalFormat();
    f2.setMaximumFractionDigits(2);
    System.out.println ("Triange "+ b.getName() + " Perimeter is " + f2.format(b.getPerimeter()) + " Units");
    
    Triangle c = new Triangle(5, 4, 3, 2, 1, 0, "c");
    DecimalFormat f3 = new DecimalFormat();
    f3.setMaximumFractionDigits(2);
    System.out.println ("Triange "+ c.getName() + " Perimeter is " + f3.format(c.getPerimeter()) + " Units");
    

   
  }
  
}//end class
    
    
    

    

  
    
    
    
    
    

  

