/** Appliacation for Gregorian class
  * Lab 9 COMP160
  * Bayley Millar
  */

public class GregorianApp{
  /**Main method*/
  public static void main(String[]args){
    leapYear(2010);
    leapYear(2012);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }
  
  /**Method that determines whether a year is leap or not*/
  public static void leapYear(int year){
    if (year > 1582){
      if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
        System.out.println(year + " is a leap year");
      }
      else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
        System.out.println(year + " is not a leap year");
      }
      else if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0){
        System.out.println(year + " is a leap year");
      }
      else {
        System.out.println(year + " is not a leap year");
      }
    }
        
      
      
    
    else{
      System.out.println("Predates the Gregorian calender");
    }
  
  }

}
    