/** ArrayTable.java
  * Lab 16, 2014
  * Bayley Millar
  */

public class ArrayTable{
  /**Class creates a table*/
  public static void main(String[]args){
    int rows = 12;
    int cols = 12;
    int [][] table = new int [rows][cols];
    for (int row = 0; row < rows; row++){
      for(int col = 0; col < cols; col++){
        table [row][col] = (row + 1) * (col + 1);
      }
    }
    //Print table
    for(int row = 0 ; row < table.length ; row++){
      for(int col = 0 ; col < table[row].length ; col ++){
        System.out.print(table[row][col] + "\t");
      }
    System.out.println();
    
    }
  }
}
          
                             