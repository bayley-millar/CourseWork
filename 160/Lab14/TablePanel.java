/*  
 * TablePanel.java, extends JPanel
 * Lab 14 2014
 * Bayley Millar
 */ 



import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel
{
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  /**Creates the Diner circles with co-ordinates, names, colours*/
  public TablePanel()
  {
    diner1 = new Diner (125,35,"Dexter",1,Color.red);
    diner2 = new Diner (185,95,"Tara",2,Color.red);
    diner3 = new Diner (185,155,"Taren",3,Color.red);
    diner4 = new Diner (125,215,"Pommy",4,Color.red);
    diner5 = new Diner (65,155,"Cassie",5,Color.red);
    diner6 = new Diner (65,95,"Bayley",6,Color.red);
    
    setPreferredSize (new Dimension(300, 300)); // sets frame size and back groundcolor 
    setBackground (Color.white);
  }
  /** Draws the circle*/
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.setColor (Color.cyan);
    g.fillRect(125, 90, 50, 120); // Draws the table 
  }
}
  

    