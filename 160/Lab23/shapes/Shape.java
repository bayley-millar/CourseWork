/**Shape.java
 * Bayley Millar
 * Lab 23, COMP160,  2014
 * represents a circle at a random x, y location
 */
package shapes;

import java.util.Random;
import java.awt.*;

public abstract class Shape{
  
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color colour;
  protected int moveX =1;
  protected int moveY =1;
  
  
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
  
  /**move method to make circles move*/
  public void move(){
    x += moveX;
    y += moveY;
     //if the circls hit the edge they bounce off
    if (x <= 0 ){
      x = 10;
      moveX= -moveX;
    }else if(x >= 400 - width){
      x = 400 - width - 10;
      moveX= -moveX;
    }
    
    if (y <= 0){
      y = 1;
      moveY= -moveY;
    }else if(y > 400 - height){
      y = 400 - width - 10;
      moveY= -moveY;
    }
    

  }
  
    
  
  
  
}