/**FruitsClass.java
  *Lab 16, 2014
  *Bayley Millar
  */
import java.util.Scanner;
public class FruitsClass{
  /**class will make the user guess the fruit*/
  public static void main(String[]args){
    String [] fruit = new String [3];
    
    for (int num = 0 ; num < fruit.length; num++){
      Scanner sc= new Scanner(System.in);
      System.out.println(" Please enter a fruit ");
      fruit[num] = sc.nextLine();
    }
    
    for(String s : fruit){
      Scanner scan = new Scanner(System.in);
      String guess;
      boolean correct = false;
      do{
        System.out.println("Guess what fruit I am? " + s.substring(0, 2) + " " + s.length() + " Letters");
        guess= scan.nextLine();
        correct = false;
        if(!(guess.equalsIgnoreCase(s))){
          System.out.println("Try agian");
        }
        else{
          correct = true;
        }
      }while(!correct);
      
      System.out.println("correct");  
      
    }
  }
}

  
  
  
