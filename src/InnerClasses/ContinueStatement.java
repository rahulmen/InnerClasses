package InnerClasses;

public class ContinueStatement {

	public static void main(String[] args){
		
		int x = 20;
		
		for(int i=0;i<10;i++){
			if(i%2==0)
				continue;
				System.out.println(i);
			}
		
	
		while(x>3){
			x--;
			if(x%2==0){
				System.out.println(x);
				continue;
			}
			
		}
		
	}
	
}
