/*
 * MyFrameApp
 * Bayley Millar
 * Lab 6 Comp160, July, 2014
 */

import java.awt.Color;//Imorting Colors

public class MyFrameApp{
  
  public static void main(String [] args){
    MyFrame m1 = new MyFrame();//creating instance
    m1.setSize(300, 150);//set the size
    m1.setVisible(true);// make it visible
    m1.decorate(Color.yellow, "Yellow Einstein", 0);
    
    MyFrame m2 = new MyFrame();//creating second instance
    m2.setSize(300, 150);//set size
    m2.setVisible(true);//make it visible
    m2.decorate(Color.blue, "Blue Einstein", 180);//setting Background
  }//ends main class



}
    

  

  
  
  