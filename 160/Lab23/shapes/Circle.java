/**Circle.java
 * Bayley Millar
 * Lab 23, COMP160,  2014
 * Abtract class circle
 */

package shapes;

import java.awt.*;

public class Circle extends Shape{
  
  /**Method gets passed a Graphics object*/
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}