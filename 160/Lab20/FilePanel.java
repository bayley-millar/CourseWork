/** FilePanel.java
  * Lab 20, COMP160,  2014
  * Bayley Millar
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    String fileName = ("LongBadData.txt");
    //setting variables
    int fill, x, y, w, h, chosenColour;
    Color color = Color.black;
    boolean draw = false;
    //try starts
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      while (fileScan.hasNextLine()){
        String inputLine = fileScan.nextLine();
        if(inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+") && count<drawObjects.length){
          Scanner scan = new Scanner(inputLine);
          //gets the data
          fill = scan.nextInt();
          chosenColour = scan.nextInt();
          x = scan.nextInt();
          y  = scan.nextInt();
          w = scan.nextInt();
          h = scan.nextInt();
          //fill or not
          if(fill == 1){
            draw = true;
          }else if (fill == 0){
            draw = false;
          }
          //get the colour
          if (chosenColour == 1){
            color = Color.red;
          }else if(chosenColour == 2){
            color = Color.blue;
          }else if(chosenColour == 3){
            color = Color.green;
          }
        System.out.println(x);
        drawObjects[count] = new Rectangle(draw, color, x, y, w, h);//draws rectangle with color
        count++;
        }
        
      }
    }catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location");
      System.exit(1);
    }
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}


