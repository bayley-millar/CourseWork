/** PrintInt class
  * Lab 12 COMP160
  * Bayley Millar
  */

import java.util.Scanner;
public class PrintInt{

  /** Class that reads an interger value and prints the sum of all the even intergers.*/
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int count = 2;
    int sum = 0;
    System.out.println("Enter interger greater than 1");
    int num = scan.nextInt();
    if(num > 1){
      while (count <= num){
        if (count % 2 == 0){
          sum += count;
        }
        count ++;
      }
      System.out.println("sum of even numbers between 2 and " + num + " inclusive is: " + sum);
    }else
      System.out.println("Input value must not be less than 2");
    
    
  
  }
  
}