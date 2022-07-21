
import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class Applet1 extends Applet {

 Button b1,b2;
 TextField t1;
public void init()
{
b1=new Button("Click");
t1=new TextField(9);
b2=new Button("Clear");

add(b1);
add(t1);
add(b2);

}
public boolean action(Event e , Object o)
{
if(e.target.equals(b1))
 t1.setText("Hello World");
if(e.target.equals(b2))
 t1.setText("");
return false;

}
}	
