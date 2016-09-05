/**ShapePanel.java
  * Bayley Millar
  * Lab 22, COMP160,  2014
  * JPanel class for circles
  */
package shapes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

public class ShapePanel extends JPanel{
  
  private Shape[]shapes = new Shape[20];
  private DrawingPanel drawPanel = new DrawingPanel();
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private int count;
  private JButton start;
  private JButton stop;
  Timer timer;
  private final int DELAY = 10;
  
  
  /**Main method of the class*/
  public static void main(String[]args){  
    JFrame frame = new JFrame("Shape");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
  }
  
  /**COnstructor of ShapePanel. Adds all the content*/
  public ShapePanel(){
    //Makes the text fields, labels and buttons
    showNum = new JTextField(2);
    countLabel = new JLabel("Count"); 
    addShape = new JButton ("Add Shape");
    start = new JButton ("Start moving");
    stop = new JButton ("Stop Moving");
    //Makes a new Buttonlistener
    ButtonListener listener = new ButtonListener(); 
    addShape.addActionListener(listener);
    start.addActionListener(listener);
    stop.addActionListener(listener);
    //sets the timer
    timer = new Timer(DELAY, listener);
    //sets the control panel and adds everythinh to it
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    controlPanel.setBackground (Color.white);
    controlPanel.add (addShape);
    controlPanel.add (countLabel);
    controlPanel.add (showNum);
    controlPanel.add (start);
    controlPanel.add (stop);
    //adds the controlPanel and DrawPanel
    add(controlPanel);
    add(drawPanel);
  }
  
  /**Private inner class ButtonListener*/
  private class ButtonListener implements ActionListener{ 
    /**action performed method*/
    public void actionPerformed (ActionEvent e){  
      //getting the shapes
      if (e.getSource() == addShape && count < shapes.length){
        shapes[count] = new Shape();
        count++;
      }
      //getting the timer
      if (e.getSource() == timer){
        for (int i = 0; i < count; i++)
          shapes[i].move();
      }
      if (e.getSource() == start){
        timer.start();
      }else if (e.getSource() == stop){
        timer.stop();  
      }
      
      String string = String.valueOf(count); 
      showNum.setText(string);
      repaint();
    }
  }
    /**private inner class Drawing panel*/
    private class DrawingPanel extends JPanel{
      public DrawingPanel(){
        setBackground(Color.pink);
        setPreferredSize(new Dimension(400,400));
      }
      public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < count; i++)
          shapes[i].display(g);
      }
    }
    
    
    
    
 }