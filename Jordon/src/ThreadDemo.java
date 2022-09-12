
//THREAD: Thread is a execution of program in java we can implemented by using 2 ways: 
// 1.Using extends Keyword.
// 2.Using Implement Runnable interface
//extends used to behavior of thread in a class.
public class ThreadDemo extends Thread{

	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
       System.out.println("Hey, I am in a threaddemo");
	}
	public static void main(String[] args) {
	 ThreadDemo td = new ThreadDemo();
	 td.start();// Using this method we have getting a thread behavior
	 td.run();//Here we can not getting behavior of thread as we extends thread.

	}
}


