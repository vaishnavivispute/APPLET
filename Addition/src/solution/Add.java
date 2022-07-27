package solution;

import java.applet.Applet;
import java.awt.*;
public class Add extends Applet {

 TextField t1,t2,t3;
 Label l1,l2,l3;
 Button b1,b2;
 
 public void init()
{
  add(t1 = new TextField());
  add(l1 = new Label("+"));
  add(t2 = new TextField());
  add(l2 = new Label("="));
  add(t3 = new TextField());
  add(b1 = new Button("ADD"));
  
} 
 public boolean action(Event e , Object o) 
 {
	 
	 if(e.target.equals(b1))
	 {
		 int no1 = Integer.parseInt(t1.getText());//First we accept string but we cannot performed addition on string hence we convert string into int.
		 int no2 = Integer.parseInt(t2.getText());
		 int no3 = no1 + no2;
		 t3.setText(String.valueOf(no3));
		 
	 }
	 
 return false;
}
}



  
