/**Shape.java
 * Bayley Millar
 * Lab 21, COMP160,  2014
 * represents a circle at a random x, y location
 */

import java.util.Random;
import java.awt.*;

public class Shape{
  
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  
  /**Shape constructor*/
  public Shape(){
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, (400 - width));
    y = randomRange(0, (400 - height));
    colour = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
  }
  
  /**Takes two int parameters and returns a random integer between those parameters*/
  public int randomRange(int lo, int hi){
   Random generator = new Random();
   return generator.nextInt(hi-lo+1) + lo; 
  }
  
  /**Method gets passed a Graphics object*/
  public void display(Graphics g){
   g.setColor(colour);
   g.fillOval(x, y, width, height);
  }
  
  
  
}