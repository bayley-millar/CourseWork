/**
 * RandomRange.java
 * Lab 8, Part 2, COMP160  2014
 * Contains a single method which returns random integer between high and low parameters.
 */
import java.util.Random;
public class RandomRange{
  
  /** Returns random integer between high and low parameters.*/
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
  }







} 

