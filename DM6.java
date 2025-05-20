package DecisionMaking;

public class DM6 {
	public static void main(String[] args) {
		final int j=9;
		
		int a=4;
		int n=9;
		switch(n) {
			case 2: System.out.println("Hi"); break;
			//case a: System.out.println("hello"); break; //error
			case j: System.out.println("hello"); break;
		}
	}

}