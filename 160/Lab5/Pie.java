/**
 Pie.java
 Provided for Part 2, Lab5, COMP160 2014
 
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /**creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);
    }
    
    /**all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
        page.setColor(Color.white);
        page.fillRect(0,0,300,220);
        //your pie chart code goes here
        final int MID = 100;
        final int TOP = 50;
        final int WIDTH = 150;
        final int HEIGHT = 150;
        final int ARC = 45;
        page.setColor(Color.blue);
        page.fillArc(MID + 10, TOP + -5, WIDTH, HEIGHT, 0, ARC);
        page.setColor(Color.yellow);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, ARC, ARC);
        page.setColor(Color.pink);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, 90, ARC);
        page.setColor(Color.orange);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, 135, ARC);
        page.setColor(Color.red);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, 180, ARC);
        page.setColor(Color.green);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, 225, ARC);
        page.setColor(Color.cyan);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, 270, ARC);
        page.setColor(Color.black);
        page.fillArc(MID, TOP, WIDTH, HEIGHT, 315, ARC);
        
        
    }
}
