/**Square.java
 * Bayley Millar
 * Lab 24, COMP160,  2014
 * Abtract class Square
 */

package shapes;

import java.awt.*;

public class Square extends Shape{
  
  /**Method gets passed a Graphics object*/
  public void display(Graphics g){
    g.setColor(colour);
    g.fillRect(x, y, width, height);
  }
}