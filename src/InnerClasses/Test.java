package InnerClasses;

class Test {
	
	public static void main(String... args)
	{
		Outer2 o = new Outer2();
		Outer2.Inner i = o.new Inner();
		i.m1();
		
	}
}
 