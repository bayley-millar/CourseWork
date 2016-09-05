//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//  Bayley Millar
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
public class StyleOptionsPanel extends JPanel
{
   private JLabel saying;
   private JCheckBox bold, italic;
   private int style = Font.PLAIN;
   private String typeFace = "Helvetica";
   private JRadioButton courier,  helvetica, timesNewRoman;

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and some check boxes that
   //  control the style of the label's font.
   //-----------------------------------------------------------------
   public StyleOptionsPanel(){
     
     
     saying = new JLabel ("Say it with style!");
     saying.setFont (new Font (typeFace, style, 20));
     //font styles
     bold = new JCheckBox ("Bold");
     bold.setBackground (Color.cyan);
     italic = new JCheckBox ("Italic");
     italic.setBackground (Color.cyan);
     courier = new JRadioButton("Courier");
     courier.setBackground(Color.cyan);
     helvetica = new JRadioButton("Helvetica");
     helvetica.setBackground(Color.cyan);
     timesNewRoman = new JRadioButton("TimesNewRoman");
     timesNewRoman.setBackground(Color.cyan);
     //make it so that only one button can be selected
     ButtonGroup group = new ButtonGroup();
     group.add(courier);
     group.add(helvetica);
     group.add(timesNewRoman);
     
     //adds a listener
     StyleListener listener = new StyleListener();
     bold.addItemListener (listener);
     italic.addItemListener (listener);
     courier.addItemListener (listener);
     helvetica.addItemListener (listener);
     timesNewRoman.addItemListener (listener);
     //uses constructor class
     GridPanel gridPanel = new GridPanel();
     add(gridPanel);
     
     //sets backGround color
     setBackground (Color.cyan);
     setPreferredSize (new Dimension(300, 150));
   }
   
   //*****************************************************************
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener
   {
     //--------------------------------------------------------------
     //  Updates the style of the label font style.
     //--------------------------------------------------------------
     public void itemStateChanged (ItemEvent event)
     {
       style = Font.PLAIN;
       
       if (bold.isSelected()){
         style = Font.BOLD;
       }
       
       if (italic.isSelected()){
         style += Font.ITALIC;
       }
       
       if (courier.isSelected()){
         saying.setFont (new Font ("Courier", style, 20)); 
       }
       
       if (timesNewRoman.isSelected()){
         saying.setFont (new Font ("Times New Roman", style, 20));
       }
       
       if (helvetica.isSelected()){
         saying.setFont (new Font ("Helvetica", style, 20));
       }
       repaint();
     }
   }
   /**Adds the buttons to a grid panel which uses the grid layout style*/
   public class GridPanel extends JPanel{
     /**Constructor*/
     public GridPanel(){
       setLayout(new GridLayout (6, 1));
       setBackground(Color.cyan);
       add(saying);
       add(bold);
       add(italic);
       add(courier);
       add(helvetica);
       add(timesNewRoman);
     }
   }
       
   
}

