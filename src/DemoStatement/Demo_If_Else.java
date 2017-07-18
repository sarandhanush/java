package DemoStatement;

public class Demo_If_Else {
// declare & initialize int variables
	static int a = 5, b = 5,c = 5;
//	declare a main method
	public static void main(String[] args) {
//  to declare a if condition
		if(a>b && a>c) {
		System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater");
			}
		else if(c>b && c>a) {
			System.out.println("c is greater");
			}
		else if(a==b && a==c) {
			System.out.println("A & B & C is equal");
			}
		else if(a==b) {
			System.out.println("A & B is equal");
			}
		else if(b==c) {
			System.out.println("B & C is equal");
			}
		else {
			System.out.println("C & A are equal");
		}
			
			
	}

}
