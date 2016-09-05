/** TrafficLightPanel.java
  * Lab 18, 2014
  * Bayley Millar
  */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**Class will create a traffic light*/
public class TrafficLightPanel extends JPanel{
  
  private JButton redButton;
  private JButton greenButton;
  private JButton amberButton;
  private JLabel buttonLabel;
  private JLabel lastPressedLabel;
  private JPanel buttonPanel;
  
  /**Constructor to the TrafficLightPanel Class*/
  public TrafficLightPanel(){
   redButton = new JButton("Red");
   greenButton = new JButton("Green");
   amberButton = new JButton("Amber");
   
   ButtonListener listener = new ButtonListener();
   redButton.addActionListener(listener);
   greenButton.addActionListener(listener);
   amberButton.addActionListener(listener);
   
   buttonLabel = new JLabel("Button Panel");
   lastPressedLabel = new JLabel("last pressed");
   
   buttonPanel = new JPanel();
   buttonPanel.setPreferredSize(new Dimension(80, 290));
   buttonPanel.setBackground(Color.white);
   buttonPanel.add(buttonLabel);
   buttonPanel.add(redButton);
   buttonPanel.add(greenButton);
   buttonPanel.add(amberButton);
   
   
   setPreferredSize(new Dimension(200, 300));
   setBackground(Color.blue);
   add(buttonPanel);
   
   LightPanel lightPanel = new LightPanel();
   add(lightPanel);
   
   
  }
  
  /**class that will set the background colour to what button is pushed*/
  private class ButtonListener implements ActionListener{
      public void actionPerformed (ActionEvent e){
        if (e.getSource() == redButton){
          lastPressedLabel.setText("red");
          
          
        }
        else if (e.getSource() == greenButton){
          lastPressedLabel.setText("green");
          
        }
        else if(e.getSource() == amberButton){
          lastPressedLabel.setText("amber");
          
        }
        repaint();
    }
  }
  /**Class that creates new panel and drwas circle for traffic lights*/
  private class LightPanel extends JPanel{
    
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      
      page.setColor(Color.black);
      page.fillOval(20, 30, 40, 40);
      page.fillOval(20, 90, 40, 40);
      page.fillOval(20, 150, 40, 40);
      String text = lastPressedLabel.getText();
      if (text.equals("red")){
        page.setColor(Color.red);
        page.fillOval(20, 30, 40, 40);
      }
      else if (text.equals("green")){
        page.setColor(Color.green);
        page.fillOval(20, 90, 40, 40);
      }
      else if (text.equals("amber")){
        page.setColor(Color.orange);
        page.fillOval(20, 150, 40, 40);
      }
     
    }
    /**Light panel Constructor*/
    public LightPanel(){
      setPreferredSize(new Dimension(80, 290));
      setBackground(Color.cyan);
    }
  } 
  
  
  
  
}