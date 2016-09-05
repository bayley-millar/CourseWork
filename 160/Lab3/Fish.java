/**
 * Lab 3, COMP160, 2014
 */
import java.util.Scanner;//import scanner file
public class Fish{
  
  public static void main(String [] args){
    printVerse1(); //calling printVerse1 method
    printVerse2(); //calling peintVerse2 method
    String verse3; //declare verse 3
    String verse4; //declare verse 4
    Scanner scan = new Scanner(System.in);// bring in scanner
    System.out.println("Enter a line of text:");//print statement
    verse4 = scan.nextLine();//scanners nextLine
    verse3 = "this one has a little star";//verse3 assignment
    printVerse(verse3);//calling method
    printVerse(verse4);//calling method
    
  }//end main
  
  
  
  /**declare a string variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish. \n";
    System.out.println(verse1);
  }//end print verse1
  
  /**declare a string variable called verse2 and displays it on the screen*/
  public static void printVerse2(){
    String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish. \n";
    System.out.println(verse2);
  }//end print verse2
  
  /**prints out the variable verse when called from main*/
  public static void printVerse(String verse){
    System.out.println(verse);
  }//end print verse
  
  
  
}//end class