package DemoStatement;

public class Demo_While { 
	public static void main(String[]args) {
		int a=10;
//		while loop  true condition statement
		while(a>5) {
			System.out.println("Value of a is " 
					+a);
			a--;
		}
// while loop false condition statement
		while(a<5) {
			System.out.println(a);
		}
		System.out.println("Condition is false So,Not Enter into loop");
	}

}
