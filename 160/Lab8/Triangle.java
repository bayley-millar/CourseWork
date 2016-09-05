/*
 * Triangle support class
 * Lab 8 COMP160 2014
 * Calculates the the perimeter of a Triangle
 * Bayley Millar
 */
import java.text.DecimalFormat;
import java.lang.Math;
public class Triangle{
  
  
  private int p1x;
  private int p1y;
  private int p2x;
  private int p2y;
  private int p3x;
  private int p3y;
  private String name;
  
  /** Triangle class constructor */
  public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
  
  public Triangle(){
    p1x = 0;
    p1y = 0;
    p2x = 0;
    p2y = 0;
    p3x = 0;
    p3y = 0;
    name = "";
    
  }
  
  /**method that will calculate the side of a tringle*/
  private double calcSide(int x1, int y1, int x2, int y2){
    return (Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))));
  }
  
  /**method that will calcualte the perimeter*/
  public double getPerimeter(){
    return (calcSide(p1x, p1y, p2x, p2y)) + (calcSide(p2x, p2y, p3x, p3y)) + (calcSide(p3x, p3y, p1x, p1y));
  }
  /**method that returns the name*/
  public String getName(){
    return name;
    
  }
  


  
  
  
  
  
}