
public  class InterfaceDemo implements I1 {

	public InterfaceDemo() {
	}
	public void m1() {

		System.out.println("InterfaceDemo with m1");
	}
	
	
	public void m2(InterfaceDemo d) {
		System.out.println("I am in InterfaceDemo with m2");
		
	}
	
	public void m3(Interfaceclass c) {
		System.out.println("I am in interfaceDemo with method of Interfaceclass m3;");
	}
	 public static void main(String args[]) {
		 InterfaceDemo m = new InterfaceDemo();
		 Interfaceclass cd = new Interfaceclass();
		 m.m1();
		 m.m2(m);
		 m.m3(cd);
	 }


}
