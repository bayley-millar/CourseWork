/*  
 * TableApp.java application class
 * Lab 14 2014
 * Bayley Millar
 */ 

import javax.swing.*;

public class TableApp  
{
  /** main class that calls JFrame*/
  public static void main (String[] args)      
  {         
    JFrame frame = new JFrame ("Table Setting");         
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);       
    frame.getContentPane().add(new TablePanel());         
    frame.pack();         
    frame.setVisible(true);      
  }
}