package InnerClasses;

import javax.swing.plaf.synth.SynthScrollBarUI;

class MethodLocalClass {
	
	public void m1(){
		
		class MethodLocalInnerClass{
		
		public void m1(int x,int y){
			System.out.println(x+y);
		}
						
		
		}
		
		
		
			MethodLocalInnerClass obj = new MethodLocalInnerClass();
			obj.m1(10, 20);
			
		}
		
	public static void main(String[] args){
	
		MethodLocalClass obj1 = new MethodLocalClass();
		obj1.m1();
		
		
	}
	

}
