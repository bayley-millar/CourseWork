/**ShapeApp.java
 * Bayley Millar
 * Lab 22, COMP160,  2014
 * application class
 */
package shapes;

import javax.swing.JFrame;
/**App class will create JFrame and call the ShapePanel.java class*/
public class ShapeApp{
  /**Main class*/
  public static void main (String[]args){
   JFrame frame = new JFrame("Shape");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getContentPane().add(new ShapePanel());
   frame.pack();
   frame.setVisible(true);
  }
  

  
  
}