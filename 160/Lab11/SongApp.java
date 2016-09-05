/** application class for Song.java
  * Lab 11 COMP160
  * Bayley Millar
  */

public class SongApp{
  
  public static void main(String[]args){
    Song song1 = new Song("While my guitar gently weeps");
    Song song2 = new Song("Let it be");
    Song song3 = new Song("Penny Lane");
    
    System.out.println(song1.toString());
    System.out.println(song2.toString());
    System.out.println(song3.toString());
    System.out.println("");//adds a space
    
    song1.process();
    System.out.println("");//adds a space
    song2.process();
    System.out.println("");//adds a space
    song3.process();
    
  }
  
  
  
}