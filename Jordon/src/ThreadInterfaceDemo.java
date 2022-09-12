//By default package of thread is lang.
//we can also create a functioninterface using user defined.

//Here we can used a interface hence we can not called a start method directly because that method was thread hence we can create object and passed 
//a parameter of that object of class.
public class ThreadInterfaceDemo implements Runnable  {
	
	@Override
	public void run() {
		System.out.println("I am in now in interface");
	}
   public static void main(String []args) {
	   
	   Thread t = new Thread(new ThreadInterfaceDemo());//passed a object of ThreadInterfaceDemo.
	   t.start();
   }
}
