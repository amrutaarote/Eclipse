package Emp;

public class Switch {

	public static void main(String[] args) {
	
		char switchChar = 'G' ; 
		
		switch(switchChar) { 
			case 'A':
				System.out.println("Value is A");
				break;
			case 'B': 
				System.out.println("Value is B");
				break;
			case 'C': 
				System.out.println("Value is C");
				break;
			case 'D':
				System.out.println("Value is D");
				break;
				
			case'E':case 'F': case 'G':
				System.out.println( switchChar+ " value was found" );
				break;
				
				default:
					System.out.println("None of these");
				break;
		}
	}
		
}
