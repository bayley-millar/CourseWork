/** Anagram class
  * Lab 13 COMP160
  * Bayley Millar
  */

import java.util.Scanner;
public class Anagram{
  
  /** Main method which calls the sortPhrase class*/
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first phrase");
    String phrase1 = scan.nextLine();
    System.out.println("Enter second phrase");
    String phrase2 = scan.nextLine();
    if (sortPhrase(phrase1).equals(sortPhrase(phrase2))){
      System.out.println(phrase1 + " is an anagram of " + phrase2);
    }else{
      System.out.println("not anagrams of each other");
    }
  }

  /** A class that will sort a phrase*/
  public static String sortPhrase(String s){
    s = s.toLowerCase();
    String newString = "";
    for(char alphabet = 'a'; alphabet <= 'z';alphabet++) {
      for(int index = 0 ; index < s.length() ; index ++){
        if  (alphabet == s.charAt(index)){
          newString += alphabet;
        }
      }
    }
    System.out.println(newString + " Are the letters of " + s + " in order");
    return newString;
  }
  
     
  
  
}//end class