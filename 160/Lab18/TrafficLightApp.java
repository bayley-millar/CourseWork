/** TrafficLightApp.java
  * Lab 18, 2014
  * Bayley Millar
  */

import javax.swing.JFrame;
/**App class will create JFrame and call the trafficLightPanel.java class*/
public class TrafficLightApp{
  /**Main class*/
  public static void main (String[]args){
   JFrame frame = new JFrame("TrafficLight");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getContentPane().add(new TrafficLightPanel());
   frame.pack();
   frame.setVisible(true);
  }
  

  
  
}