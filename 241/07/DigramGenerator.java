package week07;

import java.util.*;
import java.io.*;
/**class that creates a digram generator.
 *@author Bayley millar.
 */
public class DigramGenerator implements WordGenerator {
    /**random is set.*/
    private Random random;
    /**sets the string letters.*/
    private String letters;
    /**sets the lettersArray array.*/
    private String[] lettersArray;
    /**sets the size of the alphabet.*/
    private final int kSIZE = 26;

    /**mehtod is a diagram generator.
     * @param r is random
     */
    public DigramGenerator(Random r) {
        random = r;
        File firstLetters;
        File continuations;
        try{
            firstLetters = new File ("first-letters.txt");
            Scanner sc = new Scanner (firstLetters);            
            letters = sc.nextLine();
        }catch(Exception e){}
        lettersArray = new String [kSIZE];
        try{
            continuations = new File ("continuations.txt");
            Scanner sc2 = new Scanner (continuations);
            for(int i = 0; i < lettersArray.length; i++){
                lettersArray[i] = sc2.nextLine();
            }
            int i = 0;
 
            
            
        }catch(Exception p){}   
    }
    /**method produces next word.
     * @param n is a int input.
     * @return returns the next word.
     */
    public String nextWord(int n) {
        char secondLetter;
        String sentence;
        StringBuilder result = new StringBuilder();
        int charIndex = random.nextInt(letters.length());
        char firstLetter = letters.charAt(charIndex);
        result.append(firstLetter);
        
        for(int i = 1; i < n; i++){
            sentence = lettersArray[firstLetter - 'a'];
            secondLetter = randChar(sentence);
            result.append(secondLetter);
            firstLetter = secondLetter;
        }
        return result.toString();
    }
    /**method finds a rand character.
     * @return returns the random char.
     * @param s is the random string input.
     */
    private char randChar(String s){
        return s.charAt(random.nextInt(s.length()));
    }
                        

}
