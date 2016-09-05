/**Counter.java
 * bayley millar
 * Lab 01, COSC 241
 */
package week01;

import java.util.*;
/**the program prints out the lines and words from the input.
 *@author Bayley Millar
 */
public class Counter{
    /**This method declares variables and scnas the input. Then it prints
     *it.
     *@param args command line arguments not used.
     */
    public static void main(String[]args){
        int lines = 0;
        int words = 0;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            String str = scan.nextLine();
            Scanner scline = new Scanner(str);
            lines++;

            while(scline.hasNext()){
                String word = scline.next();
                words++;
            }
        }
        
        System.out.println("lines: " + lines);
        System.out.println("words: " + words);




    }
}//end class
