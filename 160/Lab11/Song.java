/** Song support class
  * Lab 11 COMP160
  * Bayley Millar
  */

public class Song{
  private String songLine;
  
  /**Constructor for class*/
  public Song(String sLine){
    songLine = sLine;
  }
  
  public Song(){}
  
  /**toString method which will return the data stored*/
  public String toString(){
    return songLine;
  }
  
  /**Processes the String 'songLine'*/
  public void process(){
    System.out.println("Length is: " + songLine.length());//Q.5
    System.out.println("Last Char is : " + songLine.charAt(songLine.length() - 1));//Q.6
    //Q.7
    int index1 = songLine.indexOf(" ");
    int index2 = songLine.indexOf(" ", index1 + 1);
    if (index2 != -1){
    System.out.println("First two words: " + songLine.substring(0, index2));
    System.out.println("last words: " + songLine.substring(index2));
    }

    System.out.println("first letter of 3rd word : " + songLine.charAt(index2+1));
    System.out.println("upper case: " + songLine.toUpperCase());//Q.9
    System.out.println("Space replaced with x: " + songLine.replace(" ", "x"));//Q.10
    System.out.println("First b: " + songLine.indexOf("b"));
    System.out.println("original string: " + songLine);//Q.12
    
  }
  
  
  
  
  
  
  
}