import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author phil
 */
public class Radio extends JFrame {
    
    JPanel selector; //panel for the radio buttons and checkboxes
    JPanel display; //panel for the text field
    JPanel buttonBar; //panel for the buttons
    
    JButton b1, b2;
    JTextArea t;
    JLabel l1, l2;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3;
    
    Radio(){
        selector = new JPanel();
	//box layout set up to stack items on top. Works like flow layout
        BoxLayout layout = new BoxLayout(selector, BoxLayout.Y_AXIS);
        selector.setLayout (layout); //set the selector panel to box layout

	//instantiate the radio buttons
        r1 = new JRadioButton ("Option A");
        r2 = new JRadioButton ("Option B");
        r3 = new JRadioButton ("Option C");
        r4 = new JRadioButton ("Option D");
	//group the radio buttons so that only one can be selected at a time
        ButtonGroup g = new ButtonGroup(); 
        g.add(r1);
        g.add(r2);
        g.add(r3);
        g.add(r4);
        
        l1 = new JLabel ("Radio Options");
        l2 = new JLabel ("Checkbox options");
        
        selector.add (l1);
        selector.add(r1);
        selector.add(r2);
        selector.add(r3);
        selector.add(r4);
        selector.add (l2);

	//create the checkboxes. More than one can be selected at a time
        c1 = new JCheckBox ("Attribute A");
        c2 = new JCheckBox ("Attribute B");
        c3 = new JCheckBox ("Attribute C");
        
        selector.add (c1);
        selector.add (c2);
        selector.add (c3);
        
        //create the display and button bars
        display = new JPanel(new BorderLayout());
        buttonBar = new JPanel();
        t = new JTextArea();
        
        b1 = new JButton ("Update Selection");

	//action listener for the first button to check the radio buttons and checkboxes
        b1.addActionListener (new ActionListener(){
           public void actionPerformed(ActionEvent e){
	       //see what radio button is selected and update the text in the text area accordingly
               if (r1.isSelected()){ 
                   t.setText ("Option A Selected with the following attributes:");
               }
               
               else if (r2.isSelected()){
                   t.setText ("Option B Selected with the following attributes:");
               }
               
               else if (r3.isSelected()){
                   t.setText ("Option C Selected with the following attributes:");
               }
                
               else if (r4.isSelected()){
                   t.setText ("Option D Selected with the following attributes:");
               }
               else{
                   t.setText("No Options Selected with the following attributes:");
               }

	       //see which checkboxes are selected and update the textarea
               if (c1.isSelected()){
                   t.append("\nAttribute A");
               }
                if (c2.isSelected()){
                   t.append("\nAttribute B");
               }
                 if (c3.isSelected()){
                   t.append("\nAttribute C");
               }
           } 
        });
        
        b2 = new JButton ("Clear selections");
        
        b2.addActionListener (new ActionListener(){
		//clear all text and selections
           public void actionPerformed(ActionEvent e){
               g.clearSelection(); //clears the radio button group so all are unselected
               c1.setSelected(false);
               c2.setSelected(false);
               c3.setSelected(false);
               t.setText ("");
           } 
        });
        
        buttonBar.add(b1);
        buttonBar.add (b2);
        display.add(t);
        //create the window
        this.add(selector, BorderLayout.EAST);
        this.add(buttonBar, BorderLayout.SOUTH);
        this.add (display, BorderLayout.CENTER);
        
        this.setBounds (100, 100, 500, 500);
        this.setResizable (true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
    
    }

    public static void main (String[] args){

	try{
	    //set the look of the window to match the operating system
	    UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName());
	}
	catch (Exception e){
	}

	Radio r = new Radio();
	r.setVisible(true);
    }
    
    
}
