/**RecursiveApp.java
 *Bayley Millar
 *Lab03 COSC 241
 */
package week03;
/**the program takes a long interger, determines the number of
 *digits it has and then determines the sum.
 *@author Bayley Millar
 */
public class RecursiveApp{

    /**main method initialises and calls the methods.
     *@param args command lines are not used
     */
    public static void main(String[] args){
    }
    /**method returns long equal to the number of digits in argument.
     *@return count returns a long equal to the digitsin the argument.
     *@param n : n is a long number that is inputed.
     */
    public static long digits(long n){
        long count = 1;
        if (n < 10){
            count = 1;
        }else if(n > 10){
            count = 1 + digits(n/10);
        }
        return count;
    }
    /**Mehtod finds the sum of the digits in a long number.
     *@param n : is a long number input to find the sum of.
     *@return returns the sum of the digits in n.
     */
    public static long sumOfDigits(long n){
        long ans = 0;
        if (n != 0){
            ans = n%10 + sumOfDigits(n/10);
        }
        return ans;          
    }
}
           
            
        
