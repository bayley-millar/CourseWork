/**Smiley.java
 * Bayley Millar
 * Lab 24, COMP160,  2014
 * Abtract class Smiley
 */

package shapes;

import java.awt.*;

public class Smiley extends Shape{
  
  /**Method gets passed a Graphics object*/
  public void display(Graphics g){
    width = 30;
    height=30;
    g.setColor(Color.yellow);
    g.fillOval(x, y, width, height);
    g.setColor(Color.black);
    g.drawOval(x, y,width, height);
    g.fillOval(x + 7, y + 8, 4, 4);
    g.fillOval(x + 20, y + 8, 4, 4);
    g.fillArc(x + 8, y + 10, 15, 13, 190, 160);
  }
}
