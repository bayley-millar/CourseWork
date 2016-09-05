/** TempConverter.java
  * Lab 25, 2014
  * Bayley Millar
  */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConverter extends JPanel {
  //declaring variables
  private JPanel panel;
  private JLabel input;
  private JLabel output;
  private JLabel result;
  private JLabel notNum;
  private JTextField fahrenheit;
  private JButton convertButton;
  
  /**construtor*/
  public TempConverter() {
    //label for farenheight
    input = new JLabel("Farenheight");
    JLabel output = new JLabel("Temperature in Celsius: ");
    result = new JLabel("0");
    notNum = new JLabel(" ");
    convertButton = new JButton("convert");
    //text field
    fahrenheit = new JTextField(5);
    //add listener
    ButtonListener listener = new ButtonListener();
    convertButton.addActionListener(listener);
    //adding to the panel
    panel = new JPanel();
    panel.setPreferredSize(new Dimension(400, 100));
    panel.setBackground(Color.yellow);
    panel.add(input);
    panel.add(fahrenheit);
    panel.add(output);
    panel.add(result);
    panel.add(convertButton);
    panel.add(notNum);
    
    add(panel);
  }
  /**listener private class*/
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      try{
        int fahrenheitTemp;
        int celsiusTemp;
        String fahr = fahrenheit.getText();
        //converting text to get int
        fahrenheitTemp = Integer.parseInt(fahr);
        //conversion
        celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
        //setting the text of result
        if (event.getSource() == convertButton){
          result.setText(Integer.toString(celsiusTemp));
          notNum.setText(" ");
        }
      }catch (Exception e) {
        System.out.println("not number");
        notNum.setText("This is not a number");
      }
    }
    
  }
}

    
    
    
    
    