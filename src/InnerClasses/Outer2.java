package InnerClasses;

class Outer2 {
	
	public void m2(){
		Inner i = new Inner();
		i.m1();
	}
	
	class Inner{
		
		public void m1(){
			System.out.println("Inner class instance method");
		}
		
	}
	
}
