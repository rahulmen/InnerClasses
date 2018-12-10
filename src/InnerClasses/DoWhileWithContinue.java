package InnerClasses;

public class DoWhileWithContinue {
	
	public static void main(String... args){
		
		
		int x =0;
		
		do{
			x++;
			System.out.println(x);
			if(++x<3){
				continue;
			}
			System.out.println(x);
		}
		while(++x<10);
	}

}
