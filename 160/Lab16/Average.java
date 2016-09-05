/*Average.java, part 3
 *COMP 160, Lab 16, 2014
 * Bayley Millar
 */
public class Average{
  /**class finds the average of the array*/
  public static void main(String[]args){
    int [] [] table = {{ 1,2,3},{4,5,6},{7,8}};
    for( int [] row: table){ 
     int sum =0; 
      for(int i:row){ 
        sum = sum+ i;  
       System.out.print(i + " ");
      } 
      System.out.println("\t Average:" + ((double)sum / row.length));
  
    }
    
  }
}