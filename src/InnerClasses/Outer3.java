package InnerClasses;

class Outer3 {
	int x= 10;
	static  int y = 20;

 class Inner{
	  int x = 1000000;
	  
	 class Inner2{
		 
		 int x=100;


			public void m1(){

				int x = 1000;
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(Outer3.this.x);
				System.out.println(Inner.this.x);
 
		 
	 }
		



		}
	}

	public static void main(String[] args){
		Outer3 o = new Outer3();
		Outer3.Inner i = o.new Inner();
		Inner.Inner2 i2 = i.new Inner2();
		i2.m1();
		
	
	}

}
