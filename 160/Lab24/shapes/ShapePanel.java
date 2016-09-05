/**ShapePanel.java
  * Bayley Millar
  * Lab 24, COMP160,  2014
  * JPanel class for circles
  */
package shapes;
//importing
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.ArrayList;

public class ShapePanel extends JPanel{
  //making the data fields
  private ArrayList<Shape> shapes = new ArrayList<Shape>(); //new arrayList shapes
  private JPanel controlPanel;//control panel
  private JLabel countLabel;//counting label
  private JTextField showNum;//text field show num
  private DrawingPanel drawPanel = new DrawingPanel();//creates drwing panel
  private int count;//count variable
  private Timer timer;//timer variable
  private final int DELAY = 10;//delay
  private JButton[] button = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove")};
  
  /** the main method */
  public static void main(String[]args){  
    JFrame frame = new JFrame("Shape");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
  }
  /** Constructor of ShapePanel*/
  public ShapePanel(){    
    showNum = new JTextField(2);   
    countLabel = new JLabel("Remove Which?"); // newlabel for remove
    //makes new button listener
    ButtonListener listener = new ButtonListener(); 
    //sets the timer
    timer = new Timer (DELAY, listener);
    controlPanel = new JPanel();
    //displays all the buttons for the control panel
    for (JButton b:button){
      b.addActionListener(listener);
      controlPanel.add(b);
    }
    //adds everything to the control panel
    controlPanel.setPreferredSize (new Dimension(100, 400)); // Sets Control Panel 
    controlPanel.setBackground (Color.white);
    controlPanel.add (countLabel);
    controlPanel.add (showNum);
    //adds draw and control panel to the main window
    add(controlPanel);
    add(drawPanel); 
  }
  /**ActionListener class for buttons*/
  private class ButtonListener implements ActionListener{ 
    public void actionPerformed (ActionEvent e){ 
      
      if (e.getSource() == timer){
        for (Shape i : shapes){
          i.move();
        }
      }else{
        //sets all the buttons
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Circle")){
          shapes.add(new Circle());
          count++;
        }else if(button.getText().equals("Square")){
          shapes.add(new Square());
          count++;
        }else if(button.getText().equals("Oval")){
          shapes.add(new Oval());
          count++;
        }else if(button.getText().equals("Smiley")){
          shapes.add(new Smiley());
          count++;
        }else if(button.getText().equals("Swirl")){
          shapes.add(new Swirl());
          count++;
        }
        
        //start, stop and remove buttons
        if (button.getText().equals("Start")){
          timer.start();
          System.out.println("Hello");
        }else if (button.getText().equals("Stop")){
          timer.stop();  
        //renove statement
        }else if (button.getText().equals("Remove")){
          try{
            int removeNum = Integer.parseInt(showNum.getText());
            shapes.remove(removeNum); 
          }catch(NumberFormatException p){
            System.out.println("Number format exception error");
          }catch(IndexOutOfBoundsException z){
            System.out.println("Number is out of bounds");
          }
          
        }
        showNum.setText(Integer.toString(shapes.size() - 1));
        if(shapes.size() < 1){
          showNum.setText(" ");
        }
      }
      repaint();
    }
  }
  /**creates the drawing panel*/
  private class DrawingPanel extends JPanel{
    /**Constructor*/
    public DrawingPanel(){
      setPreferredSize(new Dimension(400,400)); 
      setBackground(Color.pink);
    }
    /**sets the graphics*/
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (Shape i : shapes){
        i.display(g);
        i.showIndex(g, shapes.indexOf(i));
      } 
    }
  }
  
  
  
  
}
