package InnerClasses;


class MethodLocalClass2 {

	
	int x = 10;
	static int y =20;
	
	public  static void m1(){
		
		class Inner{
			
			public void m2(){
			System.out.println(new MethodLocalClass2().x);
			System.out.println(y);
			}
		}
			Inner i = new Inner();
			i.m2();
	}
	
	public static void main(String[] args){
		
		MethodLocalClass2 obj = new MethodLocalClass2();
		obj.m1();
		
	}

}
