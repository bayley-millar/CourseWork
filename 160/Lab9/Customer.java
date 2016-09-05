/** A class that will represent a potential customer for a meal and discounted harbour cruise package
  * Lab 10 COMP160
  * Bayley Millar
  */
import java.util.Scanner;
public class Customer{
  
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;
  
  
  /**Customer class constructor*/
  public Customer(String nameIn, int age, boolean studentIn){
    name = nameIn;
    child = age >= 5 && age <= 16;
    student = studentIn;
  }
  public Customer(){}
  
  /**gets the stores the name*/
  public String getName(){
    return name;
  }
  
  /**determines whether its a child*/
  public boolean isChild(){
    return child;
    
  }
  
  /**dermines whether its a student*/
  public boolean isStudent(){
    return student;
  }
  
  /**method to ask whether to book*/
  public boolean isBooked(){
    return booked;
  }
  
  /**will set the booking*/
  public void setBooked(){
    booked = true;
  }
  
  
  
  
  
}