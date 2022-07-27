import java.applet.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.font.*;

public class Checkbox1 extends Applet{
	
	//private static final TextField t1 = null;
	Label l1;
	Checkbox chkApple,Mango,Banana;
	TextField t1;
	
	public void init() {
		setBackground(Color.yellow);
		setLayout(new GridLayout(5,2));
		CheckboxGroup cc = new CheckboxGroup();
		add(l1 = new Label ("WELCOME TO FRUITZONE"));
		add(chkApple = new Checkbox("APPLE",cc, false));
		add(Mango = new Checkbox("Mango",cc, false));
		add(Banana = new Checkbox("Banana",cc, false));
		add(t1 = new TextField(5));
		
		
		
	}
	  public boolean action(Event e , Object o) {
	         
		  if(chkApple.getState()==true)
			  t1.setText("Apple is selected");
		   
		  if(Mango.getState()== true)
			 
		    t1.setText("Mango is selected");
		  
		  if(Banana.getState()== true)
			  t1.setText("Banana is selected");
		  
		  return false;
		  
		  
	  }
	
	

}
