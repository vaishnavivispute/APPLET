package Rose;
import java.applet.*;
import java.awt.*;
//import java.awt.event.*;

public class Chebox extends Applet {
  Checkbox c1,c2,c3,c4;
  TextField t1;
  
  public void init()
  { 
	  
	 setLayout(new GridLayout(8,0));
	  c1 = new Checkbox("1");
	  c2 = new Checkbox("2");
	  c3 = new Checkbox("3");
	  c4 = new Checkbox("4");
	  t1 = new TextField();
	  
	  add(c1);
	  add(c2);
	  add(c3);
	  add(c4);
	  add(t1);
  }
  
  public boolean action(Event e , Object o) {
	          
	      int sum = 0;
	         
		  if(c1.getState()==true)
			  sum = sum+1;
		   
		  if(c2.getState()== true)
			  sum = sum + 2;
		  
		  if(c3.getState()== true)
			  sum = sum + 3;
		  
		  if( c4.getState()== true)
			  sum = sum + 4;
		  
		 t1.setText(String.valueOf(sum));
		 
	  return false;
		  
  }
}

