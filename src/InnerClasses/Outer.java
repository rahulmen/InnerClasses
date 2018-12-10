package InnerClasses;

class Outer {
	
	public void m2(){
		Inner i = new Inner();
		i.m1();
	}
	
	class Inner{
		
		public void m1(){
			System.out.println("Inner class instance method");
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Outer class main method");
		Outer o = new Outer();
		o.m2();
	}
	

}
