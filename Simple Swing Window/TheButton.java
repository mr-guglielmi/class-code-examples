import java.awt.event.*;

public class TheButton implements ActionListener{

	Window w; //the frame containing the button
	
	TheButton (Window w){
		this.w = w;
	}
	
	public void actionPerformed (ActionEvent e){
		w.changeLabel ("You clicked the button!"); //what to do when the button is pressed
		
	}
}
