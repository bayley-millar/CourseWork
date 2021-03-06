/**ShapePanel.java
  * Bayley Millar
  * Lab 23, COMP160,  2014
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
  private JTextField showNum;
  private JLabel countLabel;
  private int count;
  Timer timer;
  private final int DELAY = 10;
  private JButton[] button = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop")};
  
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
    //Makes a new Buttonlistener
    ButtonListener listener = new ButtonListener();
    //sets the timer
    timer = new Timer(DELAY, listener);
    //sets the control panel and adds everythinh to it
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    controlPanel.setBackground (Color.white);
    controlPanel.add (countLabel);
    controlPanel.add (showNum);
    //adds the controlPanel and DrawPanel
    add(controlPanel);
    add(drawPanel);
    //adds a listener to all the buttons
    for (JButton b:button){
      b.addActionListener(listener);
      controlPanel.add(b);
    }
  }
  
  /**Private inner class ButtonListener*/
  private class ButtonListener implements ActionListener{ 
    /**action performed method*/
    public void actionPerformed (ActionEvent e){  
      //getting the timer
        if (e.getSource() == timer){
          for (int i = 0; i < count; i++)
            shapes[i].move();
        }else{
          //getting the shapes
          JButton button = (JButton) e.getSource();
          if (button.getText().equals("Circle") && count < shapes.length){ 
            shapes[count] = new Circle();
            count++;
          }else if(button.getText().equals("Square") && count < shapes.length){ 
            shapes[count] = new Square();
            count++;
          }else if(button.getText().equals("Oval") && count < shapes.length){
            shapes[count] = new Oval();
            count++;
          }else if(button.getText().equals("Smiley") && count < shapes.length){ 
            shapes[count] = new Smiley();
            count++;
          }else if(button.getText().equals("Swirl") && count < shapes.length){ 
            shapes[count] = new Swirl();
            count++;
          }
        //Start and stop
        if (button.getText().equals("Start")){ 
          timer.start();
        }else if (button.getText().equals("Stop")){
          timer.stop();  
        }
        
        String string = String.valueOf(count); 
        showNum.setText(string);  
        
        }
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
    
    
    
    
