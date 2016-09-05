/**IntCounter.java support class
 * Lab 15 2014
 * Bayley Millar
 */

public class IntCounter{
  
  private int[] numArray;
  
  
  /**IntCounter construtor which displays the arrays contents*/
  public IntCounter(int[] numArray){
    this.numArray = numArray;
    for(int num  = 0; num < numArray.length ; num ++){//prints array with all numbers
      System.out.print(numArray[num]+ " " );
    }System.out.println(" Array is of length " + numArray.length);
  }
 
  /**default constructor*/
  public IntCounter(){}
  
  /**Produces a display line each time the target is found in the array*/
  public void showTarget (int target){
    for(int num=0; num< numArray.length; num++){//for loop finds the target within the array
      if(numArray[num] == target){
        System.out.println(" \t There is a " + target + " in position " + num);
        
      }
    }
  }
  
    
  
    
    
}
  