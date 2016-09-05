/** ReadString class
  * Lab 12 COMP160
  * Bayley Millar
  */


import java.util.Scanner;
public class ReadString{
  
  /** Class that will count the consonants and vowels in a sentence*/
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter sentenece");
    String sentence = scan.nextLine();
    System.out.println("Sentence is : " + sentence);
    int vowelCount = 0;
    int consonantCount = 0;
    sentence = sentence.toLowerCase();
    int index = 0;
    
    while(index <= (sentence.length()-1)){
      char ch = sentence.charAt(index);
      if('z' >= ch && 'a' <= ch){
        switch(ch){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            vowelCount ++;
           break;
          default:
            consonantCount ++;
           
        }
        
      }
      index ++;
    }
    
  System.out.println("VowelCount : " + vowelCount);
  System.out.println("ConsonantCount : " + consonantCount); 
  }    
  
}




