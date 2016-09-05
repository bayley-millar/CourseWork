/**  
 * Diner.java 
 * Lab 14 2014
 * Bayley Millar
 */ 

import java.awt.*;

public class Diner{
  
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  final int DIAMETER = 50;
 
  /** Sets up the circles with co-ordinates, name, number, colour. */
  public Diner(int getx, int gety, String getName, int num, Color getColour){
    colour = getColour;
    name = getName;
    seatNum = num;
    x = getx;
    y = gety;
    
  }
  
  /** Draws in the circle */
  public void draw(Graphics g)
  {
    g.setColor (colour);
    g.fillOval(x, y, DIAMETER, DIAMETER); //Makes the circle
    
    g.setColor (Color.black);
    g.setFont(new Font("Arial", Font.PLAIN, 16)); //Puts the name in
    g.drawString(name, x+8, y+35);
    
    
    g.setFont(new Font("Arial", Font.PLAIN, 14)); // Dlaces the seat number
    g.drawString(Integer.toString(seatNum), x+22, y+14);
    
  }
}
