/**Shape.java
 * Bayley Millar
 * Lab 24, COMP160,  2014
 * represents a circle at a random x, y location
 */
package shapes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public abstract class Shape{
  
  //setting the data fields
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color colour;
  protected int moveX =-1;
  protected int moveY =1;
  protected int num;
  protected Graphics number;
  
  public Shape(){ 
    //sets the variables
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0,(400-width));
    y = randomRange(0,(400-height));
    colour = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
  }
  /** ranadom generator.*/
  public int randomRange(int lo, int hi){ 
    Random RGenerator = new Random();
    return RGenerator.nextInt(hi-lo+1) + lo; 
  }
  /** makes the shapes bounce*/
  public void move (){
    x += moveX;
    y += moveY;
    if(x == 400 - width || x == 0){
      moveX = -moveX;
    }
    if(y > 400 - height || y == 0){
      moveY = -moveY;
    }
  }
  /**method makes sets the font and size*/
  public void showIndex(Graphics g , int index){
    g.setColor (Color.black);
    g.setFont(new Font("Arial", Font.PLAIN, 14)); // 
    g.drawString(Integer.toString(index), x, y);
    
  }
  public abstract void display(Graphics g);
  
}