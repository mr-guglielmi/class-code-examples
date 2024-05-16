import javax.swing.*;

public class Absolute extends JFrame{
	
	JLabel l;
	JButton b;
	JPanel p;
	JTextArea t;
	
	Absolute (){
		l = new JLabel ("Hello World! How are you? I am fine");
		b = new JButton ("Click me!");
		p = new JPanel (null);
		t = new JTextArea ("Enter text here");
		
		l.setBounds (50, 50, 300, 20);
		p.add(l);
		
		b.setBounds (50, 300, 100, 40);
		p.add (b);
		
		t.setBounds (50, 75, 300, 200);
		t.setLineWrap (true);
		p.add(t);
		
		this.add (p);
		setResizable (false);
		setBounds (100, 100, 400, 400);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main (String[] args){
		try {
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}

		Absolute a = new Absolute ();
		a.setVisible (true);
	}

}