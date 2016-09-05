/**Oval.java
 * Bayley Millar
 * Lab 23, COMP160,  2014
 * Abtract class Oval
 */

package shapes;

import java.awt.*;

public class Oval extends Shape{
  
  /**oval class to make shape oval look alike*/
  public Oval(){
    height = 4 * width;
    y = randomRange(0,400-height);
  }
  
  /**Method gets passed a Graphics object*/
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}