package InnerClasses;


class MethodLocalClass3 {

	int x = 10;

	class Inner{

		int x = 20;

		public void m1(){
			final  int x = 30;
			System.out.println("m1 method of Inner Class");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(MethodLocalClass3.this.x);

			class MethodInner{

				public void m2(){
					System.out.println("===========================");
					System.out.println("m2 method of Method Inner class");
					System.out.println(x);
					System.out.println(Inner.this.x);
					System.out.println(MethodLocalClass3.this.x);
				}
			}
			MethodInner obj3 = new MethodInner();
			obj3.m2();

		}

	}


	public static void main(String[] args){

		MethodLocalClass3 obj = new MethodLocalClass3();
		MethodLocalClass3.Inner obj1 = obj.new Inner();
		obj1.m1();


	}


}


