package week07;

import java.util.*;
import java.io.*;
/**a frequency generator.
 * @author Bayley Millar.
 */
public class FrequencyGenerator implements WordGenerator {
    /**sets the final size.*/
    private final int sIZE = 26;
    /**sets random.*/
    private Random random;
    /**sets the array.*/
    private double[] w;
    /**The main method.
     * @param args command line arguments are not used.
     */
    public static void main(String[]args){
        FrequencyGenerator f = new FrequencyGenerator(new Random());
    }
    /**method scans in the file and reads it.
     * @param r random object.
     */
    public FrequencyGenerator(Random r){
        File file;
        try{
            file = new File("letter-frequencies.txt");
            Scanner sc = new Scanner(file);
            w = new double[sIZE];
            for(int index = 0; index < w.length; index++){
                w[index] = sc.nextDouble();
            }
        }catch(Exception e){}
        random = r;
    }
    /**method gets next int.
     * @param n is the input.
     * @return returns the next word.
     */
    public String nextWord(int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            char c = (char) ('a' + chooseIndex());
            result.append(c);
        }
        return result.toString();
    }
    /**method chooses the index.
     * @return returns the index.
     */
    public int chooseIndex(){
        int index = 0;
        double randomNum = random.nextDouble();
        while(randomNum > w[index]){
            randomNum = randomNum - w[index];
            index++;
        }
        return index;
    }
            

}
