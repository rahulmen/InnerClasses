package InnerClasses;

public class SwitchStatement {
	
	public static void main(String[] args){
		
		int x = 10;
		
		switch(x){
		
		
		case 0: System.out.println(0);
		case 1: System.out.println(1);
		case 2: System.out.println(2);
				break;
		case 3 : System.out.println(3);
		default: System.out.println("def");
		}
		
		for(int i =0;i<10;i++){
			System.out.println(i);
			if(i==7){
				break;
			}
		}
		
		li:
		{
			System.out.println("Begin");
			if(x==10)
				break li;

			System.out.println("End");
		}
		System.out.println("Hello");
		
		while(x>1){
			if(x==4){
				break;
			}
			System.out.println(x);
			
			x--;
		}
	}

}
