package InnerClasses;

public class NestedBreakAndContinue {
	
	public static void main(String[] args){
		l1:
		for(int i=0;i<3;i++){
			l2:for(int j=0;j<3;j++){
				
				if(i==j){
			break l2;
				}
				System.out.println(i + "--------" + j);
				
			}
		}
		
	}

}
