/**IntCounterApp.java application class
  * Lab 15 2014
  * Bayley Millar
  */

import java.util.Scanner;
import java.util.Random;

public class IntCounterApp{
  
  /**Asks the user for input 3 times and calls showTarget method*/
  public static void main(String[]args){
    for (int num = 0 ; num < 3 ; num++){//Lets the user put three inputs in
      Scanner sc= new Scanner(System.in);
      System.out.println("Which number would you like to find?" );
      int targetNum= sc.nextInt();//scans user input
      IntCounter intCounter1 = new IntCounter(makeArray());//uses constructor
      intCounter1.showTarget(targetNum);//calls showTarget
    }
    System.out.println("Finished");
  }
  
  /**makes the array with the random generator*/
  public static int[] makeArray (){
    Random randomGenerator1 = new Random();
    int num1 = randomGenerator1.nextInt(6) +5;//Random generator. From 5 to 10
    int numArray[] = new int [num1];//makes new array with random number between 5 and 10
    for(int num = 0 ; num < numArray.length ; num++){//Adds the numbers in between 0 and 4
      Random randomGenerator2 = new Random();
      numArray [num] =  randomGenerator2.nextInt(5); 
    }
    return numArray;
  }
  
  
  
  
}



